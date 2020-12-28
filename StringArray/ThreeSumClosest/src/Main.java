import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {-1, 2, 1, -4};
        int target = 1;

        System.out.println("Closest sum: " + threeSumClosest(arr, target));
    }

    private static int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Target sum: " + target);
        int minDiff = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int j = i + 1;
            int k = arr.length - 1;
            while (j < k) {

                int curSum  = arr[i] + arr[j] + arr[k];
 //               System.out.println(curSum);
                if (curSum == target) {
                    return curSum;
                }
                if (curSum > target) {
                    k = k - 1;
                } else {
                    j = j + 1;
                }
                int curDiff = Math.abs(curSum - target);
                if (curDiff < minDiff) {
                    minDiff = curDiff;
                    result = curSum;
                }
            }
        }
        return result;
    }
}
