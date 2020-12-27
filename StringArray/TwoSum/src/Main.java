import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 4, 2 , 6, 8, 5};
 //       print(array);
 //       Arrays.sort(array);
        print(array);
        //int[] ans = twoSum(array, 10);
        int[] ans = twoSumWithHash(array, 10);

        print(ans);
    }

    // advantage that array nums don't need to be sorted
    private static int[] twoSumWithHash(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return new int[] {0, 0};
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[] { map.get(nums[i]), i + 1};
            } else {
                map.put(target - nums[i], i + 1);
            }
        }
        return new int[] {0, 0};
    }

    // this implementation wants numbers to be sorted
    public static int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0)
            return null;
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int x = numbers[i] + numbers[j];
            if (x < target) {
                i++;
            } else if (x > target) {
                j--;
            } else {
                return new int[] { i + 1, j + 1};
            }
        }
        return null;
    }
    public static void print(int[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
