// Name: Conner Handley
// Class: CS 3305/ Section 01
// Term: Spring 2024
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

import java.util.Scanner;
//Main class
public class TestRectangle {
    private static double width;
    private static double height;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Rectangle myRectangle = new Rectangle(); //uses default const.


        //user I/O
        //check width is non-negative
        do {
            System.out.print("Please enter a width equal to or greater than 0 for your rectangle: ");
            width = s.nextDouble();

            if (width<0){
                System.out.println("Please enter a number within the range (greater than or equal to 0). ");
            }

        }while(width<0);
        //check height is non-negative
        do {
            System.out.print("Please enter a height equal to or greater than 0 for your rectangle: ");
            height = s.nextDouble();

            if (height<0){
                System.out.println("Please enter a number within the range (greater than or equal to 0). ");
            }

        }while(height<0);

        Rectangle yourRectangle = new Rectangle(width, height); //uses custom const.

        //Start testing methods
        /*
        System.out.println("\n\nStart Testing...\n\n");
        //Getter test
        System.out.println("Testing methods getWidth() and getHeight() on object yourRectangle: ");
        System.out.printf("Width:\t%s\nHeight:\t%s\n",yourRectangle.getWidth(),yourRectangle.getHeight());

        //Area test
        System.out.print("Testing methods getArea() on object yourRectangle: ");
        System.out.println("Area:\t"+yourRectangle.getArea());

        //Perimeter test
        System.out.print("Testing methods getPerimeter() on object yourRectangle: ");
        System.out.println("Perimeter:\t"+yourRectangle.getPerimeter());

        // printRectangle Test
        System.out.print("Testing method printRectangle() on object yourRectangle: ");
        yourRectangle.printRectangle("yourRectangle");
        System.out.println("\n\nEnd Testing...\n\n");
        */
        //End testing methods

        System.out.println();//Readability

        //passing info for output
        output(myRectangle, "myRectangle");
        output(yourRectangle, "yourRectangle");
    }
    //used for printing final output
    public static void output(Rectangle obj,String objName){
        //making hyphens same length as rectangle name
        String line = "-".repeat(objName.length()+1);

        //printing the final format
        System.out.printf("%s:\n%s\nWidth:\t\t%.2f\nHeight:\t\t%.2f\nArea:\t\t%.2f\nPerimeter:\t%.2f\n\n",objName,line,obj.getWidth(),obj.getHeight(),obj.getArea(),obj.getPerimeter());
        obj.printRectangle(objName);
        System.out.println();//giving extra space for prettier output
    }
}