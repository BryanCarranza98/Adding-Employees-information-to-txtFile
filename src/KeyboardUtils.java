import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardUtils // catching the if entered a letter in one of the options
{

    public static int getValidInteger()
    {

        int choice =0;
        Scanner cin = new Scanner(System.in);
        boolean errorOccurred = false;


            do
                {
                    try {
                        errorOccurred = false; // seeing if the value is a number
                        choice = cin.nextInt();

                    } catch (InputMismatchException imex ) // catching if its NOT a number

                    {
                        cin.next();
                        errorOccurred = true;
                        System.out.println("Please Enter value between 1 and 5."); // outputting the message
                        System.out.print("Enter action: 1/add Employee, 2/Calc weekly pay , 3/Save employee , 4/Display, 5/QUIT : ");
                    }
                } while (errorOccurred);

            return choice;







    }



}


