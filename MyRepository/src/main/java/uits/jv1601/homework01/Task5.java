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
            System.out.println("Нажмите: ");
            System.out.println("1)посчитать обьем цилиндра ");
            System.out.println("2)обьем полного цилиндра");
            System.out.println("3)площадь боковой поверхности цилиндра");
            
            answer=sc.nextInt();
            switch(answer){
                case 1:
                    System.out.println("Введите значение радиуса:");
                    r=sc.nextFloat();
                    System.out.println("Введите значение высоты:");
                    H=sc.nextFloat();
                    V=p*r*r*H;
                    System.out.println("Обьем: "+ V );
                    break;
                case 2:
                    System.out.println("Введите значение меньшего радиуса:");
                    r=sc.nextFloat();
                    System.out.println("Введите значение большего радиуса:");
                    R=sc.nextFloat();
                    System.out.println("Введите значение высоты:");
                    H=sc.nextFloat();
                    V=p*H*(R-r);
                    System.out.println("Обьем полного цилиндра: " + V);
                    break;
                case 3:
                    System.out.println("Введите значение меньшего  радиуса:");
                    r=sc.nextFloat();
                    System.out.println("Введите значение большего радиуса:");
                    R=sc.nextFloat();
                    System.out.println("Введите значение высоты:");
                    H=sc.nextFloat();
                    S=2*p*H*(R+r);
                    System.out.println("Площадь: " + S );
                    break;
                    
            }
            
        }
    }
}
