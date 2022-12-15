import java.util.Scanner;

import static java.lang.Math.pow;

public class Question1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of v");
        int v = sc.nextInt();
        System.out.println("enter the value of u");
        int u = sc.nextInt();
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of s");
        int s = sc.nextInt();

        float q = (float) ((pow(v,2) - pow(u,2)) / (2*a*s));
        System.out.println(q);


}
}