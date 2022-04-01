/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2;

import java.io.FileOutputStream;

public class filedemo {
    public static void main(String[] args) {
        try{
        FileOutputStream fos = new FileOutputStream("file1.txt");
        String str = "hello word";
        byte []strbyte = str.getBytes();
        fos.write(strbyte);
        fos.close();
                }catch(Exception ex){
                    ex.printStackTrace();
                }
    }
    
}
