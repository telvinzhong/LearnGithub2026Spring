import java.util.*;
public class hw1c {
    public static void main(String[] args) {
        String text = "Github Pull Request";
        String altText = removeVowels(text);
        
        System.out.println("Your new String is: " + altText);
        
        //now trying it with a scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.nextLine();
         while(!input.matches("[a-zA-Z]+"))
        {
        System.out.println("No numbers/characters allowed. Try again:" );
        input = sc.nextLine();
        }
        
        String altInput = removeVowels(input);
        System.out.println("Your new string is: " + altInput);
    }

    public static String removeVowels(String text)
    {
        String input = "[aeiouAEIOU]";
        return text.replaceAll(input, "");

    }
}
