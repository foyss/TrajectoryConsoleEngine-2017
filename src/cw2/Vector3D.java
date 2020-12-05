/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import java.text.DecimalFormat;

/**
 *
 * @author Foysal
 */
public class Vector3D {
    
    public double x = 0.0;
    public double y = 0.0;
    public double z = 0.0;
    
    public Vector3D() {
        
    }
    
    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public String toString() {
         DecimalFormat df = new DecimalFormat("##.##");
        return "(" + df.format(x) + ", " + df.format(y) + ", " + df.format(z) + ")";
    }
}
