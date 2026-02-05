package HW1_jesse;
public class hw1b {
    public static void main(String[] args) {
        int input1 = 10;
        int input2 = 2;
        //Tests for my peace of mind:
        int result = function(input1, input2, "Sum");
        int result2 = function(input1, input2, "Difference");
        int result3 = function(input1, input2, "Product");
        int result4 = function(input1, input2, "Quotient");
        int result5 = function(input1, input2, "");

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }

    //I realise this can be doen with switch cases but i am having trouble integrating it.
    public static int function(int num1, int num2, String text)
    {
        if (text.equals("Sum")){
            return num1 + num2;
        }
        else if(text.equals("Difference"))
        {
            return num1 - num2;
        }
        else if(text.equals("Product"))
        {
            return num1 * num2;
        }
        else if(text.equals("Quotient"))
        {
            return num1 / num2;
        }
        else {
            System.out.println("Ran into an error");

        }
        return 0;
    }
   
}
