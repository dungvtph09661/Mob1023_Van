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
public class testAuthor {
    public static void main(String[] args) {
        Author author1=new Author();
        System.out.println(author1);
        
        System.out.println(author1.getName());
        author1.setName("new name");
        System.out.println(author1.getName());
        
        String name="Mai";
        String email="mai@gmail.com";
        
        System.out.println(author2);
        System.out.println(author2.getEmail()+"    "+author2.getName());
    }
}
