import java.util.Scanner;
//use comparison operator to find out whether a given number is greater than the user entered number or not .
public class Question
{
    public static void main(String []args)
    {
        int a=5;
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter a number ");
            int b=scan.nextInt();
            boolean result;
            result=a>b;
            System.out.println(result);
        }
    }
}
