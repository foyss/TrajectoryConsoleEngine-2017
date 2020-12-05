/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

import static java.lang.Math.sqrt;
import java.text.DecimalFormat;

/**
 *
 * @author Foysal
 */
public class CW2 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        int i, j, k;
        for (i = 1; i <= 5; i++) {
            for (j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Task = One");

        int l, m, n;
        for (l = 5; l >= 1; l--) {
            for (m = 5; m > l; m--) {
                System.out.print(" ");
            }
            for (n = 1; n < (l * 2); n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //task1
        //adding 2d vectors
        
        Vector2DMaths a = new Vector2DMaths();
        
        Vector2D vec1 = new Vector2D(3.3, 6.2);
        Vector2D vec2 = new Vector2D(4.2, 12.7);
        
        Vector2D addVec2d = a.addVectors(vec1, vec2);
        
        System.out.println("2D and 3D Vector Addition");
        System.out.println("(3.3, 6.2) (4.2, 12.7) = " + addVec2d);
        
        
        //adding 3d vectors
        Vector3DMaths b = new Vector3DMaths();
        
        Vector3D vec3 = new Vector3D(1.0, 4.5, 8.3);
        Vector3D vec4 = new Vector3D(12.6, -4.5, 6.7);
        
        Vector3D addVec3d = b.addVectors(vec3, vec4);
        
        System.out.println("(1.0, 4.5, 8.3) (12.6, -4.5, 6.7) = " + addVec3d);
        
        System.out.println("");
        System.out.println("2D and 3D Vector Subtraction");
        
        //subtracting 2d vectors
        Vector2DMaths c = new Vector2DMaths();
        
        Vector2D vec5 = new Vector2D(3.3, 6.2);
        Vector2D vec6 = new Vector2D(4.2, 12.7);
        
        Vector2D subVec2d = c.subtractVectors(vec5, vec6);
       
        System.out.println("(3.3, 6.2) (4.2, 12.7) = " + subVec2d);
        
        //subtracting 3d vectors
        Vector3DMaths d = new Vector3DMaths();
        
        Vector3D vec7 = new Vector3D(1.0, 4.5, 8.3);
        Vector3D vec8 = new Vector3D(12.6, -4.5, 6.7);
        
        Vector3D subVec3d = d.subtractVectors(vec7, vec8);
        
        System.out.println("(1.0, 4.5, 8.3) (12.6, -4.5, 6.7) = " + subVec3d);
        System.out.println("");
        
        //multiply 2d vectors
        Vector2DMaths e = new Vector2DMaths();
        
        Vector2D vec9 = new Vector2D(7.5, 7.5);
        Vector2D vec10 = new Vector2D(12.0, 0.0);
        
        Vector2D multVec2d = e.multiplyVectors(vec9, vec10);
        
        System.out.println("2D and 3D dot product");
        System.out.println("(7.5, 7.5) (12.0, 0.0) = " + multVec2d);
        
        //multiply 3d vectors
        Vector3DMaths f = new Vector3DMaths();
        
        Vector3D vec11 = new Vector3D(1.0, 4.5, 8.3);
        Vector3D vec12 = new Vector3D(12.6, 0.0, 6.7);
        
        Vector3D multVec3d = f.multiplyVectors(vec11, vec12);
        
        System.out.println("(1.0, 4.5, 8.3) (12.6, 0.0, 6.7) = " + multVec3d);
        System.out.println("");
        
        //unit vector of a 2d vector
        System.out.println("Unit Vector of a 2d Vector");
        
        //the vector
        double uv1 = 7.5;
        
        //vector magnitude
        double oo = sqrt(uv1 * uv1 + uv1 * uv1);
        
        //divide by magnitude
        
        uv1 = uv1/oo;
        
        DecimalFormat dff = new DecimalFormat("###.###");
        
        System.out.println("(7.5, 7.5) = (" + dff.format(uv1) + ", " + dff.format(uv1) +")");
        
        //the vector
        double uv2 = 12.0;
        double uv3 = 0.0;
        
        //vector magnitude
        double magnitude = sqrt(uv2 * uv2 + uv3 * uv3);
        
        //divide by magnitude
        
        uv2 = uv2 / magnitude;
        
        uv3 = uv3 / magnitude;
        
        System.out.println("(12.0, 0.0) = (" + uv2 + ", " + uv3 +")");
        System.out.println("");
        
        //unit vector of a 3d vector
        System.out.println("Unit vector of a 3d Vector");
        
        //the vector
        double uv4 = 1.0;
        double uv5 = 4.5;
        double uv6 = 8.3;
       
        //vector magnitude
        double magnitude2 = sqrt(uv4 * uv4 + uv5 * uv5 + uv6 * uv6);
        
        //divide by magnitude
        uv4 = uv4 / magnitude2;
        
        uv5 = uv5 / magnitude2;
        
        uv6 = uv6/magnitude2;
        
        System.out.println("(1.0, 4.5, 8.3) = (" + dff.format(uv4) + ", " + dff.format(uv5) + ", " + dff.format(uv6) + ")");
        
        //the vector
        double uv7 = 12.6;
        double uv8 = 0.0;
        double uv9 = 6.7;
        
        //vector magnitude
        double magnitude3 = sqrt(uv7 * uv7 + uv8 * uv8 + uv9 * uv9);
        
        //divide by magnitude
        
        uv7 = uv7 / magnitude3;
        
        uv8 = uv8 / magnitude3;
        
        uv9 = uv9 / magnitude3;
        
        System.out.println("(12.6, 0.0, 6.7) = (" + dff.format(uv7) + ", " + dff.format(uv8) + ", " + dff.format(uv9) +")");
        System.out.println("");
        
        
        
        //vector rotation in 2d
        System.out.println("Vector rotation in 2D");
        System.out.println("");
        
        
        //magnitude of a 2d vector
        double inp1=7.5, inp2=7.5;
        double res1 = Math.sqrt(Math.pow(inp1,2) + Math.pow(inp2, 2));
        System.out.println("Magnitude of (7.5, 7.5) = " + dff.format(res1) );
        
        //magnitude of a 3d vector
        
        double mag1=1.0, mag2=4.5, mag3=8.3;
        double res2 = Math.sqrt(Math.pow(mag1,2) + Math.pow(mag2, 2) + Math.pow(mag3, 2));
        System.out.println("Magnitude of (1.0, 4.5, 8.3) = " + dff.format(res2));
        
        //scaler multiple of 2d vector
        System.out.println("");
        System.out.println("Scalar multiple of 2D Vector");
       
        //vectors
        
        double scal1 = 5.0, scal2=12.5;
        double scalResult1 = 2;
        
        //result
        
        scal1 = scal1 * scalResult1;
        scal2 = scal2 * scalResult1;
        System.out.println("(5.0, 12.5) Scalar = 2, Result = " + "(" + scal1 + ", " + scal2 + ")");
        
        double scalResult2 = -5;
        
        //vectors
        double scal3 = 5.0;
        double scal4 = 12.5;
        
        scal3 = scal3 * scalResult2;
        scal4 = scal4 * scalResult2;
        
        System.out.println("(5.0, 12.5) Scalar = -5, Result = " + "(" + scal3 + ", " + scal4 + ")");
        System.out.println("");
        
        //scaler multiple of 3d vector
        System.out.println("Scalar multiple of 3D Vector");
        
        //vectors
        double scal5 = 5.0, scal6=12.5, scal7 = 6.25;
        
        scal5 = scal5 * scalResult1;
        scal6 = scal6 * scalResult1;
        scal7 = scal7 * scalResult1;
        System.out.println("(5.0, 12.5, 6.25) Scalar = 2, Result = " + "(" + scal5 + ", " +  scal6 +", " +  scal7 + ")");
        
        double scal8 = 5.0, scal9=12.5, scal10 = 6.25;
        scal8 = scal8 * scalResult2;
        scal9 = scal9 * scalResult2;
        scal10 = scal10 * scalResult2;
        System.out.println("(5.0, 12.5, 6.25) Scalar = -5, Result = " + "(" + scal8 + ", " +  scal9 +", " +  scal10 + ")");
        
        //velocity vector from speed and launch angle in 2d
        System.out.println("");
        System.out.println("Velocity vector from speed and launch angle in 2D");
        System.out.println("Speed = 20ms, Angle = 45 degrees");
        double vx2 = 20 * Math.cos(Math.toRadians(45));
        double vy2 = 20 * Math.sin(Math.toRadians(45));
        System.out.println("Velocity vector: (" + dff.format(vx2) + ", " + dff.format(vy2) + ")");
        
        
        
        
        System.out.println("");
        //task2
        
        for (i = 1; i <= 5; i++) {
            for (j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("Task = Two");
        for (l = 5; l >= 1; l--) {
            for (m = 5; m > l; m--) {
                System.out.print(" ");
            }
            for (n = 1; n < (l * 2); n++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Part A) A trajectory in 2D for a projectile that has a launch velocity of 20ms and a launch angle");
        System.out.println("of 45 degrees. Time step = 0.01 seconds. The gravity vector is (0.0, -9.81)");
        
        double time = 0.01;
        double ACCELERATION = -9.81;
        double velocity = 20;
        double timestep = 0.01;
        double angle = 45;
        double t = 0.0;
        double t2 = 0.0;
        double y = 0;
        double x = 0;
        double ff = 0;
        
        double xVelocity = velocity * Math.cos(Math.toRadians(angle));
        double yVelocity = velocity * Math.sin(Math.toRadians(angle));
        double finalVelocity;
        System.out.printf("%10s%10s%10s%10s","Time","X","Y", "Velocity");
        System.out.println("");
        while (y>=0) {
            t += timestep;
            x = (xVelocity * t);
            y = (yVelocity * t) + 0.5 * ACCELERATION * t * t;
            ff = velocity + ACCELERATION * t;
            System.out.printf("%10.2f%10.3f%10.3f%10.3f",t,x,y, ff);
            System.out.println("");
            
            
        }
        //task 2 part b
        System.out.println("");
        System.out.println("Part B) A trajectory in 3D for a projectile that has a launch velocity of (10.0, 14.14,-10.0)");
        System.out.println("Timestep = 0.01 seconds, The gravity vector is (0.0, -9.81, 0.0)");
        
       Vector3D velocity1 = new Vector3D(10.0, 14.14, -10.0);
       double dt = 0.01;
       Vector3D position = new Vector3D(0.0, 0.0, 0.0);
       Vector3D gravity = new Vector3D(0.0, -9.81, 0.0);
        boolean stop = true;
       double time1 = 0;
       
        System.out.printf("%8s%30s%30s\n\n", "Time", "Position", "Velocity");
        System.out.printf("%8.2f%30s%30s\n", time1, position, velocity1);
        while(stop){
            velocity1 = Vector3DMaths.addVectors(velocity1, Vector3DMaths.scalarMultiplication(gravity, dt));
            time1 = time1 + dt;
            position = Vector3DMaths.addVectors(position , Vector3DMaths.scalarMultiplication(velocity1 , dt));
            System.out.printf("%8.2f%30s%30s\n", time1, position, velocity1);
            if(position.y < 0.0001){
                System.out.println("The projectile has reached the ground");
                stop = false;
            }
        }
       
       }
       
               
       
        
        
    }
    

