/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.homework03;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Task1 {
    
    public static void main(String[] args) {
        double H;//������
        double W;//������
        double L;//������
        double R;
        double D;//�������
        double T;//�������
        Scanner sc=new Scanner (System.in);
        
        int answer=-1;
        while(true){
          System.out.println("\t\t ����");
          System.out.println("������� \"1\" ��� ���������� ������ ������������ ");
          System.out.println("������� \"2\" ��� ���������� ������ ���� ");
          System.out.println("������� \"3\" ��� ���������� ������ �������� ");
          System.out.println("������� \"4\" ��� ���������� ������ ������� �������� ");
          System.out.println("������� \"0\" ��� ������ ");
          answer=sc.nextInt();
          switch(answer){
              case 1:{
                  System.out.println("������� ������:");
                  H=sc.nextDouble();
                  System.out.println("������� ������:");
                  W=sc.nextDouble();
                  System.out.println("������� �����:");
                  L=sc.nextDouble();
                  System.out.println("����� :" +VolumeParalepiped(H,W,L));
              }
                  break;
              case 2:
              {
                  System.out.println("������� ������");
                  R=sc.nextDouble();
                  System.out.println("�����: "+VolumeBall(R));
              }
              break;
              case 3:{
                 System.out.println("������� ������");
                 R=sc.nextDouble();
                 System.out.println("������� ������");
                 H=sc.nextDouble();
                System.out.println("�����: "+volumeCylindre(R, H));
              }
                break;
              case 4:{
                  
                 
                  System.out.println("������� �������");
                  D=sc.nextDouble();
                  System.out.println("������� �������");
                  T=sc.nextDouble();
                  System.out.println("������� �����");
                  L=sc.nextDouble();
                  System.out.println("�����: "+VolumeHollowCylindre( D, T, L));
          }
          break;
             case 0:
                return;
             default:{
                 System.out.println("�� ����� ������������ �������");
                 break;
             }
             
                 
          
        }
    }
   }
    public static double VolumeParalepiped(double a,double b,double c){
        return  a*b*c;
         
    }
    public static double VolumeBall(double r){
       return 3.14*r*3/4; 
    }
    public static double volumeCylindre(double r,double h){
     return 3.14*r*r*h;
    }
    public static double VolumeHollowCylindre(double d,double t,double l){
       return 3.14*(d-t)*t*l;
    }
    
}
