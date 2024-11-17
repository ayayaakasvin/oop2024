package Lab3.forth;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee implements Cloneable {
    private Vector<Employee> team;
    private double bonus;

    public Manager (String name, double salary, Date hireDate, String nationalInsuranceNumber, double bonus) {
        super(name, salary, hireDate, nationalInsuranceNumber);
        this.team = new Vector<Employee>();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Vector<Employee> getTeam () {
        return team;
    }

    public void setTeam (Vector<Employee> team) {
        this.team = team;
    }

    public boolean addToTeam (Employee emp) {
        return team.add(emp);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", bonus=%.2f, teamSize=%d", bonus, team.size());
    }

    @Override
    protected Manager clone() throws CloneNotSupportedException {
        Manager cloned = (Manager) super.clone();
        cloned.team = (Vector<Employee>) this.team.clone();
        return cloned;
    }
}
