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
public class Cone {
    int radius;
    int height;
    
    public Cone(){}

    public Cone(int radius, int height ) {
        this.radius = radius;
        this.height = height;
        
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  "radius=" + radius + "\n"+ "height=" + height +"\n"+"Volume " +VolumeCone(radius, height) ;
    }
    public double VolumeCone(int a,int b){
       return (Math.PI*a*a*b)/3;
    }
    
}
