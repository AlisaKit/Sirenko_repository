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
        System.out.print("������� �����: \n");
        int n=Integer.parseInt(number.next());
         if(n<0){
            break;
        }
        switch (n){
           
            case 1:
                System.out.println("����");
                break;
            case 2:
                System.out.println("���");
                break;
            case 3:
                System.out.println("���");
                break;
            case 4  :
                System.out.println("������");
                break;
            case 5:
                System.out.println("����");
                break;
            case 6:
                System.out.println("�����");
                break;
            case 7:
                System.out.println("����");
                break;
            case 8:
                System.out.println("������");
                break;
            case 9:
                System.out.println("������");
                break;
            default:
                System.out.println("�� ����:)");
            
        }
        
    }
    }   
}
