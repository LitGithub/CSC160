import java.util.Scanner;
public class palindrome {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        String palindrome;
        String reversePalindrome;
        String confirmedResult;
        String result;
        System.out.printf("Please enter a word to check if its a palindrome: ");
        reversePalindrome = "";
        palindrome = userInput.nextLine();
        palindrome = palindrome.replace(" ", "");
        for(int counter = 1; counter < palindrome.length() + 1; counter++){
            reversePalindrome += palindrome.charAt(palindrome.length() - counter);
        }
        if(palindrome.equalsIgnoreCase(reversePalindrome)){
        result = "EQUAL";
        confirmedResult = "TRUE";
        } else{
        result = "NOT EQUAL";
        confirmedResult = "TRUE";
        }
        System.out.printf("The word %s is %s to %s reversed! Palindrome %s", palindrome, result, reversePalindrome, confirmedResult);
    }
}
