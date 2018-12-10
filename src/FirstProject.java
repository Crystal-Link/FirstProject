import java.util.Scanner;

public class FirstProject
{
    public static void main(String[] args)
    {
      /*
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");

        String firstName = myScanner.nextLine();
        String firstInitial = firstName.substring(0,1);

        System.out.println();

        System.out.print("Enter your last name: ");

        String lastName = myScanner.nextLine();

        System.out.println();

        System.out.print("Are you female? Answer true or false: ");
        boolean female = myScanner.nextBoolean();

        String title;
        if (female)
            title = "Ms. ";
        else
            title = "Mr. ";

        //String name = "Calvin";
        System.out.println("Hello " + title + firstInitial + " " + lastName + ".");
        System.out.println();

        System.out.print("Enter your age as a whole number: ");
        int age = myScanner.nextInt();
        System.out.println();
        //int age = 17;
        System.out.println("You are " + age + " years old.");
        System.out.println("Next year you are " + (age+1) + " years old.");
      */

        int[] numbers = new int[7];
        numbers[numbers.length-1] = 20;
        numbers[2] = 7;
        numbers[0] = 2;
        double average = avg(numbers);
        System.out.println("The average of the array " + (char)34 + "numbers" + (char)34 + " is " + average + ".");

        int[] otherNumbers = {3,7,2,5,0,11,10};
        double otherAvg = avg(otherNumbers);
        System.out.println("The average of the array " + (char)34 + "otherNumbers" + (char)34 + " is " + otherAvg + ".");
    }

    public static double avg(int[] values)
    {
        double total = 0;

        for(int i=0; i<values.length; i++)
        {
            total = total + values[i];
        }
        return total/values.length;
    }
}

//must build first in order to compile so you can run the class file.
//you can do ++age but not age++ because it will add one after the command runs
//every time you create a variable you gotta make it new
//library in java called java.lang(already set in)

//public static double avg(int[] values)  -- in front of the method, must put the return value


