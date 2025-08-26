// Reverse a string (in-place using char array)
public class ReverseString {
    public static void reverse(char[] s) {
        int i=0, j=s.length-1;
        while(i<j){
            char tmp = s[i];
            s[i]=s[j];
            s[j]=tmp;
            i++; j--;
        }
    }
    public static void main(String[] args){
        char[] s = "hello".toCharArray();
        reverse(s);
        System.out.println(new String(s)); // olleh
    }
}
