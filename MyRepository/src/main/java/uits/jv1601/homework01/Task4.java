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
        float d;//�����
        float r;//������� ������
        float R;//������� ������
        float S;//�������
        float L;//�����
        
        int answer;
        while(true){
            System.out.println("�������: ");
            System.out.println("1)��������� ����� ���������� ");
            System.out.println("2)������� ����������");
            System.out.println("3)������� ������");
            
            answer=sc.nextInt();
            switch(answer){
                case 1:
                    System.out.println("������� �������� ��������:");
                    d=sc.nextFloat();
                    L=p*d;
                    System.out.println("�����: " +L);
                    break;
                case 2:
                    System.out.println("������� �������� �������:");
                    r=sc.nextFloat();
                    S=r*p*p;
                    System.out.println("�������: "+S);
                    break;
                case 3:
                    System.out.println("������� �������� �������� �������:");
                    r=sc.nextFloat();
                    System.out.println("������� �������� �������� �������:");
                    R=sc.nextInt();
                    S=p*(R*R-r*r);
                    System.out.println("�������: " + S);
                    break;
                    
            }
            
        }
    }
}
