import java.util.Scanner;

public class Demo19
{
    public static void main(String []args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter 1st Dimensions length");
        int len1=scan.nextInt();
        int [][]arr1=new int[len1][];
        for (int i=0;i<=arr1.length-1;i++)
        {
            System.out.println("Enter the second dimension length of 1st dimension"+i);
            int len2=scan.nextInt();
            arr1[i]=new int[len2];
        }
        for (int i=0;i<=arr1.length-1;i++)
        {
            for (int j=0;j<=arr1[i].length-1;j++)
            {
                System.out.println("Enter the marks of college"+i+"and student"+j);
                arr1[i][j]=scan.nextInt();
            }
        }
        for (int i=0;i<=arr1.length-1;i++)
        {
            for (int j=0;j<=arr1[i].length-1;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
