// Name: Conner Handley
// Class: CS 3305/ Section 01
// Term: Spring 2024
// Instructor: Dr. Haddad
// Assignment: 1
// IDE Name: IntelliJ

public class Rectangle {
    private double width; //rect width
    private double height; //rect height

    //default constructor
    public Rectangle(){
        width = 1.00;
        height = 1.00;
    }

    //user constructor
    public Rectangle(double userWidth, double userHeight){
        width = userWidth;
        height = userHeight;
    }

    //calculate area / return it
    public double getArea(){
        return (width*height);
    }

    //calculate perimeter / return it
    public double getPerimeter(){
        return ((2*width)+(2*height));
    }

    //Prints an overview of rectangle
    public void printRectangle(String objectName){
        System.out.printf("Rectangle %s is %.2f units wide and %.2f units high.\n",objectName,getWidth(),getHeight());
    }



    //Get width
    public double getHeight() {
        return height;
    }
    //Get height
    public double getWidth() {
        return width;
    }
}
