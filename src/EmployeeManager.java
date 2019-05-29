import java.util.InputMismatchException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
import org.apache.logging.log4j.*;

public class EmployeeManager
{
    private static Logger logger = LogManager.getLogger(EmployeeManager.class); // just grab the name of the class

    private ArrayList<Employee> employees;
    Formatter output;


    private Scanner fin; // fin = FILE IN
    private Scanner cin;

    private static String DEFAULT_FILE_NAME="employee.txt";
    private String fileName;
    private String type;
    private String firstName;
    private String lastName;

    private double wage;
    public double hoursWorked;


    public EmployeeManager() throws FileNotFoundException
    {

        this(DEFAULT_FILE_NAME);
    }


    public EmployeeManager(String fileName) throws FileNotFoundException // IF PASS IT WILL GO HERE
    {
        employees = new ArrayList<Employee>(); // give no size
        this.fileName = fileName; // setting the name of file
        fin = new Scanner(new File(this.fileName));
        cin = new Scanner(System.in);
        readEmployeeFileData();
    }



    private void readEmployeeFileData()
    {

        while(fin.hasNext())  // while file has next entry
        {
            type = fin.next();
            firstName = fin.next();
            lastName = fin.next();
            wage = fin.nextDouble();

            logger.debug(type +" "+ firstName + lastName +" " + wage );
        ///////  Grabbed all the data
            addEmployee();
        }

        fin.close();
    }


    public void displayEmployee()
    {

        System.out.println("\n Current Employees: "); // current employees from the txt file
        for (Employee temp : employees)
        {
            System.out.println(temp.toString());
            logger.debug(temp.toString());
        }
    }


    public void run() throws FileNotFoundException
    {
        displayEmployee();
        displayPromptMenu();

    }

    private void displayPromptMenu() throws FileNotFoundException  //create keyboard utils if they enter a letter instead
                                                                   // of option listed.
    {
        int choice;
        boolean good = false;

        do {

            System.out.println(" ");
            System.out.print("Enter action: 1/add Employee, 2/Calc weekly pay , 3/Save employee , 4/Display, 5/QUIT : ");
            choice = (int) KeyboardUtils.getValidInteger();


                switch (choice) {

                    case 1:
                        promptAndAddEmployee();
                        break;

                    case 2:
                        WeeklyPay();
                        break;

                    case 3:
                        saveEmployee();
                        break;

                    case 4:
                        displayEmployee();
                        break;

                }



        } while(choice >=1 && choice < 5);




    }


    private void saveEmployee() throws FileNotFoundException // saving the employees to the file
    {

        output = new Formatter(new File(this.fileName));

        System.out.println("Current Employees:");
        for(Employee temp : employees)
        {
            logger.debug("-------> " + temp.getClass());
            type = temp.getClass().toString();
            type= type.substring(6,7).toUpperCase();


            System.out.println(temp.toString());
            //System.out.print(type);

            logger.debug("-------> " + type);
            output.format ("%s %s %s %.2f \n",type, temp.firstName,temp.lastName,
                    temp.wage);
        }
        output.close();
    }



    private void promptAndAddEmployee() // add the employees depending on the title
    {

        do{
            System.out.print("Enter the type: S/Salary, W/Wage, E/Executive: ");
            type = cin.next();
            type = type.toUpperCase().substring(0,1); // begin and end

        }while( !type.equals("S") && !type.equals("W") && !type.equals("E") );

        System.out.print("Enter employee first name: ");
        firstName = cin.next();

        System.out.print("Enter employee last name: ");
        lastName = cin.next();

        System.out.print("Enter employee wage : ");
        wage = cin.nextDouble();

        addEmployee();
    }



    private void WeeklyPay() // entering the hours worked
    {

        System.out.println("Enter the Weekly Hours For Employees: ");


        for (Employee temp : employees)
        {
            System.out.println(temp.toString());
            System.out.print("Enter weekly hours for " + temp.firstName + " " + temp.lastName + ":"); // output the name of employee hours calculating for
            hoursWorked = cin.nextDouble();
            temp.sethoursWorked(hoursWorked);
        }


        for(Employee temp : employees) // outputting the salary per week of employee entered
        {

            System.out.print("Weekly Pay for "+ temp.firstName + " " + temp.lastName + ": " + String.format("%.2f", temp.getWeeklyPay()) + "\n");

        }





    }


    private void addEmployee( ) // adding the employees
    {
        switch (type)
        {
            case "S":

                employees.add(new SalaryEmployee(firstName,lastName, wage, hoursWorked ));
                break;

            case "W":

                employees.add(new WageEmployee(firstName,lastName, wage, hoursWorked));
                break;

            case "E":

                employees.add(new ExecutiveEmployee(firstName,lastName, wage, hoursWorked));
                break;
        }



    }












}

