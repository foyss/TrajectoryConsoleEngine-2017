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
public class Vector2DMaths {
    
  
    
    public static Vector2D addVectors(Vector2D vec1, Vector2D vec2) {
        Vector2D vecResult2D = new Vector2D();
        vecResult2D.x = vec1.x + vec2.x;
        vecResult2D.y = vec1.y + vec2.y;
        return vecResult2D;
    }
    
    public static Vector2D subtractVectors(Vector2D vec1, Vector2D vec2) {
        Vector2D vecResult2D = new Vector2D();
        vecResult2D.x = vec1.x - vec2.x;
        vecResult2D.y = vec1.y - vec2.y;
        return vecResult2D;       
    }
    
    public static Vector2D multiplyVectors(Vector2D vec1, Vector2D vec2) {
        Vector2D vecResult2D = new Vector2D();
        vecResult2D.x = vec1.x * vec2.x;
        vecResult2D.y = vec1.y * vec2.y;
        return vecResult2D;
    }
    
    public static Vector2D divideVectors(Vector2D vec1, Vector2D vec2) {
        Vector2D vecResult2D = new Vector2D();
        vecResult2D.x = vec1.x / vec2.x;
        vecResult2D.y = vec1.y / vec2.y;
        return vecResult2D;
    }
}
