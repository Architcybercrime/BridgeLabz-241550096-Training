class PersonBase {
    String name; int age;
    PersonBase(String name, int age) { this.name = name; this.age = age; }
}

class Teacher extends PersonBase {
    String subject;
    Teacher(String name, int age, String subject) { super(name, age); this.subject = subject; }
    void displayRole() { System.out.println(name + " is a Teacher of " + subject); }
}

class Student extends PersonBase {
    int grade;
    Student(String name, int age, int grade) { super(name, age); this.grade = grade; }
    void displayRole() { System.out.println(name + " is a Student in grade " + grade); }
}

class Staff extends PersonBase {
    String department;
    Staff(String name, int age, String department) { super(name, age); this.department = department; }
    void displayRole() { System.out.println(name + " is Staff in " + department + " department"); }
}

public class Q9_SchoolSystem {
    public static void main(String[] args) {
        new Teacher("Mr. Sharma", 40, "Math").displayRole();
        new Student("Ravi", 16, 10).displayRole();
        new Staff("Anita", 35, "Admin").displayRole();
    }
}