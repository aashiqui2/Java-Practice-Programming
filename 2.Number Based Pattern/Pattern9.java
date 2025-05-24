public class Pattern9 {
    public static void main(String[] args) {
        int rows = 5;
        int num = 1;

        for (int i = 1; i <= rows; i++) {
            num += (i - 1);

            int current = num + i - 1;
            for (int j = 0; j < i; j++) {
                System.out.print(current-- + " ");
            }

            System.out.println();
        }
    }
}
