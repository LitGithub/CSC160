import java.util.Scanner;
public class palindrome
{
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        String input;
        String reversePalindrome;
        String confirmedResult;
        String result;
        input = "";
        while(true) {
        reversePalindrome = "";
        System.out.printf("Enter a sentence or word to check for a palindrome!%n'exit' to quit: ");
        input = userInput.nextLine();
        if(input.equalsIgnoreCase("exit")) break;
        input = input.replace(" ", "");
        for(int counter = 1; counter < input.length() + 1; counter++){
            reversePalindrome += input.charAt(input.length() - counter);
        }
        if(input.equalsIgnoreCase(reversePalindrome)){
        result = "EQUAL";
        confirmedResult = "TRUE";
        } else{
        result = "NOT EQUAL";
        confirmedResult = "TRUE";
        }
        System.out.printf("The word %s is %s to %s reversed! Palindrome %s%n", input, result, reversePalindrome, confirmedResult);
        }
    System.out.printf("Goodbye! %n");
    }
}
