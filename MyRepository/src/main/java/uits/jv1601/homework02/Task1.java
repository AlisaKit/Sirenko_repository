/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.homework02;

/**
 *
 * @author Admin
 */
public class Task1 {
    public static void main(String[] args) {
        int array[][]=new int[3][3];
        for(int i=0;i<3;i++){
         for(int j=0;j<3;j++){
            array[i][j]=i+j;
            System.out.print(array[i][j]+" ");
         }
        System.out.println();
          
        }
    }
}
