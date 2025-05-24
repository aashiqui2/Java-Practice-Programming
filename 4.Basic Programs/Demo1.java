//! Write a program to find the count of digit?
public class Demo1 {
    public static void main(String[] args) {
        find_count(153);
    }
    public static void find_count(int n)
    {
        /* int count=0;
        for(int i=n;i>0;i=i/10)
        {
            count++;
        }
        System.out.println(count); */
        //! By Taking Logarithm
        
        System.out.println((int)Math.log10(n)+1);
    }
}
