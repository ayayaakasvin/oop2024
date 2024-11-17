package Lab3.forth;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee("Alice", 50000, new Date(2023, 1, 1), "ABC123");
        Employee emp2 = new Employee("Bob", 60000, new Date(2021, 5, 15), "XYZ456");
        Manager mgr = new Manager("Charlie", 80000, new Date(2022, 3, 10), "LMN789", 5000);

        mgr.addToTeam(emp1);
        mgr.addToTeam(emp2);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(mgr);

        System.out.println("Cloning Manager...");
        Manager clonedMgr = mgr.clone();
        System.out.println("Original Manager: " + mgr);
        System.out.println("Cloned Manager: " + clonedMgr);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp2);
        employees.add(emp1);
        employees.add(mgr);

        System.out.println("Sorting by name:");
        employees.sort(EmployeeComparator.BY_NAME);
        employees.forEach(System.out::println);

        System.out.println("Sorting by hire date:");
        employees.sort(EmployeeComparator.By_HIRE_DATE);
        employees.forEach(System.out::println);
    }
}
