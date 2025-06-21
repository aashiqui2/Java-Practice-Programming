import java.util.ArrayList;
import java.util.List;

public class Demo31 {

   public static List<Integer> printSpiral(int[][] mat) {
        
        List<Integer> ans = new ArrayList<>();
        
        int m = mat.length; // no. of rows
        int n = mat[0].length; // no. of columns
        
        int srow = 0, scol = 0, erow = m - 1, ecol = n - 1;

        while (srow<=erow &&scol<=ecol) {

            // For Top
            for (int i = scol; i <= ecol; i++){
                ans.add(mat[srow][i]);
            }

            // For right
            for (int i = srow+1; i <= erow; i++){
                ans.add(mat[i][ecol]);
            }

            // For bottom.
            for (int i = ecol-1; i >= scol; i--){
                if(srow==erow)
                {
                    break;
                }
                ans.add(mat[erow][i]);
            }

            // For left.
            for (int i = erow-1; i >= srow+1; i--){
                if(scol==ecol)
                {
                    break;
                }
                ans.add(mat[i][scol]);
            }

            srow++;scol++;erow--;ecol--;

        }
        return ans;
    }

    public static void main(String[] args) {

        // Matrix initialization.
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        List<Integer> ans = printSpiral(mat);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}
