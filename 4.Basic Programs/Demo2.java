//! Write a program to find the divisor of the given Number?
public class Demo2{
    public static void main(String[] args) {
        Divisor(60);
    }
    public static void Divisor(int n)
    {
        int div=2;
        while(div<=n/2)
        {
            if(n%div==0)
            {
                System.out.print(div+" ");
            }
            div++;
        }
    }
}


