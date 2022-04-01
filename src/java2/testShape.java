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
public class testShape {
    public static void main(String[] args) {
        Circle1 c1 =new Circle1("red",true,34.5);
        System.out.println("Area:"+c1.getArea());
        
        Shape c2 = new Circle1("blue",false,23.6);
         System.out.println("Area c2:"+c2.getArea());
         
         Shape r1 =new Rectangle("geen",true,12,15);
          System.out.println("Area r1:"+r1.getArea());
    }
    
}
