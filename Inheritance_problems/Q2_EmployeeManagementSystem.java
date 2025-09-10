class Employee {
    String name; int id; double salary;
    Employee(String name, int id, double salary) {
        this.name = name; this.id = id; this.salary = salary;
    }
    void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); this.teamSize = teamSize;
    }
    @Override void displayDetails() { super.displayDetails(); System.out.println("Team Size: " + teamSize); }
}

class Developer extends Employee {
    String programmingLanguage;
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); this.programmingLanguage = programmingLanguage;
    }
    @Override void displayDetails() { super.displayDetails(); System.out.println("Programming Language: " + programmingLanguage); }
}

class Intern extends Employee {
    String university;
    Intern(String name, int id, double salary, String university) {
        super(name, id, salary); this.university = university;
    }
    @Override void displayDetails() { super.displayDetails(); System.out.println("University: " + university); }
}

public class Q2_EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] emps = {
            new Manager("Alice", 101, 80000, 10),
            new Developer("Bob", 102, 60000, "Java"),
            new Intern("Charlie", 103, 20000, "XYZ University")
        };
        for (Employee e : emps) { e.displayDetails(); System.out.println("---"); }
    }
}