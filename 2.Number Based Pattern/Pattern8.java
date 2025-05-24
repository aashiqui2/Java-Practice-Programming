public class Pattern8 {
    public static void main(String[] args) {
        pattern4(5);
    }

    private static void pattern4(int n) {
        int k=1;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(k+ " ");
                k++;
            }
            System.out.println();
        }
    }
}


