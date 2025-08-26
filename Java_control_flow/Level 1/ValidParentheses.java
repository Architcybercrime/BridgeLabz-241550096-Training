// Check for valid parentheses using stack
import java.util.*;
public class ValidParentheses {
    public static boolean isValid(String s) {
        Map<Character,Character> pairs = Map.of(')','(',']','[','}','{');
        Deque<Character> st = new ArrayDeque<>();
        for (char c: s.toCharArray()){
            if (pairs.containsValue(c)) st.push(c);
            else {
                if (st.isEmpty() || st.pop() != pairs.get(c)) return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        System.out.println(isValid("()[]{}")); // true
        System.out.println(isValid("(]")); // false
    }
}
