import java.util.Scanner;

public class Demo11
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int arr[][]=new int[4][3];
        for (int i=0;i<=arr.length-1;i++)
        {
            for (int j=0;j<=arr[i].length-1;j++)
            {
                System.out.print("enter the salary of company"+i+"and employee"+j);
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.print("Array contents are");
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
