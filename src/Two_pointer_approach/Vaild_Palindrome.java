package Two_pointer_approach;

public class Vaild_Palindrome {
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(!Character.isLetterOrDigit(s.charAt(left))){
                left ++;
            }
            while(!Character.isLetterOrDigit(s.charAt(right))){
                right --;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                    Character.toLowerCase(s.charAt(right))) {

                return false;
            }

            left++;
            right--;
        }
        return true;

    }
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";
        String s2 = " ";

        String res = String.valueOf(isPalindrome(s));
        String res2 = String.valueOf(isPalindrome(s2));
        System.out.println(res);
        System.out.println(res2);

    }
}
