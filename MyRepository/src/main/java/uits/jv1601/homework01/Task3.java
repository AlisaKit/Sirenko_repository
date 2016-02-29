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
public class Task3 {
     public static void main(String[] args) {
        String first="Работа не волк";
        String second="pабота-\"work\"";
        String third="в лес не убежит";
        Scanner sc=new Scanner (System.in);
        int a;
        while(true){
            System.out.println("Нажмите для вывода:");
            System.out.println("1)каждую переменную в отдельной строке");
            System.out.println("2)все переменные в одной строке");
            System.out.println("3)строки,вида\"Работа не волк,в лес не убежит\"");
           a=sc.nextInt();
        switch(a){
            case 1:
                System.out.println(first+"\n"+second+"\n"+third);
                break;
            case 2:
                System.out.println(first+" "+second+" "+third);
                break;
            case 3:
                System.out.println(first+","+third);
        }}
    }
}
