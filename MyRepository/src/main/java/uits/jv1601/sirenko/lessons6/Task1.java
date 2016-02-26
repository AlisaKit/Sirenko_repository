/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.sirenko.lessons6;

/**
 *
 * @author Admin
 */
public class Task1 {
    public static void main(String[] args) {
        for(int i=0; i<args.length;i++ ){
        System.out.print(args[i]+" ");
        }
       System.out.println();
        for(int i= args.length-1;i>=0;i--){
        System.out.print(args[i]+" ");
        }
          System.out.println();   
    }
}
