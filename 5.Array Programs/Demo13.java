public class Demo13 {
    public static void main(String[] args) {
        int N = 5;
        int a[] = { 1, 2, 4, 5 };

        int ans = missingNumber(a, N);
        System.out.println("The missing number is: " + ans);
    }
    // ! Brute force approach
    // public static int missingNumber(int[] a, int N) {
    // for (int i = 1; i <= N; i++) {
    // int flag = 0;
    // for (int j = 0; j < N - 1; j++) {
    // if (a[j] == i) {
    // flag = 1;
    // break;
    // }
    // }
    // if (flag == 0)
    // return i;
    // }
    // return -1;
    // }
    // ! Time Complexity: O(N2)

    // ! Approach 1: Using Hashing
    // public static int missingNumber(int []a, int N) {

    // int hash[] = new int[N + 1];

    // for (int i = 0; i < N - 1; i++){
    // hash[a[i]]++;
    // }

    // for (int i = 1; i <= N; i++) {
    // if (hash[i] == 0) {
    // return i;
    // }
    // }
    // return -1;
    // }
    // ! Time Complexity: O(N) + O(N) ~ O(2*N)

    // ! Approach 2: summation approach
    // public static int missingNumber(int []a, int N) {

    // int sum = (N * (N + 1)) / 2;
    // int s2 = 0;
    // for (int i = 0; i < N - 1; i++) {
    // s2 += a[i];
    // }

    // int missingNum = sum - s2;
    // return missingNum;
    // }
    // ! Time Complexity :O(N)

    //! Approach 3: XOR
    public static int missingNumber(int []a, int N) {

        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor1 = xor1 ^ (i + 1); 
            xor2 = xor2 ^ a[i];
        }
        xor1 = xor1 ^ N; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
    }
    //! Time complexity: O(n)

}
