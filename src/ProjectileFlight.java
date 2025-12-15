import java.util.Scanner;

public class ProjectileFlight
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        final double DELTA_T = 0.01;
        double veloc;

        System.out.println("Enter the initial velocity in m/sec: ");
        veloc = in.nextDouble();

        System.out.println("      Incremented   Calculated");
        System.out.println("      Distance     Distance");
        System.out.println("sec      (m)         (m)");

        final double G = 9.81;

        double s = 0;        // incremented distance (simulation)
        double v = veloc;    // current velocity
        int seconds = 0;

        double t = 0.0;

        // Print initial line at t = 0
        double calculated0 = -0.5 * G * t * t + veloc * t;
        System.out.printf("%2d %12.3f %12.3f%n", seconds, s, calculated0);

        // Run until the projectile returns to the ground
        while (s >= 0)
        {
            // Do 100 updates of 0.01s to make 1 second
            for (int i = 0; i < 100; i++)
            {
                s = s + v * DELTA_T;      // update position
                v = v - G * DELTA_T;      // update velocity
                t = t + DELTA_T;          // update time
            }

            seconds++;

            double calculated = -0.5 * G * t * t + veloc * t;

            // If we went below ground, stop (don’t print negative height line)
            if (s < 0) break;

            System.out.printf("%2d %12.3f %12.3f%n", seconds, s, calculated);
        }

        in.close();
    }
}
