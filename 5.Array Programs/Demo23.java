import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo23 {
    //! Brute Force Approach
    public static int[] RearrangebySign(int[] A, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            if (A[i] > 0)
                pos.add(A[i]);
            else
                neg.add(A[i]);
        }
        // consist of an equal number of positive and negative integers.(n/2)
        for (int i = 0; i < n / 2; i++) {

            A[2 * i] = pos.get(i);
            A[2 * i + 1] = neg.get(i);
        }

        return A;
    }
    //? Time Complexity:  O(N+N/2)

    //! Optimal Approach
     public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

        // positive elements start from 0 and negative from 1.
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            // Fill negative elements in odd indices and inc by 2.
            if (A.get(i) < 0) {
                ans.set(negIndex, A.get(i));
                negIndex += 2;
            }

            // Fill positive elements in even indices and inc by 2.
            else {
                ans.set(posIndex, A.get(i));
                posIndex += 2;
            }
        }

        return ans;
    }
    //? Time Complexity: O(n)

    public static void main(String args[]) {
        /* int n = 4;
        int A[] = { 1, 2, -4, -5 };

        int[] ans = RearrangebySign(A, n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        } */


        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, -4, -5));
        ArrayList<Integer> ans = RearrangebySign(A);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

    }
}
