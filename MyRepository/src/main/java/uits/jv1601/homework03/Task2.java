/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package uits.jv1601.homework03;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import static uits.jv1601.homework03.Manipulation.multiplication;
import static uits.jv1601.homework03.Manipulation.randomNumbers;
import static uits.jv1601.homework03.Manipulation.summa;
import static uits.jv1601.homework03.Manipulation.transposition;

/**
*
* @author Admin
*/
public class Task2 {
    static  int [][] matrix1;
    static  int matrix2[][];
    static Random rand=new Random();
    static Scanner sc=new Scanner(System.in);
public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);



    while(true){

        System.out.println("\t\t Menu");
        System.out.println("1-Enter from keyboard ");
        System.out.println("2-Generation class Random");
        System.out.println("3-Exit");


       int answer=-1;
       answer=sc.nextInt();
       switch(answer){
           case 1:{

               enterMatrix(matrix1, matrix2);
               summa(matrix1, matrix2);
               //randomNumbers(matrix1, matrix2);
               multiplication(matrix1, matrix2);
               transposition(matrix1, matrix2);
               break;

           }
           case 2:{
               generationRandom();
               summa(matrix1, matrix2);
               multiplication(matrix1, matrix2);
               randomNumbers(matrix1, matrix2);
               transposition(matrix1, matrix2);
           }
       }
    }
}
   public static void generationRandom(){
       matrix1=new int[3][3];
       matrix2=new int[3][3];

    System.out.println("Matrix one");
    for(int i=0;i<matrix1.length;i++){//for first array
         for(int j=0;j<matrix1[i].length;j++){
             matrix1[i][j]=rand.nextInt(10);
             System.out.print(matrix1[i][j]+" ");
            }
         System.out.println();
    }
    System.out.println("Matrix two");
    for(int i=0;i<matrix2.length;i++){//for first array
         for(int j=0;j<matrix2[i].length;j++){
             matrix2[i][j]=rand.nextInt(10);
             System.out.print(matrix2[i][j]+" ");

            }
         System.out.println();
         }


}


    public static void enterMatrix(int [][] arr1,int [][]arr2){
        /* System.out.println("First matrix");
         int a,b;
    try{
         System.out.println("Enter length of line: ");
         a=sc.nextInt();
         System.out.println("Enter length of column: ");
         b=sc.nextInt();
         arr1=new int[a][b];
         System.out.println("Enter variable: ");
         for(int i=0;i<arr1.length;i++){
              for(int j=0;j<arr1[i].length;j++){
                   arr1[i][j]=sc.nextInt();
                  }

          }
          }catch(InputMismatchException e){
             System.out.println("You enter a string! Please, use only numbers!");
             a=0;
             b=0;
          }

         System.out.println("Second matrix");
       try{
         System.out.println("Enter length of line: ");
         a=sc.nextInt();
         System.out.println("Enter length of column: ");
         b=sc.nextInt();
         arr2=new int[a][b];
         System.out.println("Enter variable: ");
         for(int i=0;i<arr2.length;i++){
              for(int j=0;j<arr2[i].length;j++){
                   arr2[i][j]=sc.nextInt();
                  }
              }
        }catch(InputMismatchException e){
        System.out.println("You enter a string! Please, use only numbers!");
        a=sc.nextInt();
        b=sc.nextInt();
    }*/
        int a,b;
         while(true){
                System.out.println("First matrix");
         try{
                System.out.println("Enter length of line: ");
                a=Integer.parseInt(sc.next());
                System.out.println("Enter length of column: ");
                b=Integer.parseInt(sc.next());
                arr1=new int[a][b];
                System.out.println("Enter variable: ");
                 for(int i=0;i<arr1.length;i++){
                     for(int j=0;j<arr1[i].length;j++){
                          arr1[i][j]=Integer.parseInt(sc.next());
                          
                         }
                 }
                 System.out.println("Second matrix");
                 System.out.println("Enter length of line: ");
                 a=sc.nextInt();
                 System.out.println("Enter length of column: ");
                 b=sc.nextInt();
                 arr2=new int[a][b];
                 System.out.println("Enter variable: ");
                 for(int i=0;i<arr2.length;i++){
                         for(int j=0;j<arr2[i].length;j++){
                              arr2[i][j]=sc.nextInt();
                             }
                         }
                 
            }catch(NumberFormatException e){
                System.out.println("You enter a string! Please, use only numbers!");
            }
            break;
         }
}
}