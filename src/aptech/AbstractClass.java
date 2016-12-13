/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

/**
 *
 * @author Hoang
 */
public abstract class AbstractClass {

    public abstract double run(double a, double b);

    public static interface IAbstractClass {

        double run(double a, double b);
    }
}
