/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca;

/**
 *
 * @author skuarch
 */
public class TryCatchFinally {

    public static void main(String[] args) {
        other();
    }

    public static String other() {
        
        try {

            int r = 5 / 0;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return "finally";
        }
        
        //return "normal"; //compilation error
        
    }

}
