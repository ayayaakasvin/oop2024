package Practice3.Problem2;

import java.util.Vector;
import java.util.Scanner;;

class Person {
    private String name;
    private String address;

    Person (String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName () {
        return name;
    }

    public String getAddress () {
        return name;
    }

    public void setAddress (String address) {
        this.address = address;
    }

    public String toString () {
        return String.format("Person[name=%s,address=%s]", name, address);
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    Student (String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram () {
        return program;
    }

    public void setProgram (String program) {
        this.program = program;
    }

    public int getYear () {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public double getFee () {
        return fee;
    }

    public void setFee (double fee) {
        this.fee = fee;
    }

    @Override
    public String toString () {
        return String.format("Student[%s, program=%s,year=%d,fee=%.2f]", super.toString(), program, year, fee);
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    Staff (String name, String address, String school, double pay) {
        super(name, address);
        this.pay = pay;
        this.school = school;
    }

    public String getSchool () {
        return school;
    }

    public void setSchool (String school) {
        this.school = school;
    }

    public Double getPay () {
        return pay;
    }

    public void setPay (double pay) {
        this.pay = pay;
    }

    @Override
    public String toString () {
        return String.format("Staff[%s, school=%s,pay=%.2f]", super.toString(), school, pay);
    }
}

class ShowInCase {
    public static void main(String[] args) {
        Vector<Person> people = new Vector<>();
        Scanner scan = new Scanner(System.in);

        // Creating Person objects
        Person person1 = new Person("John Doe", "123 Main St");
        Person person2 = new Person("Jane Smith", "456 Oak St");

        // Creating Student objects
        Student student1 = new Student("Alice Brown", "789 Pine St", "Computer Science", 2, 15000.00);
        Student student2 = new Student("Bob White", "101 Maple St", "Mathematics", 3, 12000.00);

        // Creating Staff objects
        Staff staff1 = new Staff("Mr. Johnson", "202 Elm St", "High School", 50000.00);
        Staff staff2 = new Staff("Ms. Wilson", "303 Cedar St", "College", 60000.00);

        people.add(person1);
        people.add(person2);
        people.add(student1);
        people.add(student2);
        people.add(staff1);
        people.add(staff2);

        gek: while (true) {
            System.out.println("\nEnter \"add\" to add a new Person");
            System.out.println("Enter \"print\" to print all Persons");
            System.out.println("Enter \"Q\" to quit");

            String input = scan.nextLine().trim().toLowerCase();

            switch (input) {
                case "add":
                    addPerson(people, scan);
                    break;

                case "print":
                    printPeople(people);
                    break;

                case "q":
                    System.out.println("Quit...");
                    break gek;

                default:
                    System.out.println("Invalid input. Please enter \"add\", \"print\", or \"Q\".");
                    break;
            }
        }

        scan.close();
    }

    private static void addPerson(Vector<Person> people, Scanner scan) {
        System.out.print("Enter name: ");
        String name = scan.nextLine().trim();

        while (name.isEmpty()) {
            System.out.print("Name cannot be empty. Please enter a valid name: ");
            name = scan.nextLine().trim();
        }

        System.out.print("Enter address: ");
        String address = scan.nextLine().trim();

        while (address.isEmpty()) {
            System.out.print("Address cannot be empty. Please enter a valid address: ");
            address = scan.nextLine().trim();
        }

        Person newPerson = new Person(name, address);
        people.add(newPerson);
        System.out.println("New Person added successfully: " + newPerson);
    }

    private static void printPeople(Vector<Person> people) {
        if (people.isEmpty()) {
            System.out.println("No persons to display.");
        } else {
            for (Person person : people) {
                System.out.println(person);
            }
        }
    }
}
