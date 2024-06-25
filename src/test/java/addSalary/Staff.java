package addSalary;

import java.time.LocalDate;

public class Staff {
    private String name;
    private int salary;
    private LocalDate hireDate;
    public int workDate;

    public Staff(String name, int salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        setWorkDate(DateUtil.betweenMonths(hireDate));
    }

    public Staff() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getWorkDate() {
        return workDate;
    }

    public void setWorkDate(int workDate) {
        this.workDate = workDate;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", workDate=" + workDate +
                '}';
    }
}
