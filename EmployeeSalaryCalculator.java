package myPackage;

public class EmployeeSalaryCalculator {
    public static double salaryCalculator(double hoursPerWeek, double amountPerHours, double vacationDays) {

        double weeklySalary = hoursPerWeek * amountPerHours;
        double unpaidTime = vacationDays * amountPerHours * 8;
        return (weeklySalary *52) - unpaidTime;

    }


    public static void main(String[] args) {
        double salary = salaryCalculator ( 42,20,13 );
        System.out.println (salary);

    }
}
