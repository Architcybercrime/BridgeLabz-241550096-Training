// Check if integer is palindrome without using extra space by reversing half
public class Palindrome {
    public static boolean isPalindrome(int x) {
        if (x<0 || (x%10==0 && x!=0)) return false;
        int rev = 0;
        while (x>rev) {
            rev = rev*10 + x%10;
            x /= 10;
        }
        return x==rev || x==rev/10;
    }
    public static void main(String[] args){
        System.out.println(isPalindrome(121)); // true
        System.out.println(isPalindrome(-121)); // false
    }
}
