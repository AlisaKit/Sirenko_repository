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
public class FrustumCone {
    int height;
    int RadiusBig;
    int radiusSmall;
    
    public FrustumCone(){}

    public FrustumCone(int height, int RadiusBig, int radiusSmall) {
        this.height = height;
        this.RadiusBig = RadiusBig;
        this.radiusSmall = radiusSmall;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadiusBig() {
        return RadiusBig;
    }

    public void setRadiusBig(int RadiusBig) {
        this.RadiusBig = RadiusBig;
    }

    public int getRadiusSmall() {
        return radiusSmall;
    }

    public void setRadiusSmall(int radiusSmall) {
        this.radiusSmall = radiusSmall;
    }

    @Override
    public String toString() {
        return  "height=" + height + "\n"+ " radiusBig=" + RadiusBig + "\n"+"  radiusSmall=" + radiusSmall +"\n"+"   volume" + VolumeFrustum(height, RadiusBig,radiusSmall) ;
    }
    public double VolumeFrustum(int h,int R,int r){
     return (Math.PI*h*(R*R+R*r+r*r)/3);
    }
    
    
}
