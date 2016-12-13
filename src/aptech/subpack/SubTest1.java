/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aptech.subpack;

import aptech.Aptech;

/**
 *
 * @author Hoang
 */
public class SubTest1 {
    int pro1 = 123;

    public int getPro1() {
        return pro1;
    }

    public void setPro1(int pro1) {
        this.pro1 = pro1;
    }
    
    public int met1(int a, int b){
        return a + b;
    }
    
    public static void main(String[] args) {
        Aptech aptech = new Aptech();
        System.out.println(aptech.getT1());
    }
}
