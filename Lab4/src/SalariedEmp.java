public class SalariedEmp extends Employee {

    double salary;

    public SalariedEmp(long empId, double salary) {
        super(empId);
        this.salary = salary;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return salary;
    }
}
