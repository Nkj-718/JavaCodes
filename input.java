import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); //creating an object 'sc' of class 'Scanner' which has been imported in the first line to allow inputs.
       
        System.out.print("Enter your name: "); //print allows for same line input instead of pushing the next text on the next line.
        String name = sc.nextLine(); //'nextline' allows for space therefore allowing two words to be stored in a single string.
        System.out.print("Enter your email: ");
        String email = sc.next(); // 'next' does not allow space therefore allowing only 1 word.
        System.out.print("Enter your age: ");
        int age = sc.nextInt(); //'nextInt' allows a variable to store an integer value
        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble(); // 'nextDouble' allows a variable to store a integer value with a fractional part, such as 15.28.
        System.out.print("Enter an alphabet : ");
        char alphabet = sc.next().charAt(0); // There is no 'nextChar' available to store char value, so we are using 'charAt' function to only store the first character of a string.
        System.out.print("Are you a student? (True/False): ");
        boolean status = sc.nextBoolean(); //'nextBoolean' allows a variable to store either 'true' or 'false'.

        System.out.println(); //To give space of 1 line between inputs and output details.

        System.out.println("Student Details:- "); //'println' pushes the next upcoming text to the next line.
        System.out.println("Your name is " + name);
        System.out.println("Your email id is: " + email);
        System.out.println("You are " + age + " years old");
        System.out.println("You scored " + percentage + "%");
        System.out.println("You picked " + alphabet);
        if (status == true) 
        {
            System.out.println("You are a student");
        } 
        else 
        {
            System.out.println("You are NOT a student");
            
        }
        sc.close(); //It is a good practice to close an object.
    }
}
