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
        double H;//высота
        double W;//ширина
        double L;//высота
        double R;
        double D;//диаметр
        double T;//толщина
        Scanner sc=new Scanner (System.in);
        
        int answer=-1;
        while(true){
          System.out.println("\t\t Меню");
          System.out.println("Нажмите \"1\" для вычисления объема паралепипеда ");
          System.out.println("Нажмите \"2\" для вычисления объема шара ");
          System.out.println("Нажмите \"3\" для вычисления объема цилиндра ");
          System.out.println("Нажмите \"4\" для вычисления объема полного цилиндра ");
          System.out.println("Нажмите \"0\" для выхода ");
          answer=sc.nextInt();
          switch(answer){
              case 1:{
                  System.out.println("Введите высоту:");
                  H=sc.nextDouble();
                  System.out.println("Введите ширину:");
                  W=sc.nextDouble();
                  System.out.println("Введите длину:");
                  L=sc.nextDouble();
                  System.out.println("Обьем :" +VolumeParalepiped(H,W,L));
              }
                  break;
              case 2:
              {
                  System.out.println("Введите радиус");
                  R=sc.nextDouble();
                  System.out.println("Обьем: "+VolumeBall(R));
              }
              break;
              case 3:{
                 System.out.println("Введите радиус");
                 R=sc.nextDouble();
                 System.out.println("Введите высоту");
                 H=sc.nextDouble();
                System.out.println("Обьем: "+volumeCylindre(R, H));
              }
                break;
              case 4:{
                  
                 
                  System.out.println("Введите диаметр");
                  D=sc.nextDouble();
                  System.out.println("Введите толщину");
                  T=sc.nextDouble();
                  System.out.println("Введите длину");
                  L=sc.nextDouble();
                  System.out.println("Обьем: "+VolumeHollowCylindre( D, T, L));
          }
          break;
             case 0:
                return;
             default:{
                 System.out.println("Вы ввели неправильную команду");
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
