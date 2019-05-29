public class WageEmployee extends Employee
{

    public WageEmployee()
    {

    }

    public WageEmployee(String firstName,String lastName, double wage, double hoursWorked)
    {
        super(firstName,lastName, wage, hoursWorked);
    }

    public WageEmployee(String firstName, String lastName, double wage ) {
    }


    @Override
    public String toString()
    {
        return "WageEmployee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\''+
                ", wage=" + wage +
                ", hoursWorked=" + hoursWorked +
                '}';
    }


    @Override
    public double getWeeklyPay() // the math of the calculating the weekly pay
    {

        double temp = hoursWorked * wage;
        return temp;
        //return super.getWeeklyPay();
    }
}
