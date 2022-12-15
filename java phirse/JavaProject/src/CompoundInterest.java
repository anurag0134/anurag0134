import java.util.Scanner;

public class CompoundInterest
{
    public static void main(String []args) {
        //declare variables
        double principal = 0.0, rate = 0.0, time = 0.0;
        int number = 0;
        double totalAmount = 0.0, cinterest = 0.0;
        //create object of Scanner class
        Scanner scan = new Scanner(System.in);
        //read inputs
        System.out.print("Enter principal amount::");
        principal=scan.nextDouble();
        System.out.print("Enter the annual compound"+"Interest rate::");
        rate=scan.nextDouble();
        rate=rate/100;//convert rate
        System.out.print("Enter time(inyears)::");
        time=scan.nextDouble();
        System.out.print("enter the number of times that"+"interest is compounded per year::");
        number=scan.nextInt();
        //calculate total amount
        totalAmount=principal*Math.pow(1+(rate/number),number*time);
        //claculate compound Interest
        cinterest=totalAmount-principal;
        //display results
        System.out.println("compound interest="+cinterest);
        System.out.println("Total amount="+totalAmount);
        //close Scanner class object
        scan.close();
    }
}
