import java.util.Scanner;

public class Demo18
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st dimensions length");
        int a=scan.nextInt();
        System.out.println("Enter 2nd dimension length");
        int b=scan.nextInt();
        int arr[][]=new int[a][b];
        System.out.println("Enter the marks");
        for (int i=0;i<=arr.length-1;i++)
        {
            for (int j=0;j<=arr[i].length-1;j++)
            {
                System.out.println("Enter the marks of college"+i+"Enter the marks of students"+j);
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Array contents are");
        for (int i=0;i<=arr.length-1;i++)
        {
            for (int j=0;j<=arr[i].length-1;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
