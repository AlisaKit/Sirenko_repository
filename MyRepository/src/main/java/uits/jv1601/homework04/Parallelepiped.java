/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uits.jv1601.homework04;

/**
 *
 * @author Admin
 */
public class Parallelepiped {
    
   private int height;
    private int width;
    private int leng;
    
    Parallelepiped(){}

    public Parallelepiped(int height, int width, int leng) {
        this.height = height;
        this.width = width;
        this.leng = leng;
    }
     public int getHeight(){
         return height;
     }
     
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLeng() {
        return leng;
    }

    public void setLeng(int leng) {
        this.leng = leng;
    }

    @Override
    public String  toString() {
   return "Parallelepiped: " +"\n"+ "height=" + height + "\n"+" width=" + width + "\n"+" leng=" + leng+"\n"+"volume=" +Volume(height, width, leng)+"\n";
    }
     public int Volume(int a,int b,int c){
        return a*b*c;
     }
      
      
    
}
