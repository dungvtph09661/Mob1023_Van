/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.io.FileInputStream;

/**
 *
 * @author Admin
 */
public class Readfiledemo {
    public static void main(String[] args) {
        try {
            //b1 tao doi tuong de doc du lieu tu file
            FileInputStream fis = new FileInputStream("file1.txt");
            //b2 doc du lieu tu file 
            int data;//fis.read();
            String dataread= "";
            while((data =fis.read())!= -1 ){
                dataread +=String.valueOf((char)data);
                
            }
            System.out.println("Data:"+dataread);
            
            fis.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
