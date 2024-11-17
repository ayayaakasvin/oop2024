package Lab3.forth;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    private double salary;
    private Date hireDate;
    private String nationalInsuranceNumber;

    public Employee (String name, double salary, Date hireDate, String nationalInsuranceNumber) {
        super(name);
        setSalary(salary);
        setHireDate(hireDate);
        setNationalInsuranceNumber(nationalInsuranceNumber);
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) throws IllegalArgumentException {
        if (salary < 0.0) {
            throw new IllegalArgumentException("negative salary");
        }
        
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return Double.compare(salary, other.salary) == 0 &&
               nationalInsuranceNumber.equals(other.nationalInsuranceNumber) &&
               hireDate.equals(other.hireDate);
    }

    @Override
    public String toString() {
        return super.toString() +
               String.format(", salary=%.2f, hireDate=%s, insuranceNumber=%s",
                       salary, hireDate, nationalInsuranceNumber);
    }
    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.hireDate = (Date) this.hireDate.clone();

        return cloned;
    }
}
