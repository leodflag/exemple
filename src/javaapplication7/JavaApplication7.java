/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author user
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Food bread_1=new Food(3,"i");
        Food bread_2=new Food(5,"uui");
       System.out.println(bread_1.getPrice());
       System.out.println(bread_2.getPrice());
    }
    
}
