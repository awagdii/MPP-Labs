public class HourlyEmp extends Employee {
    double hourlyWage;
    double hoursPerWeek;


    public HourlyEmp(long empId, double hourlyWage, double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        return hourlyWage * hoursPerWeek * 4;
    }
}
