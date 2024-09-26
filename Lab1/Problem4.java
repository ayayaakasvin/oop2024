package Lab1;

import Practice2.Student;
import java.util.Random;

class Course {
    String name;
    String description;
    Integer creditsNumber;
    String prerequisite;

    Course () {

    }
}

class GradeBook {
    Student[] StudentList;
    Course course = new Course();

    GradeBook (String courseName, String description, Integer credits, String pre, Student[] list) {
        this.course.name = courseName;
        this.course.description = description;
        this.course.creditsNumber = credits;
        this.course.prerequisite = pre;
        this.StudentList = list;
    }

    public void displayMessage () {
        System.out.printf("Welcome to the grade book for %s %s!\n", this.course.name, this.course.description);
    }

    public void displayGradeReport () {
        System.out.println("Grades for students: ");
        for (Student student : StudentList) {
            student.PropertyPrint();
        }

        System.out.printf("Class average is %.2f.\n", getAverageGrade());
        Student lowest = getLowest();
        System.out.printf("Lowest grade is %d (Student %s, id:  %d)\n", lowest.GetGrade(), lowest.GetName(), lowest.GetId());
        Student greatest = getGreatest();
        System.out.printf("Highest grade is %d (Student %s, id:  %d)\n", greatest.GetGrade(), greatest.GetName(), greatest.GetId());
    
        this.distribution();
    }

    private Double getAverageGrade () {
        if (StudentList.length == 0) {
            return 0.0;
        }

        Double sum = 0.0;
        for (Student student : StudentList) {
            sum += student.GetGrade();
        }

        return sum / (StudentList.length);
    }

    private Student getLowest () {
        if (StudentList.length == 0) {
            return null;
        }

        Student lowest = StudentList[0];

        for (Student student : StudentList) {
            if (lowest.GetGrade() > student.GetGrade()) {
                lowest = student;
            }
        }

        return lowest;
    }

    private Student getGreatest () {
        if (StudentList.length == 0) {
            return null;
        }

        Student greatest = StudentList[0];

        for (Student student : StudentList) {
            if (greatest.GetGrade() < student.GetGrade()) {
                greatest = student;
            }
        }

        return greatest;
    }

    private void distribution () {
        int[] distrubutionArray = new int[11];

        for (Student student : StudentList) {
            int grade = student.GetGrade();

            if (grade == 100) {
                distrubutionArray[10]++;
            } else {
                distrubutionArray[grade / 10]++;
            }
        }

        for (int i = 0, j = 0; i < 100 ; i+=10, j++) {
            StringBuilder studentCount = new StringBuilder(); // we should add '*' to builder
            for (int k = 0; k < distrubutionArray[j]; k++) {
                studentCount.append('*');
            }
            

            System.out.printf("%02d-%02d: %s\n", i, i + 9, studentCount.toString());
        }

        StringBuilder studentCount = new StringBuilder(); // we should add '*' to builder
        for (int k = 0; k < distrubutionArray[10]; k++) {
            studentCount.append('*');
        }
        System.out.printf("100: %s\n", studentCount.toString());
    }
}

class GradeBookTest {
    public static void main(String[] args) {

        Student[] liStudents = new Student[10];
        Character a = 'A';
        Random rand = new Random();
        for (int i = 0; i < liStudents.length; i++) {
            liStudents[i] = new Student((a++).toString(), i, rand.nextInt(101));
        }

        GradeBook gb = new GradeBook("CSCI2105", "Algorithm and Data Structures", 5, "CSCI1204", liStudents);

        gb.displayMessage();
        gb.displayGradeReport();
    }
}