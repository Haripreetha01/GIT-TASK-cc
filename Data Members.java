// Data Members
    String name;
    int employeeId;
    double salary;

    // Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Example usage
        Employee employee1 = new Employee("John Doe", 101, 50000.0);
        employee1.displayDetails();
    }
}
