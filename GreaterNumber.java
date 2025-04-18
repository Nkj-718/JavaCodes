import java.util.Scanner;

public class GreaterNumber {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int a,b,c;
        System.out.println("Enter any 3 integers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if(a>=b && a>=c)
        {
            System.out.println(a + " is the largest given number.");
        }
        else if (b>=c) 
        {
            System.out.println(b + " is the largest given number.");
        }
        else
        {
            System.out.println(c + " is the largest given number.");
        }

        scanner.close();
    }
}
