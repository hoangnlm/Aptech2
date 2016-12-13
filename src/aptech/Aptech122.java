/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;

import java.util.Arrays;

/**
 *
 * @author Hoang
 */
public class Aptech122 {
    
    private Aptech delegate;

    public Aptech122(Aptech delegate) {
        this.delegate = delegate;
    }

    public Aptech122() {
        this.delegate = new Aptech();
    }

    public static final Aptech122[] wrap(Aptech... aptechs) {
        return Arrays.stream(aptechs).map((Aptech t) -> new Aptech1Builder().setDelegate(t).createAptech1()).toArray(aptech.Aptech122[]::new);
    }

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aptech.main(args);
    }

    public void test2(double a, double b) {
        delegate.test2(a, b);
    }

    public double run(double a, double b, ITest itest) {
        return delegate.run(a, b, itest);
    }

    public double run2(double a, double b, AbstractClass.IAbstractClass ac) {
        return delegate.run2(a, b, ac);
    }

    public int getT1() {
        return delegate.getT1();
    }

    public void setT1(int t1) {
        delegate.setT1(t1);
    }

    public float getT2() {
        return delegate.getT2();
    }

    public void setT2(float t2) {
        delegate.setT2(t2);
    }

    @Override
    public boolean equals(Object o) {
        Object target = o;
        if (o instanceof Aptech122) {
            target = ((Aptech122) o).delegate;
        }
        return this.delegate.equals(target);
    }

    @Override
    public int hashCode() {
        return this.delegate.hashCode();
    }
    
}
