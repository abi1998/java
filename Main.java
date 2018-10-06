import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println();
        n = s.nextInt();
        if(n > 0)
        {
            System.out.println(" positive");
        }
        else if(n < 0)
        {
            System.out.println(" Negative");
        }
        else
        {
            System.out.println("zero");
        }
    }
}
