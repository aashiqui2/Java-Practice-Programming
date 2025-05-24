public class Pattern16 {
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else{
            return n* fact(n-1);
        }
    }
    public static int combination(int n,int r)
    {
        return  fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(combination(i,k)+" ");
            }
            System.out.println();
        }
    }
}
