/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech;


public class Aptech1Builder {

    private Aptech delegate;

    public Aptech1Builder() {
    }

    public Aptech1Builder setDelegate(Aptech delegate) {
        this.delegate = delegate;
        return this;
    }

    public Aptech122 createAptech1() {
        return new Aptech122(delegate);
    }
    
}
