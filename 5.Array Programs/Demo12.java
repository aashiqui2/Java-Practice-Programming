import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo12 {
    public static void main(String[] args) {
        int a[]={4,9,5};
        int b[]={9,4,9,8,4};
        int res[]=findIntersection(a, b);
        System.out.println(Arrays.toString(res));
    }
    //! Two Pointer Approach
    /* public static int[] findIntersection(int nums1[],int nums2[])
    {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                set.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int k = 0;
        for (Integer num : set) {
            result[k++] = num;
        }
        return result;
    } */
    //! Time Complexity:O(n logn)

    /* static int[] findIntersection(int nums1[],int nums2[])
    {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i =0; i< nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++) {
           if(set.contains(nums2[j])) {
                res.add(nums2[j]);
                set.remove(nums2[j]);
            }
        }
        int[] arr = new int[res.size()];
        for (int i= 0; i < res.size(); i++){
            arr[i] = res.get(i);
        } 
            
        return arr;
    } */
    //! Time Complexity: O(m+n)

     static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums2);
        for (Integer num : nums1) {
            if (binarySearch(nums2, num)) {
                set.add(num);
            }
        }
        int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[i++] = num;
        }
        return result;
    }

    static boolean binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
    //! Time Complexity: O(n logn)
    
}
