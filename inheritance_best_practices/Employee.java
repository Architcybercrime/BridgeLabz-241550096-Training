class Employee {
    static String companyName = "TechCorp";
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Anshika", 101, "Manager");
        e1.displayDetails();
        Employee.displayTotalEmployees();
    }
}