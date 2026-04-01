import java.util.Arrays;

public class Sequence {
    public boolean isPermutationOf(int[] one,  int[] two) {
        if (one.length != two.length) {
            return false;
        }
        int[] copyOne = Arrays.copyOf(one, one.length);
        int[] copyTwo = Arrays.copyOf(two, two.length);
        Arrays.sort(copyOne);
        Arrays.sort(copyTwo);

        for (int i = 0; i < copyOne.length; i++) {
            if (copyOne[i] != copyTwo[i]) {
                return false;
            }
        }
        return true;
    }
}

