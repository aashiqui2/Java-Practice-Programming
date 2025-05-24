public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);
    }

    private static void pattern5(int n) {
        for(int row=1;row<=n;row++){
            for(int space=1;space<=2*(n-row);space++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
       
    }
    
}
/*
        *
      * *
    * * *
  * * * *
* * * * *
 */