// this program will let the user input employees. It will correct the if the enter letters instead of the options showed
// the program will let the user know the salary of employees per week, depending on their title of the job.


import java.io.FileNotFoundException;

public class Driver
{

    public static void main(String[] args) throws FileNotFoundException {
        EmployeeManager mgr = new EmployeeManager();
        mgr.run();

    }

}
