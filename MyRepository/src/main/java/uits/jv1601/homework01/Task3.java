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
        String first="������ �� ����";
        String second="p�����-\"work\"";
        String third="� ��� �� ������";
        Scanner sc=new Scanner (System.in);
        int a;
        while(true){
            System.out.println("������� ��� ������:");
            System.out.println("1)������ ���������� � ��������� ������");
            System.out.println("2)��� ���������� � ����� ������");
            System.out.println("3)������,����\"������ �� ����,� ��� �� ������\"");
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
