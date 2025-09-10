abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r; Circle(double r){ this.r = r; }
    @Override double area(){ return Math.PI * r * r; }
}

public class Q20_PreferAbstractClasses {
    public static void main(String[] args){ System.out.println(new Circle(2).area()); }
}