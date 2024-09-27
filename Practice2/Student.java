package Practice2;

public class Student {
    private String name;
    private Integer id;
    private Integer year_of_study = 0;
    private Integer grade;

    public Student (String name, Integer id, Integer grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void IncreamentYearOfStudying () {
        ++this.year_of_study;
        System.out.printf("Year of study increamented by 1, now it is %d", this.id);
    }

    public Integer GetGrade () {
        return this.grade;
    }

    public String GetName () {
        return this.name;
    }

    public Integer GetId () {
        return this.id;
    }

    public void PropertyPrint () {
        System.out.printf("Student %s : %d\n", this.GetName(), this.GetGrade());
    }

    public String toString () {
        return String.format("Student : %s, ID : %d, Year of Study : %d, Grade : %d", this.name, this.id, this.year_of_study, this.grade);
    }
}