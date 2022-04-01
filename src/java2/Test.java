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
public class Test {

    public static void main(String[] args) {
        //1
        Circle c1 = new Circle("blue", 24.5);
        Cylinder cy1 = new Cylinder();
        cy1.setHeight(45);

        double volumm = cy1.getVolumm();
        System.out.println("Volumm: " + volumm);
        //2
        Cylinder cy2 = new Cylinder(24.6, 46, "green")
        System.out.println("Volumm" + cy2.getVolumm());
        //3
        double height =12;
        Circle cy3 = new Cylinder(21.3,height,"red");
        double volumm3=cy3.getArea()*height;
        System.out.println("Volumm: ");

    }
}
