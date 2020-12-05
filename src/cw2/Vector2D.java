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
public class Vector2D {
    
    DecimalFormat df = new DecimalFormat("#.00");
    
    public double x = 0.0;
    public double y = 0.0;
    
    public void rotate(double n)
    {
        double rx = (this.x * Math.cos(60)) - (this.y*Math.sin(60));
        double ry = (this.x * Math.sin(60)) - (this.y*Math.cos(60));
        x = rx;
        y = ry;
        
        
    }
    
    public Vector2D() {
        
    }
    
    public Vector2D(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        DecimalFormat df = new DecimalFormat("##.##");
        return "(" + df.format(x) + ", " + df.format(y) + ")";
    }

    
        
    
}
