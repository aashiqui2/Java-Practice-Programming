//! Write a program to find the given number is strong number or not?
public class Demo11 {
    public static void main(String[] args) {
        isStrongNumber(145);
    }

    public static void isStrongNumber(int n) {
        int  temp=n;
        int sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            sum+=find_fact(rem);
            temp/=10;
        }
        System.out.println((n==sum)?"Strong Number":"Not a strong Number");
    }

    public static int find_fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * find_fact(n - 1);
        }
    }
}
