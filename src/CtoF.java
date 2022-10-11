import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        boolean playing=true;
        double Celsius = 0;
        double Fahrenheit = 0;
        double convert = 0;
        String trash = "";
        Scanner in = new Scanner(System.in);

        do
        {


            System.out.print("\nEnter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                Celsius = in.nextDouble();
                in.nextLine();
                System.out.println("You said the temperature is: " + Celsius);
                convert = Celsius * 1.8;
                Fahrenheit = convert + 32;
                System.out.println("The temperature in Fahrenheit will be: " + Fahrenheit);
                playing=false;

            } else {
                trash = in.nextLine();
                System.out.println(trash + " is an invalid input for temperature. Try again.");

            }
        }
        while (playing);


    }
}
