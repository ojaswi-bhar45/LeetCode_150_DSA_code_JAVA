package Array_Traversal;

public class FindNumberWithEvenNumberOFDigit {

    public static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            int digits = 0;
            while(num > 0){
                num = num / 10;
                digits ++;
            }

            if(digits % 2 == 0){
                count ++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int[] nums2 = {555, 901, 482, 1771};

        int result = findNumbers(nums);
        int result2 = findNumbers(nums2);
        System.out.println(result);
        System.out.println(result2);

    }
}
