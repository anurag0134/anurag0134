import java.util.Scanner;

public class Swapping
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
                int a;
        int b;
        int help;
        System.out.println("enter 2 number");
        a= scan.nextInt();
        b= scan.nextInt();
        System.out.println("contents before swapping");
        System.out.println(a+" "+b);
        help=a;
        a=b;
        b=help;
        System.out.println("contents ater swapping");
        System.out.println(a+" "+b);
    }
}
