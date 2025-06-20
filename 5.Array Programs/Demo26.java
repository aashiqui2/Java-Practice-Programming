import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo26 {
    // ! Optimal Approach
    public static void nextPermutation(int[] nums) {
        int pivot = -1;
        int pivot2 = -1;
        // step 1: find pivot
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }
        // if there is no pivot
        if (pivot == -1) {
            reverse(nums, 0);
        }

        else {
            // step 2 find next greater element and swap with ind2
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] > nums[pivot]) {
                    pivot2 = i;
                    break;
                }
            }

            swap(nums, pivot, pivot2);
            // step 3 reverse the rest right half
            reverse(nums, pivot + 1);
        }
    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    //! Time Complexity: O(n)

    public static void main(String[] args) {
        int nums[] = { 1,2,3,6,5,4 };
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
