package Lab3.fifth;

import java.util.Arrays;
import Lab3.forth.*;

public class Main {
    public static void main(String[] args) {
        // Test with Chocolate
        Chocolate[] chocolates = {
            new Chocolate("Snickers", 50.5),
            new Chocolate("Mars", 45.2),
            new Chocolate("Twix", 60.3)
        };

        System.out.println("Before Sorting Chocolates:");
        for (Chocolate chocolate : chocolates) {
            System.out.println(chocolate);
        }

        Sort.bubbleSort(chocolates);
        System.out.println("\nAfter Bubble Sort:");
        for (Chocolate chocolate : chocolates) {
            System.out.println(chocolate);
        }

        Time[] times = {
            new Time(2, 15, 30),
            new Time(1, 45, 10),
            new Time(3, 0, 5)
        };

        System.out.println("\nBefore Sorting Times:");
        for (Time time : times) {
            System.out.println(time);
        }

        Sort.bubbleSort(times);
        System.out.println("\nAfter Bubble Sort:");
        for (Time time : times) {
            System.out.println(time);
        }

         Employee[] employees = {
            new Employee("Alice", 50000, new java.util.Date(2023 - 1900, 1, 1), "INS123"),
            new Employee("Bob", 60000, new java.util.Date(2021 - 1900, 5, 15), "INS456"),
            new Employee("Charlie", 55000, new java.util.Date(2022 - 1900, 3, 10), "INS789")
        };

        System.out.println("\nBefore Sorting Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        Sort.bubbleSort(employees);
        System.out.println("\nAfter Bubble Sort:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
