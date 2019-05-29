public class ExecutiveEmployee extends Employee
{
    public ExecutiveEmployee()
    {

    }

    public ExecutiveEmployee(String firstName, String lastName,double wage, double hoursWorked)
    {
        super( firstName,lastName, wage, hoursWorked);
    }

    public ExecutiveEmployee(String firstName, String lastName, double wage ) {
    }

    @Override
    public String toString() {
        return "ExecutiveEmployee{" +
                "name='" + firstName + '\'' +
                ", lastName='" + lastName + '\''+
                ", wage=" + wage +
                ", hoursWorked=" + hoursWorked +

                '}';
    }


    @Override
    public double getWeeklyPay( ) // the math of the calculating the weekly pay
    {
        double temp = wage / 52 + 1000;
        return temp;

    }
}
