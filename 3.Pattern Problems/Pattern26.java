public class Pattern26 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i <n; i++) {
            for (char ch = (char) ('E' - i); ch >= 'A'; ch--) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }
}
