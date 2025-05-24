public class Pattern4 {
    public static void main(String[] args) {
        pattern4(5);
    }

    private static void pattern4(int n) {
        for(int row=1;row<n*2;row++){
            int totalColInRow=row>n ? 2*n-row:row;
            for(int col=1;col<=totalColInRow;col++){
                System.out.print("* ");
            }                         
            System.out.println();  
        }
    }
}


