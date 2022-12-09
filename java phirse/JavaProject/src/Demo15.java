import java.util.Scanner;

public class Demo15
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        int arr[][][]=new int[3][3][4];
        for (int i=o;i<=arr.length-1;i++)
        {
            for (int j=o;j<=arr[i].length-1;j++)
            {
                for (int k=0;k<=arr[i][j].length-1;k++)
                {
                    System.out.println("enter the colleges"+i+"Branches"+j+"Students marks"+k);
                    arr[i][j][k]=scan.nextInt();
                }
            }
        }
        System.out.println("Array contents are");
        for (int i=0;i<=arr.length-1;i++)
        {
            for (int j=0;j<=arr[i].length-1;j++)
            {
                for (int k=0;k<=arr[i][j].length-1;k++)
                {
                    System.out.print(arr[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}
