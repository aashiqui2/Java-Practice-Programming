//! Write a program to find the given number neon and spy number?
public class Demo12 {
    public static void main(String[] args) {
        isNeon(9);
        isSpy(123);
    }
    public static void isNeon(int n)
    {
        int temp=n*n;
        int sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            sum+=rem;
            temp/=10;
        }
        System.out.println((sum==n)?"Neon":"Not an Neon");
    }
    public static void isSpy(int n)
    {
        int sum = 0;
        int product = 1;
        int rem;

        while (n != 0) {
            rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }

        System.out.println((sum==product)?"Spy":"Not a Spy");
    }
}
