/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.lessons;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        
        while(true){
        System.out.print("Введите число: \n");
        int n=Integer.parseInt(number.next());
         if(n<0){
            break;
        }
        switch (n){
           
            case 1:
                System.out.println("Один");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
            case 4  :
                System.out.println("Четыри");
                break;
            case 5:
                System.out.println("Пять");
                break;
            case 6:
                System.out.println("Шесть");
                break;
            case 7:
                System.out.println("Семь");
                break;
            case 8:
                System.out.println("Восемь");
                break;
            case 9:
                System.out.println("Девять");
                break;
            default:
                System.out.println("Ты енот:)");
            
        }
        
    }
    }   
}
