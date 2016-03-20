/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.homework04;

import java.util.Scanner;
import java.util.Random;



/**
 *
 * @author Admin
 */
public class Test {
       static Parallelepiped par=new Parallelepiped();
       static Cone con=new Cone();
       static Ball ball=new Ball();
       static FrustumCone fruc=new FrustumCone();
       
       static  Random rand=new Random();
       static Scanner sc=new Scanner(System.in);
   
       
    public static void main(String[] args) {
        
      int answer;
        
       while(true){
           System.out.println("\t\t Menu");
           System.out.println("Enter \'1\' for working with random numbers");
           System.out.println("Enter \'2\' for working with eigenvalues");
           System.out.println("Enter \'0\' for exit");
           
           answer=sc.nextInt();
           
            switch(answer){
               case 1:{
                    randomParallelepiped();
                    randomBall();
                    randomCone();
                    randomFrustumCone();
                    
                    break;
                }
                        
                case 2:{
                   eigenvaluesParallelepiped();
                   eigenvaluesBall();
                   eigenvaluesCone();
                   eigenvaluesFrustumCone();
                   
                   break;
                   
                }
                   
               case 0: {
                   return;
               }
               default:{
                   System.out.println("Error");
               }
    }
}
    }
    public static void randomParallelepiped(){
          System.out.println("Parallelepiped: ");
          par=new Parallelepiped(Math.abs(rand.nextInt()%20+1),Math.abs(rand.nextInt()%20+1),Math.abs(rand.nextInt()%20+1));
          System.out.println(par);
    }
     public static void randomBall(){
         System.out.println("Ball: ");
           ball=new Ball(Math.abs(rand.nextInt()%10+1));
           System.out.println(ball);
    }
      public static void randomCone(){
          System.out.println("Cone: ");
           con=new Cone(Math.abs(rand.nextInt()%10+1),Math.abs(rand.nextInt()%10+1));
           System.out.println(con+"\n");
    }
      public static void randomFrustumCone(){
          System.out.println("FrustumCone: ");
          fruc=new FrustumCone(Math.abs(rand.nextInt()%20+1),Math.abs(rand.nextInt()%20+1),Math.abs(rand.nextInt()%20+1));
          System.out.println(fruc);
    }
      
      
      public static void eigenvaluesParallelepiped(){
          System.out.println("Parallelepiped: ");
          System.out.println("Enter height,width and leng: ");
          par=new Parallelepiped(sc.nextInt(),sc.nextInt(),sc.nextInt());
          System.out.println(par);
    }
      public static void eigenvaluesBall(){
          System.out.println("Ball: ");
          System.out.println("Enter diametr: ");
          ball=new Ball(sc.nextInt());
          System.out.println(ball);
    }
      public static void eigenvaluesCone(){
          System.out.println("Cone: ");
          System.out.println("Enter radius, height: ");
          con =new Cone(sc.nextInt(),sc.nextInt());
          System.out.println(con);
    }
      public static void eigenvaluesFrustumCone(){
          System.out.println("FrustumCone: ");
          System.out.println("Enter height,radiusBig and radiusSmall: ");
          fruc=new FrustumCone(sc.nextInt(),sc.nextInt(),sc.nextInt());
          System.out.println(fruc);
    }
}
