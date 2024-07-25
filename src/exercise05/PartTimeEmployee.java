package exercise05;

public class PartTimeEmployee extends Employee {
    int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    public double getWorkingHours() {
        return workingHours;
    }
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
    public int calculateSalary() {
        return getPaymentPerHour() * workingHours;
    }

}
