import java.util.Scanner;

public class Test {

    public static void main(String[] args)
    {
        //INPUT
        Scanner  word = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter keyword");

        String theWord = word.nextLine();  // Read user input
        System.out.println("The word entered is : " + Engine.researcher(theWord));  // Output user input

        //OUTPUT

    }
}
