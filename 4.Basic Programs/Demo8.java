//! Write a program to reverse the given Number?
public class Demo8 {
    public static void main(String[] args) {
        reverse(1234);
    }
    public static void reverse(int n)
    {
        int rev=0;
        int temp=n;
        while(temp!=0)
        {
         int rem=temp%10;
         rev=(rev*10)+rem;
         temp=temp/10;   
        }
        System.out.println(rev);
    }
}
