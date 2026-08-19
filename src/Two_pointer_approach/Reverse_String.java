//https://leetcode.com/problems/reverse-string/description/
//344
package Two_pointer_approach;

public class Reverse_String {
    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left ++;
            right --;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        System.out.println("Before: " + java.util.Arrays.toString(s));
        reverseString(s);
        System.out.println("After:  " + java.util.Arrays.toString(s));
    }
}
