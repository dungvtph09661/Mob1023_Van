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
public class Circle {

    private double radius;
    private String color;


public Circle(){
this.radius=1.0;
this.color="red";
}
public Circle(double radius){
    this.radius=radius;
}
public Circle(double radius,String color){
this.radius= radius;
this.color= color;
}
  public void setRadius(double newradius) {
        this.radius = radius;
    }
    public void setColor(String newcolor) {
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }
    
  @Override
  public String toString(){
      return"radius;"+ this.radius+"color"+this.color;
  }
        
    }
