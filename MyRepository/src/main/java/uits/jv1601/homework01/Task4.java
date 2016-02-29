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
            System.out.println("Нажмите: ");
            System.out.println("1)посчитать длину окружности ");
            System.out.println("2)площадь окружности");
            System.out.println("3)площадь кольца");
            
            answer=sc.nextInt();
            switch(answer){
                case 1:
                    System.out.println("Введите значения диаметра:");
                    d=sc.nextFloat();
                    L=p*d;
                    System.out.println("Длина: " +L);
                    break;
                case 2:
                    System.out.println("Введите значения радиуса:");
                    r=sc.nextFloat();
                    S=r*p*p;
                    System.out.println("Площадь: "+S);
                    break;
                case 3:
                    System.out.println("Введите значение меньшего радиуса:");
                    r=sc.nextFloat();
                    System.out.println("Введите значение большего радиуса:");
                    R=sc.nextInt();
                    S=p*(R*R-r*r);
                    System.out.println("Площадь: " + S);
                    break;
                    
            }
            
        }
    }
}
