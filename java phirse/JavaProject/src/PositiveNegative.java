public class PositiveNegative
{
    public static void main(String []args)
    {
        double number = 12.3;
        //true if number is less than 0
        if (number < 0.0)
            System.out.println(number+"is a negative number.");
        //true if number is grater than0
        else if (number>0.0)
            System.out.println(number+"is positive number.");
        //if both test expression is evaluated to false
        else
            System.out.println(number + "is 0.");
    }
}