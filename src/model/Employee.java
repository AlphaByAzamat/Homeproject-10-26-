package model;

public class Employee {
    private String name;
    private String last_name;
    private int employee_id;
    private double per_hr_rate;

    public Employee(String name, String last_name, int employee_id, double per_hr_rate) {
        this.name = name;
        this.last_name = last_name;
        this.employee_id = employee_id;
        this.per_hr_rate = per_hr_rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public double getPer_hr_rate() {
        return per_hr_rate;
    }

    public void setPer_hr_rate(double per_hr_rate) {
        this.per_hr_rate = per_hr_rate;
    }
}
