public abstract class Employee {

    long empId;

    public Employee() {
    }

    public Employee(long empId) {
        this.empId = empId;
    }

    public Paycheck calcCompensation(int month, int year) {
        return new Paycheck(calcGrossPay(month, year), .23, .05, .01, .03, .075);
    }

    public abstract double calcGrossPay(int month, int year);
}
