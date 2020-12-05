/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw2;

/**
 *
 * @author Foysal
 */
public class Vector3DMaths {
    
    public static Vector3D addVectors(Vector3D vec1, Vector3D vec2){
        Vector3D vecResult3D = new Vector3D();
        vecResult3D.x = vec1.x + vec2.x;
        vecResult3D.y = vec1.y + vec2.y;
        vecResult3D.z = vec1.z + vec2.z;
        return vecResult3D;
    }
    
    public static Vector3D subtractVectors(Vector3D vec1, Vector3D vec2) {
        Vector3D vecResult3D = new Vector3D();
        vecResult3D.x = vec1.x - vec2.x;
        vecResult3D.y = vec1.y - vec2.y;
        vecResult3D.z = vec1.z - vec2.z;
        return vecResult3D;
    }
    
    public static Vector3D multiplyVectors(Vector3D vec1, Vector3D vec2) {
        Vector3D vecResult3D = new Vector3D();
        vecResult3D.x = vec1.x * vec2.x;
        vecResult3D.y = vec1.y * vec2.y;
        vecResult3D.z = vec1.z * vec2.z;
        return vecResult3D;
    }
    
    public static Vector3D divideVectors(Vector3D vec1, Vector3D vec2, Vector3D vec3) {
        Vector3D vecResult3D = new Vector3D();
        vecResult3D.x = vec1.x / vec2.x / vec3.x;
        vecResult3D.y = vec1.y / vec2.y / vec3.y;
        vecResult3D.z = vec1.z / vec2.z / vec3.z;
        return vecResult3D;
    }

    public static Vector3D scalarMultiplication(Vector3D vec, double multiple)
    {
        Vector3D resultant = new Vector3D();
        resultant.x = vec.x * multiple;
        resultant.y = vec.y * multiple;
        resultant.z = vec.z * multiple;
        return resultant;
    }



    
    
}
