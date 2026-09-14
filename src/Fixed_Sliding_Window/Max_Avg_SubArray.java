package Fixed_Sliding_Window;

public class Max_Avg_SubArray {
    public static  double findMaxAverage(int[] nums, int k) {
    int left = 0;
    int n  = nums.length;
    double ans = 0;
    double window = 0;

    for(int i = 0 ; i < k; i++){
        window += nums[i];
    }
    ans = window/k;

    for(int right = k; right < n; right++){
        window += nums[right] - nums[right - k];

        ans = Math.max(ans, window/k);
    }

    return ans;
    }
    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3};
        int k = 4;

        int[] nums2 = {5};
        int k2  = 1;

        System.out.println(findMaxAverage(nums, k));
        System.out.println(findMaxAverage(nums2, k2));
    }
}
