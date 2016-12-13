package session7;
public class MathClass {
/**
* Method to add two integers
*
*/
public void add() {
System.out.println("Result after addition is \"undefined\"");
}
/**
* Overloaded method to add three integers
*
* @param num1 an integer variable storing the value of first number
*/
public void add(int ... num1) {
    int num = 0;
    for(int i:num1) num += i;
    System.out.println("Result after addition is "+ num);
}
/**
* Overloaded method to add a float and an integer
*
* @param num1 a float variable storing the value of first number
* @param num2 an integer variable storing the value of second number
*/
public void add(double num1, int num2) {
System.out.println("Result after addition is "+ (num1+num2));
}
/**
* Overloaded method to add a float and an integer accepting the values
* in a different sequence
*
* @param num1 an integer variable storing the value of first number
* @param num2 a float variable storing the value of second number
*/
public void add(int num1, float num2) {
System.out.println("Result after addition is "+ (num1+num2));
}
/**
* Overloaded method to add two floating-point numbers
*
* @param num1 a float variable storing the value of first number
* @param num2 a float variable storing the value of second number
*/
public void add(float num1, float num2) {
System.out.println("Result after addition is "+ (num1+num2));
}
/**
* @param args the command line arguments
*/
}