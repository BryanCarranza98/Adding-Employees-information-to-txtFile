import org.junit.Assert;
import org.junit.Test;

public class TestEmployee
{



    @Test
    public void TestSalaryEmployeePay()                // this is a test to test the unit
    {
        //wage / 52; just to look at the formula

        SalaryEmployee temp = new SalaryEmployee("Sandy", "Beach", 45000.0);
        Assert.assertNotNull(temp); // Expected result
        Assert.assertEquals(865.38,temp.getWeeklyPay(), 0.01); // dealta = have precision
    }

    @Test
    public void TestWageEmployeePay()                // this is a test to test the unit
    {
        //hoursWorked * wage; just to look at the formula

        WageEmployee temp = new WageEmployee ("Paige", "Turner", 35.0);
        Assert.assertNotNull(temp); // Expected result
        Assert.assertEquals(1400.0,temp.getWeeklyPay(), 0.01); // dealta = have precision
    }

    @Test
    public void TestExecutiveEmployeePay()                // this is a test to test the unit
    {
        //wage / 52 + 1000; just to look at the formula

        ExecutiveEmployee temp = new ExecutiveEmployee ("Luke", "Smith", 1000.0);
        Assert.assertNotNull(temp); // Expected result
        Assert.assertEquals(1019.23,temp.getWeeklyPay(), 0.0001); // dealta = have precision
    }




}
