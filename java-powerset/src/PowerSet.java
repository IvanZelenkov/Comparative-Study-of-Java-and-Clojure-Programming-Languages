import java.util.List;
import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        int[] M = {1, 2, 3};
        findPowerSet(M);
    }

    public static void findPowerSet(int[] M) {
        // calculate the total number of subsets
        int N = (int) Math.pow(2, M.length);

        // generate each subset one by one
        for (int i = 0; i < N; i++) {
            List<Integer> set = new ArrayList<>();

            // check every bit of `i`
            for (int k = 0; k < M.length; k++)
                // if k'th bit of `i` is set, print `M[k]`
                if ((i & (1 << k)) != 0)
                    set.add(M[k]);

            System.out.println(set);
        }
    }
}