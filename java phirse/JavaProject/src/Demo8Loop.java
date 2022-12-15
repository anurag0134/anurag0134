import java.util.Scanner;

public class Demo8Loop
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i=0;i<=4;i++)
        {
            System.out.println("enter marks of student"+i);
            arr[i]=scan.nextInt();
        }
        System.out.println("Array contents are");
        for (int i=0;i<=4;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
