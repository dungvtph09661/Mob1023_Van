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
public class testBook {
    public static void main(String[] args) {
        Author fptpoly = new Author("FPT POLY","fptpoly@gmail.com");
        Author KimDong = new Author("KIM DONG","kimdong@gmail.com");
        Author GiaoDuc = new Author("GIAO DUC","giaoduc@gmail.com");
        
        String bjaval = "java 1";
        Book java1 = new Book(bjava1,fptpoly);
        Book cprogramming = new Book (" C programming",KimDong);
        System.out.println(java1);
        System.out.println(cprogramming);
    }
}
