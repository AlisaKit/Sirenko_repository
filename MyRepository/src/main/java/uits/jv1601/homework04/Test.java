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
    public static void main(String[] args) {
        Parallelepiped par;
        Ball ball;
        Cone con;
        FrustumCone fruc;
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int answer;
        
     mark:   while(true){
           System.out.println("\t\t Menu");
           System.out.println("Enter \'1\' for working with random numbers");
           System.out.println("Enter \'2\' for working with eigenvalues");
           System.out.println("Enter \'0\' for exit");
           
           answer=sc.nextInt();
           
            switch(answer){
               case 1:
                    while(true){
                        System.out.println("Enter \'1\' for with parallelepiped");
                        System.out.println("Enter \'2\' for with ball");
                        System.out.println("Enter \'3\' for  cone");
                        System.out.println("Enter \'4\' for frustum cone");
                        System.out.println("Enter \'0\' to return to the main menu");
                        
                        answer=sc.nextInt();
                        switch(answer){
                            case 1:{
                                par=new Parallelepiped(Math.abs(rand.nextInt()%20+1),Math.abs(rand.nextInt()%20+1),Math.abs(rand.nextInt()%20+1));
                                System.out.print(par);
                            }
                                break;
                            case 2:{
                                ball=new Ball(Math.abs(rand.nextInt()%10+1));
                                System.out.println(ball);
                              
                            }
                            break;
                            case 3:{
                                con=new Cone(Math.abs(rand.nextInt()%10+1),Math.abs(rand.nextInt()%10+1));
                                System.out.println(con);
                            }
                            break;
                            case 4:
                            {
                                fruc=new FrustumCone(Math.abs(rand.nextInt()%20+1),Math.abs(rand.nextInt()%20+1),Math.abs(rand.nextInt()%20+1));
                                System.out.println(fruc);
                            }
                            break;
                            case 0:
                                continue mark;
                                
                                default:
                                    System.out.println("Error");
                                    break;
                        }
                        
                        
                   }
               case 2:
                   while(true){
                        System.out.println("Enter \'1\' for with parallelepiped");
                        System.out.println("Enter \'2\' for with ball");
                        System.out.println("Enter \'3\' for  cone");
                        System.out.println("Enter \'4\' for frustum cone");
                        System.out.println("Enter \'0\' to return to the main menu ");
                        
                        answer=sc.nextInt();
                        switch(answer){
                            case 1:{
                                par=new Parallelepiped(sc.nextInt(),sc.nextInt(),sc.nextInt());
                                System.out.println(par);
                            }
                            break;
                            case 2:{
                                ball=new Ball(sc.nextInt());
                                System.out.println(ball);
                            }
                            break;
                            case 3:{
                            con =new Cone(sc.nextInt(),sc.nextInt());
                            System.out.println(con);
                            }
                            break;
                            case 4:{
                              fruc=new FrustumCone(sc.nextInt(),sc.nextInt(),sc.nextInt());
                              System.out.println(fruc);
                             }
                            break;
                            case 0:
                                continue mark;
                                default:
                                    System.out.println("Error");
                                    break;
                            
                   
           }
            
        }
               case 0: 
                   return;
               default:
                   System.out.println("Error");
    }
}
    }
}
