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
        float H;//�����
        float r;//������� ������
        float R;//������� ������
        float S;//�������
        double V;//�����
        
        int answer;
        while(true){
            System.out.println("�������: ");
            System.out.println("1)��������� ����� �������� ");
            System.out.println("2)����� ������� ��������");
            System.out.println("3)������� ������� ����������� ��������");
            
            answer=sc.nextInt();
            switch(answer){
                case 1:
                    System.out.println("������� �������� �������:");
                    r=sc.nextFloat();
                    System.out.println("������� �������� ������:");
                    H=sc.nextFloat();
                    V=p*r*r*H;
                    System.out.println("�����: "+ V );
                    break;
                case 2:
                    System.out.println("������� �������� �������� �������:");
                    r=sc.nextFloat();
                    System.out.println("������� �������� �������� �������:");
                    R=sc.nextFloat();
                    System.out.println("������� �������� ������:");
                    H=sc.nextFloat();
                    V=p*H*(R-r);
                    System.out.println("����� ������� ��������: " + V);
                    break;
                case 3:
                    System.out.println("������� �������� ��������  �������:");
                    r=sc.nextFloat();
                    System.out.println("������� �������� �������� �������:");
                    R=sc.nextFloat();
                    System.out.println("������� �������� ������:");
                    H=sc.nextFloat();
                    S=2*p*H*(R+r);
                    System.out.println("�������: " + S );
                    break;
                    
            }
            
        }
    }
}
