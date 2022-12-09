import java.util.Scanner;

public class Demo10
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[7];
        for (int i=0;i<=arr.length-1;i++)
        {
            System.out.println("enter salary of employee");
            arr[i]=scan.nextInt();
        }
        System.out.println("Array contents are");
        for (int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
