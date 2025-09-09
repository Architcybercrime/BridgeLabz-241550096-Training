class ParentOV { void greet(){ System.out.println("Hello from parent"); } }
class ChildOV extends ParentOV { @Override void greet(){ System.out.println("Hello from child"); } }

public class Q17_UseOverrideAnnotation {
    public static void main(String[] args){ new ChildOV().greet(); }
}