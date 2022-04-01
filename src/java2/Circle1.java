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
public class Circle1 extends Shape {

    private double radius;

    public Circle1(){
        super();

    }
    public Circle1(String color,boolean filled, double radius){
        super(color,filled);
        this.radius=radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI* this.radius*this.radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI* this.radius * 2;
    }
}
