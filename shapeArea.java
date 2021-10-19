import java.util.Scanner;
import java.lang.Math;
/**
 * Write a description of class shapeArea here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shapeArea
{
    public static void main(String args[]) {
        Scanner shapeIn = new Scanner(System.in);
        Scanner numberIn = new Scanner(System.in);
        String shapeInput; //declare shape input
        double radius; //declare radius
        double base; //declare base
        double height; //declare height
        double area; //declare area
        shapeInput = ""; //set shapeInput to empty string
        while(!shapeInput.equalsIgnoreCase("quit")) {
            radius = 0; //reset values to 0
            base = 0; //reset values to 0
            height = 0; //reset values to 0
            area = 0; //reset values to 0
            System.out.printf("What Shape Would You Like To Calculate A Area Of: Circle, Rectangle, Triangle, Square?"); //display options
            System.out.printf("'quit' to exit. "); //display quit statement
            shapeInput = shapeIn.next();
            if(shapeInput.equalsIgnoreCase("Triangle")) {
                System.out.printf("Triangle Chosen!%n"); //display option chosen
                System.out.printf("Enter Base: "); //ask for base
                base = numberIn.nextDouble(); //save user input
                System.out.printf("Enter Height: "); //ask for height
                height = numberIn.nextDouble(); //save user input
                area = base * height; // multiply base and height
                area /= 2; //divide area by 2
                System.out.printf("The dimensions for your Triangle are%n"); //display dimensions
                System.out.printf("Base: %.02f ft%n", base); //display base
                System.out.printf("Height: %.02f ft%n", height); //display height
                System.out.printf("The area for your triangle is %.02f ft^2%n", area); //display area
            }//triangle
            if(shapeInput.equalsIgnoreCase("Rectangle")) {
                System.out.printf("Rectangle Chosen!%n");//display option chosen
                System.out.printf("Enter Base: "); //ask for base
                base = numberIn.nextDouble(); //save user input
                System.out.printf("Enter Height: "); //ask for height
                height = numberIn.nextDouble(); //save user input
                area = base * height; // multiply base and height
                System.out.printf("The dimensions for your Rectangle are%n"); //display dimensions
                System.out.printf("Base: %.02f ft%n", base); //display base
                System.out.printf("Height: %.02f ft%n", height); //display height
                System.out.printf("The area for your Rectangle is %.02f ft^2%n", area); //display area
            }//Rectangle
            if(shapeInput.equalsIgnoreCase("Circle")) {
                System.out.printf("Circle Chosen!%n");//display option chosen
                System.out.printf("Enter Radius: "); //ask for Radius
                radius = numberIn.nextDouble(); //save user input
                area = Math.PI * Math.pow(radius, 2); //calculate area
                System.out.printf("The area for your Circle with a radius of %.0f ft is %.2f ft^2.%n", radius, area);
            }//Circle
            if(shapeInput.equalsIgnoreCase("Square")) {
                System.out.printf("Square Chosen!%n");//display option chosen
                System.out.printf("Enter Length: "); //ask for length
                base = numberIn.nextDouble(); //save user input
                area = Math.pow(base, 2); //calculate area
                System.out.printf("The area for your Square with a length of %.0f ft is %.2f ft^2.%n", base, area);
            }//Square
        }
        System.out.printf("Goodbye!%n"); //display goodbye
    }
}
