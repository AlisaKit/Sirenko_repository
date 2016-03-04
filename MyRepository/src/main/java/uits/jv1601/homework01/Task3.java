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
        String first="Work is not a wolf";
        String second="Jobs -  \"work \"";
        String third="the forest will not escape";
        Scanner sc=new Scanner (System.in);
        int a;
        while(true){
            System.out.println("Click to display:");
            System.out.println("1)each variable on a separate line");
            System.out.println("2)all variables in a single line");
            System.out.println("3)line, type  \"Work is not a wolf in the forest will not escape \"");
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
