import java.util.Scanner;

public class Program3
{public static void main(String []args)
{
    Scanner scan=new Scanner(System.in);
    System.out.println("enter a string");
    String str=scan.nextLine();
    char cha[]=str.toCharArray();
    for (int i=0;i<=cha.length-1;i++)
    {
        System.out.print(cha[i]+" ");
    }
}
}
