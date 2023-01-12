package entities;

public class Employee {
    private String name;
    private Integer hours;
    private Double valeuPerHour;

    public Employee() {

    }

    public Employee(String name, Integer hours, Double valeuPerHour) {
        this.name = name;
        this.hours = hours;
        this.valeuPerHour = valeuPerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValeuPerHour() {
        return valeuPerHour;
    }

    public void setValeuPerHour(Double valeuPerHour) {
        this.valeuPerHour = valeuPerHour;
    }

    public double payment() {
        return hours * valeuPerHour;
    }
}
