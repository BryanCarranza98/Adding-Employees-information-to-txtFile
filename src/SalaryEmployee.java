public class SalaryEmployee  extends Employee
{

    public SalaryEmployee()
    {
    }

    public SalaryEmployee(String firstName, String lastName, double wage, double hoursWorked)
    {
        super(firstName,lastName, wage, hoursWorked);
    }

    public SalaryEmployee(String firstName, String lastName, double wage ) {
    }


    @Override
    public String toString() // overides the employee string
    {
        return "SalaryEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\''+
                ", wage=" + wage +
                ", hoursWorked=" + hoursWorked +
                '}';
    }


    @Override
    public double getWeeklyPay() // the math of the calculating the weekly pay
    {
        double temp = wage / 52;
        return temp;
        //return super.getWeeklyPay();
    }
}
