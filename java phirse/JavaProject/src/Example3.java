public class Example3
{
    public static void main(String []args)
    {
        String s1=new String("Omkar");
        String s2=new String("Omkar");
        if(s1==s2)
        {
            System.out.println("References are equals");
        }
        else
        {
            System.out.println("References are unequal");
        }
    }
}
