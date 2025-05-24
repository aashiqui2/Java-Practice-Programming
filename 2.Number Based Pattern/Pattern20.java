public class Pattern20 {
    public static void main(String[] args) {
        int n = 4;
        int size = 2 * n - 1;
        int arr[][] = new int[size][size];

        for (int i = n; i > 0; i--) {
            int x = n - i, y = size - n + i - 1;
            for (int j = x; j <= y; j++) {
                arr[x][j] = i;
                arr[y][j] = i;
                arr[j][x] = i;
                arr[j][y] = i;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
