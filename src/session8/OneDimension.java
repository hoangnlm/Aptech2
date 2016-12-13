package session8;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import hello.Hello;

public class OneDimension{
// Create an ArrayList instance
ArrayList marks = new ArrayList(); // line 1
/**
* Stores marks in ArrayList
*
*/
public void storeMarks(){
System.out.println("Storing marks. Please wait...");
marks.add(67); // line 2
marks.add(50);
marks.add(45);
marks.add(75);
marks.add(2.333);
marks.add('c');
marks.add("heheh");
}
/**
* Displays marks from ArrayList
*
*/
public void displayMarks() {
System.out.println("Marks are:");
// iterating the list using for loop
System.out.println("Iterating ArrayList using for loop:");
for (int i = 0; i < marks.size(); i++) {
System.out.println(marks.get(i));
}
System.out.println("-------------------------------------");
// Iterate the list using Iterator interface
Iterator imarks = marks.iterator(); // line 3
System.out.println("Iterating ArrayList using Iterator:");
while (imarks.hasNext()) { // line 4
System.out.println(imarks.next()); // line 5
}
System.out.println("-------------------------------------");
// Sort the list
//Collections.sort(marks); // line 6
//System.out.println("Sorted list is: " + marks);
}
/**
* @param args the command line arguments
*/
    public static void main(String[] args) {
        //Instantiate the class OneDimension
        OneDimension obj = new OneDimension(); // line 7
        //Invoke the storeMarks() method
        obj.storeMarks();
        //Invoke the displayMarks() method
        obj.displayMarks();
        //int t = 6;
        Integer t = 6;
        System.out.println(t.toString());
        String t1 = "12";
        String t2 = "34";
        int tmp = Integer.parseInt(t1)+Integer.parseInt(t2);
        System.out.println(tmp);
        
        String str1 = "chuoi ne";
        System.out.println(str1);
        str1 = "hehe";
        if(str1 != "")
        System.out.println("etetet");
        
        Hello testHello = new Hello("chuoi ne");
        
    }
}
