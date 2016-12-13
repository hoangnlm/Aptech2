package session10;
abstract class Shape {
private final float PI = 3.14F; // Variable to store value of PPI
/**
* Returns the value of PI
*
* @return float
*/
public float getPI(){
return PI;
}
/**
* Abstract method
* @param val a float variable storing the value specified by user
*
* @return float
*/
abstract void calculate(float val);
}
/**
* Define the child class Circle.java
*/
class Circle extends Shape{
float area; // Variable to store area of a circle
/**
* Implement the abstract method to calculate area of circle
*
* @param rad a float variable storing value of radius
* @return void
*/
@Override
void calculate(float rad){
area = getPI() * rad * rad;
System.out.println("Area of circle is:"+ area);
}
}
/**
* Define the child class Rectangle.java
*/
class Rectangle extends Shape{
float perimeter; // Variable to store perimeter value
float length=10; // Variable to store length
/**
* Implement the abstract method to calculate the perimeter
*
* @param width a float variable storing width
* @return void
*/
@Override
void calculate(float width){
perimeter = 2 * (length+width);
System.out.println("Perimeter of the Rectangle is:"+ perimeter);
}
}


public class Calculator {
/**
* @param args the command line arguments
*/
public static void main(String[] args)
{
Shape objShape; // Declare the Shape object
String shape; // Variable to store the type of shape
if(args.length==2) { // Check the number of command line arguments
//Retrieve the value of shape from args[0]
shape = args[0].toLowerCase(); // converting to lower case
switch(shape){
// Assign reference to Shape object as per user input
case "circle": objShape = new Circle();
objShape.calculate(Float.parseFloat(args[1]));
break;
case "rectangle": objShape = new Rectangle();
objShape.calculate(Float.parseFloat(args[1]));
break;
}
}
else{
// Error message to be displayed when arguments are not supplied
System.out.println("Usage: java Calculator <shape-name> <value>");
}
}
}
