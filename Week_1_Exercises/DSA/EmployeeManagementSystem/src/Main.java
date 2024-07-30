public class Main {
    public static void main(String[] args) {
        EmpMngSys ems = new EmpMngSys(5);

        ems.addEmployee(new Employee("E001", "Alice", "Manager", 60000));
        ems.addEmployee(new Employee("E002", "Bob", "Developer", 50000));
        ems.addEmployee(new Employee("E003", "Charlie", "Designer", 45000));

        System.out.println();
        System.out.println("Employees after registering:");
        ems.displayEmployees();

        String searchId = "E002";
        Employee foundEmployee = ems.searchEmployee(searchId);
        if (foundEmployee != null) {
            System.out.println();
            System.out.println("Found Employee: " + foundEmployee);
        } else {
            System.out.println();
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        ems.deleteEmployee("E002");
        System.out.println();
        System.out.println("Employees after deletion:");
        ems.displayEmployees();

        ems.addEmployee(new Employee("E004", "David", "Tester", 40000));
        ems.addEmployee(new Employee("E005", "Eve", "HR", 55000));
        System.out.println();
        System.out.println("Employees after more registration:");
        ems.displayEmployees();

        ems.addEmployee(new Employee("E006", "Frank", "Analyst", 47000));
    }
}
