//! Write a program to find the given number is armstrong or not?
public class Demo9 {
    public static void main(String[] args) {
        isArmstrong(153);
    }
    public static void isArmstrong(int n)
    {
        int temp=n;
        int sum=0;
        int count=find_count(n);
        while(temp!=0)
        {
          int rem=temp%10;
          sum=sum+(int)Math.pow(rem,count);
          temp=temp/10;
        }
        System.out.println((sum==n)?"Armstrong":"Not an Armstrong");
    }
    public static int find_count(int n)
    {
        int count=0;
        for(int i=n;i>0;i=i/10)
        {
            count++;
        }
        return count;
    }
}
