//! Write a program to print the sum of digit?
public class Demo7 {
    public static void main(String[] args) {
        sum_of_digit(1234);
    }
    public static void sum_of_digit(int n){
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
