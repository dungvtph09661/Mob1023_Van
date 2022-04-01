/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

/**
 *
 * @author User
 */
public abstract class Shape {
    private String color;
    private boolean filled;
    
    public Shape(){}
        public Shape(String color,boolean filled){
            this.color=color;
            this.filled=filled;
    }
        public abstract double getArea();
        
        public abstract double getPerimeter();
        
        public void setColor(String color){
            this.color=color;
        }
        public void setFilled(boolean filled){
            this.filled=filled;
        }
}
