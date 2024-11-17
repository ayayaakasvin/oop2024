package Lab3.forth;

import java.util.Comparator;

public class EmployeeComparator {
    public static final Comparator<Employee> BY_NAME = Comparator.comparing(Person::getName);

    public static final Comparator<Employee> By_HIRE_DATE = Comparator.comparing(Employee::getHireDate);
}