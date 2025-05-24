public class Pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int space=1;space<=i-1;space++)
            {
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
