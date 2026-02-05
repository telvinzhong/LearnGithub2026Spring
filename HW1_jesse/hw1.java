package HW1_jesse;
import java.util.Scanner;

public class hw1 
{
    public static void main(String[] args) {
        
    String hello = "Hello World!";
    System.out.println(hello);
 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a response: ");

    for (int i = 0; i < 100; i++)
 {
         
    String input = scanner.nextLine();
    String reverseString = "";
    while(input.matches(".*\\d.*"))
    {
        System.out.println("No numbers allowed. Try again:" );
        input = scanner.nextLine();
    }
    System.out.println("You said: " + input);
         for(int j = 0; j < input.length(); j++)
         {
            reverseString = input.charAt(j) + reverseString; 
         }
         System.out.println(reverseString);
         System.out.println("Keep going!: ");
    
    }
    
  scanner.close();

}
}
