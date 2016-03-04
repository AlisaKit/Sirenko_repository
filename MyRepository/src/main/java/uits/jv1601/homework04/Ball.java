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
public class Ball {
    private int diametr;
    
    public Ball(){}
   

    public Ball(int diametr) {
        this.diametr = diametr;
    }

    public int getDiametr() {
        return diametr;
    }

    public void setDiametr(int diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "diametr=" + diametr +"\n " +" volume=" +VolumeBall(diametr)+ "\n";
    }
    public double VolumeBall(int d){
     return (3*Math.PI*d*d*d)/4;
    }
    
}
