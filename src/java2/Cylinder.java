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
public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super();
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolumm(){
        return getArea()*this.height;
    }
    @Override
    public double getArea(){
        return Math.PI * getRadius();
    }
    @Override
    public String toString(){
        return super.toString()+";"+this.height;
    }
}
