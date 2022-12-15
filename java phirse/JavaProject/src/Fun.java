import java.util.Scanner;

public class Fun
{
    public static void main(String []args)

    {
        char operator;
        Double number1, number2, result;
        //creaate an object of Scanner class
        Scanner scan=new Scanner(System.in);
        //ask users to enter operator
        System.out.println("Choose an operator:+,-,*,or /");
        operator =scan.next().charAt(0);
        //ask users to enter numbers
        System.out.println("Enter first number");
        number1= scan.nextDouble();
        System.out.println("Enter second number");
        number2= scan.nextDouble();
        switch (operator)
        {
            //performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                  break;
                  //performs substraction bwtween numbers
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result );
                //performs multiplication between numbers
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
                //performs division between numbers
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

    }
}
