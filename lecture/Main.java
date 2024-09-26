package lecture;

class Student {
    Integer id;
    String name;
    String surname;
    Double gpa;

    {
        id = 0;
        name = "";
        surname = "";
        gpa = 0.0;
    }

    Student () {

    }

    Student (int id, String name, String surname, Double gpa) {
        this.gpa = gpa;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    String getStudentData () {
        return String.format("Name: %s\nSurname: %s\nID: %d\nGPA: %.2f", this.name, this.surname, this.id, this.gpa);
    }

    public void topStudent (Student students[]) {
        Double minGpa = 0.0;
        Student topStud = students[0];
        for (Student student : students) {
            if (student.gpa > minGpa) {
                topStud = student;
                minGpa = student.gpa;
            }
        }
        System.out.printf("Best Student : \n");
        System.out.println(topStud.getStudentData());
    }
}

class Main {
    public static void main(String[] args) {
        Student[] someArray = new Student[5];
        someArray[0] = new Student(1, "Nurik", "Shurik", 3.22);
        someArray[1] = new Student(2, "John", "Doe", 1.00);
        someArray[2] = new Student(3, "Doni", "Peperoni", 4.00);
        someArray[3] = new Student(4, "Angelina", "Jolie", 3.8);
        someArray[4] = new Student(5, "Jokerge", "Tssk", 1.96);

        for (Student student : someArray) {
            System.out.println(student.getStudentData());
            System.out.println();
        }

        System.out.println();

        Student[] someArray2 = new Student[10];
        someArray2[0] = new Student(1, "Nurik", "Shurik", 3.22);
        someArray2[1] = new Student(2, "John", "Doe", 1.00);
        someArray2[2] = new Student(3, "Doni", "Peperoni", 4.00);
        someArray2[3] = new Student(4, "Angelina", "Jolie", 3.8);
        someArray2[4] = new Student(5, "Jokerge", "Tssk", 1.96);

        someArray2[5] = new Student(6, "Johnny", "Depp", 3.5);
        someArray2[6] = new Student(7, "Kianu", "Rivz", 1.05);
        someArray2[7] = new Student(8, "Antonio", "Pre", 2.69);
        someArray2[8] = new Student(9, "SomeOther", "Student", 0.42);
        someArray2[9] = new Student(10, "Quiet", "Kid", 3.95);

        Student someS = new Student();

        someS.topStudent(someArray2);
    }
}