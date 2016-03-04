/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.homework01;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Task4 {
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
      
        float p=3.14f;
        float d;//длина
        float r;//меньший радиус
        float R;//большой радиус
        float S;//площадь
        float L;//длина
        
        int answer;
        while(true){
            System.out.println("Click: ");
            System.out.println("1)Calculate the circumference ");
            System.out.println("2)circle area");
            System.out.println("3)area of a circle ring area");
            
            answer=sc.nextInt();
            switch(answer){
                case 1:
                    System.out.println("Enter diameter values:");
                    d=sc.nextFloat();
                    L=p*d;
                    System.out.println("Lenght: " +L);
                    break;
                case 2:
                    System.out.println("Enter the radius:");
                    r=sc.nextFloat();
                    S=r*p*p;
                    System.out.println("Area: "+S);
                    break;
                case 3:
                    System.out.println("Enter the smaller radius:");
                    r=sc.nextFloat();
                    System.out.println("Enter a value greater radius:");
                    R=sc.nextInt();
                    S=p*(R*R-r*r);
                    System.out.println("Area: " + S);
                    break;
                    
            }
            
        }
    }
}
