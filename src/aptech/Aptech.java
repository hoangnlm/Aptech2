/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

import aptech.subpack.SubTest1;
import java.util.Scanner;

/**
 *
 * @author Hoang
 */
public class Aptech {
    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 
        double a = 12.23;
        double b = 10;
        Aptech it = new Aptech();
        it.test2(a, b);
    }

    public void test2(double a, double b) {
        System.out.println("a + b = " + run(a, b, (a1, b1) -> a1 + b1));
        System.out.println("a - b = " + run(a, b, (a1, b1) -> {
            return a1 - b1;
        }));
        System.out.println("a / b = " + run2(a, b, (a1, b1) -> {
            return a1 /  b1;
        }));
        System.out.println("a * b = " + run2(a, b, (a1, b1) -> {
            return a1 * b1;
        }));
        
        System.out.println("test subpackage:");
        SubTest1 sub1 = new SubTest1();
        System.out.println(sub1.getPro1());
        
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    private int t1 = 1;
    private float t2 = 234.324f;

    public double run(double a, double b, ITest itest) {
        return itest.run(a, b);
    }
    
    public double run2(double a, double b, AbstractClass.IAbstractClass ac) {
        return ac.run(a, b);
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public float getT2() {
        return t2;
    }

    public void setT2(float t2) {
        this.t2 = t2;
    }
}
