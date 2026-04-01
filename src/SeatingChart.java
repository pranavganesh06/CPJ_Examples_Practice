import java.util.Scanner;

public class SeatingChart
{
    private int[][] seats;


    public SeatingChart(int[][] seats)
    {
        this.seats = seats;
    }


    public void printSeats()
    {
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }


    public void sellSeatByNumber()
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter row (0-8): ");
        int row = in.nextInt();

        System.out.println("Enter column (0-9): ");
        int col = in.nextInt();


        if (row < 0 || row >= seats.length || col < 0 || col >= seats[0].length)
        {
            System.out.println("Invalid seat location.");
        }
        else if (seats[row][col] == 0)
        {
            System.out.println("Seat already sold!");
        }
        else
        {
            seats[row][col] = 0;
            System.out.println("Seat sold!");
        }
    }


    public void sellSeatByPrice(int price)
    {
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                if (seats[i][j] == price)
                {
                    seats[i][j] = 0;
                    System.out.println("Seat sold at row " + i + ", col " + j);
                    return;
                }
            }
        }

        System.out.println("No seat available at that price.");
    }
}