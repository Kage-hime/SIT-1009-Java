import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner ui = new Scanner(System.in);
        System.out.println("Input a string");
        String userInput = ui.nextLine();
        System.out.println("Inputted String: " + userInput);
        System.out.println("backward is: " + new BackwardString().backwardsString(userInput) );


    }

}
