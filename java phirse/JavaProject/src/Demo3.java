import java.util.Scanner;

public class Demo3
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
                int arr[]=new int[5];
        for (int i=0; i<=arr.length-1; i++)
        {
            System.out.println("enter marks of student"+i);
            arr[i] =scan.nextInt();
        }
        System.out.println("Array contents arr");
        for (int i=0; i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
