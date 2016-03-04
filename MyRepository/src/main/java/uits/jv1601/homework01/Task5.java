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
public class Task5 {
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
      
        float p=3.14f;
        float H;//обьем
        float r;//меньший радиус
        float R;//большой радиус
        float S;//площадь
        double V;//обьем
        
        int answer;
        while(true){
            System.out.println("Click: ");
            System.out.println("1)calculate the volume of a cylinder ");
            System.out.println("2)volume of the hollow cylinder");
            System.out.println("3)area of the lateral surface of the cylinder");
            
            answer=sc.nextInt();
            switch(answer){
                case 1:
                    System.out.println("Enter the radius:");
                    r=sc.nextFloat();
                    System.out.println("Enter the height:");
                    H=sc.nextFloat();
                    V=p*r*r*H;
                    System.out.println("Volume: "+ V );
                    break;
                case 2:
                    System.out.println("Enter the smaller radius:");
                    r=sc.nextFloat();
                    System.out.println("Enter a larger radius:");
                    R=sc.nextFloat();
                    System.out.println("Enter the height:");
                    H=sc.nextFloat();
                    V=p*H*(R-r);
                    System.out.println("The volume of the hollow cylinder: " + V);
                    break;
                case 3:
                    System.out.println("Enter the smaller radius:");
                    r=sc.nextFloat();
                    System.out.println("Enter a value greater radius:");
                    R=sc.nextFloat();
                    System.out.println("Enter the height:");
                    H=sc.nextFloat();
                    S=2*p*H*(R+r);
                    System.out.println("Area: " + S );
                    break;
                    
            }
            
        }
    }
}
