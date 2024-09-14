package Practice2;

class Student {
    private String name;
    private Integer id;
    private Integer year_of_study = 0;

    public Student (String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public void IncreamentYearOfStudying () {
        ++this.year_of_study;
        System.out.printf("Year of study increamented by 1, now it is %d", this.id);
    }

    public String GetName () {
        return this.name;
    }

    public Integer GetId () {
        return this.id;
    }
}