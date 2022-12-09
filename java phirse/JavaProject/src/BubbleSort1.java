import java.util.Scanner;

public class BubbleSort1
{
    public static void main(String []args)
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter array length");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array contents");
        for (int i=0;i<=arr.length-1;i++)
        {
            System.out.println("enter an element");
            arr[i]=scan.nextInt();
        }
        System.out.println("array contents before sorting");
        for (int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int help;
        for (int i=0;i<=n-1;i++)
        {
            for (int j=0;j<=n-2-i;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    help =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=help;
                }
            }
        }
        System.out.println("Array contents after sorting");
        for (int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
