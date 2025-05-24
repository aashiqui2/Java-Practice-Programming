public class Pattern19 {

    public static void main(String[] args) {
        int SIZE = 4;
        int arr[][] = new int[SIZE][SIZE];
        int num = 1;

        for (int d = 0; d < 2 * SIZE - 1; d++) {
            int row_start = (d < SIZE) ? 0 : d - SIZE + 1;
            int col_start = (d < SIZE) ? d : SIZE - 1;

            for (int i = row_start, j = col_start; i < SIZE && j >= 0; i++, j--) {
                arr[i][j] = num++;
            }
        }

        // Print the matrix
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}