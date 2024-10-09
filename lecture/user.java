package lecture;

class User {
    protected int id;
    protected String login;
    protected String password;
    protected String name;
    protected String surname;
    protected String role;

    {
        id = -1;
        login = null;
        password = null;
        name = null;
        surname = null;
        role = "undefined";
    }

    User (){};
    User (int id, String login, String password, String name, String surname)  {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    User (int id, String login, String password, String name, String surname, String role)  {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.role = role;
    }

    public String getData () {
        return this.toString();
    }

    @Override
    public String toString () {
        return String.format("ID : %d\nLogin : %s\nName : %s\nSurname : %s", this.id, this.login, this.name, this.surname);
    }
}

class Staff extends User {
    Double salary;
    String subject;

    {
        salary = 0.0;
        subject = null;
        role = "Teacher";
    }

    Staff (int id, String login, String password, String name, String surname, Double salary, String subject) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.subject = subject;
    }

    @Override
    public String getData() {
        // TODO Auto-generated method stub
        return  toString();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("\nSalary : %.2f\nSubject : %s", this.salary, this.subject);
    }
}

class Student extends User {
    Double gpa;
    String cources[];

    {
        gpa = 0.0;
        cources = null;
        role = "Student";
    }

    Student (int id, String login, String password, String name, String surname, Double gpaDouble, String[] cources) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.gpa = gpaDouble;
        this.cources = cources;
    }
    
    @Override
    public String getData() {
        // TODO Auto-generated method stub
        return  toString();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + String.format("\nGPA : %.2f\nSubject : %s", this.gpa, String.join(", ", this.cources));
    }
}

class Main {
    public static void main(String[] args) {
        User[] usersArray = new User[5];
        String[] coursesses = {"ADS", "OOP", "CA"};

        usersArray[0] = new User();
        usersArray[1] = new User(1, "Nurik", "123", "Nurzhalgas", "Kozhamseit");
        usersArray[2] = new User(2, "Andruha3000", "345", "Andrey", "Kozlov", "Teacher");
        usersArray[3] = new Staff(3, "GIGACHAD", "420", "John", "Doe", 15000.0, "ADS");
        usersArray[4] = new Student(4, "Mog", "789", "Aisulu", "Suindik", 4.00, coursesses);

        for (User user : usersArray) {
            System.out.println(user.getData());
            System.out.println();
        }
    }
}