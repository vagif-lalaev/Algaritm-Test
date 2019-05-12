import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum two = new TwoSum();
        int[] tar = {1, 11, 2, 5};
        System.out.println(Arrays.toString(two.twoSum(tar, 9)));

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
