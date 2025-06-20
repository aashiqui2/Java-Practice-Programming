import java.util.*;

public class Demo25 {
    // ! BruteForce Approach
    public static void recurPermute(int index, int[] nums, Set<List<Integer>> ans) {
        if (index == nums.length) {
            List<Integer> ds = new ArrayList<>();
            for (int num : nums) {
                ds.add(num);
            }
            ans.add(ds); 
            return;
        }

        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums); // backtrack
        }
    }

    public static void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static List<Integer> findNextPermutation(int[] nums) {
        Set<List<Integer>> uniquePermutations = new HashSet<>();
        recurPermute(0, nums, uniquePermutations);

        // Convert to list for sorting
        List<List<Integer>> permutations = new ArrayList<>(uniquePermutations);

        // Sort lexicographically
        permutations.sort((a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return 0;
        });

        // Convert input to list
        List<Integer> inputList = new ArrayList<>();
        for (int num : nums)
            inputList.add(num);

        // Find the next permutation
        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(inputList)) {
                return (i + 1 < permutations.size()) ? permutations.get(i + 1) : permutations.get(0);
            }
        }

        return new ArrayList<>(); // fallback
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 5 };

        List<Integer> nextPerm = findNextPermutation(nums);
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nextPerm.get(i);
        }

        System.out.println("Next greater permutation:");
        System.out.println(Arrays.toString(nums));
    }
}
