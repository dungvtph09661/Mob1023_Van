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
public class Author {

    private String name;
    private String email;
    private boolean gender;

    public Author() {
        name = "nguyen van nam";
    }
    public Author(String name,String email,boolean gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public void setName(String newname) {
        this.name = name;
    }

    public void setEmail(String newemail) {
        this.email = email;
    }

    public void setGender(String newgender) {
        this.gender = gender;
    }

    public void setGender(boolean newgender) {
        this.gender = newgender;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public boolean getGender() {
        return gender;
    }
     @Override
     public String toString(){
         return "Email";
     }
    }
