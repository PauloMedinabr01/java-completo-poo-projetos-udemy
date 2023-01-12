package entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsourcedEmployee(String name, Integer hours, Double valeuPerHour, Double additionalCharge) {
        super(name, hours, valeuPerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
