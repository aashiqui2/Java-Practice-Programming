import java.util.ArrayList;

public class Demo11 {
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,4,5,6};
        int b[]={2,3,3,5,6,6,7};
        ArrayList<Integer> intersection=findIntersection(a,b);
        System.out.println(intersection);
    }
    //! BruteForce approach
   /*  static ArrayList<Integer> findIntersection(int a[],int b[])
      {
        int vis[]=new int[b.length];
        ArrayList<Integer> result=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
            if (a[i] == b[j] && vis[j] == 0) {
                result.add(a[i]);
                vis[j] = 1;
                break;
            } else if (b[j] > a[i]) {
                break;
            }
        }
     }
        return result;
    } */
    //! Time Complexity: O(n^2)
    
    //! Optimal Approach
    static ArrayList<Integer> findIntersection(int a[],int b[])
    {
        ArrayList<Integer> result=new ArrayList<>();
        int i=0,j=0;
        int n=a.length,m=b.length;
        while(i<n &&j<m)
        {
            if(a[i]<b[j])
            {
                i++;
            }
            else if(b[j]<a[i]){
                j++;
            }
            else{
                result.add(a[i]);
                i++;
                j++;
            }
        }
        return result;

    }
    //! Time Complexity:O(n+m)

}
