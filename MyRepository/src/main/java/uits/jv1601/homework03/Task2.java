/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.homework03;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Task2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        while(true){
           
            System.out.println("\t\t Меню");
            System.out.println("1-умножить матрицы ");
            System.out.println("2-сложить матрицы");
            System.out.println("3-умножить на число");
            System.out.println("4-транспонировать ");
            
           int answer=-1;
           answer=sc.nextInt();
           switch(answer){
               case 1:
           }
        }
    }
    public static int MatrixSumma(int [][] matrix1,int matrix2[][],int matrix3[][]){
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix2.length;j++){
               // matrix3=matrix1[i][]*matrix2[][j];
                
            }
            
        }
        
    }
    
}

