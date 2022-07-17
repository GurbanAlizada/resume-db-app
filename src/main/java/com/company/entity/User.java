package com.company.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private String surName;
    private String email;
    private String password ;
    private String phone;
    private Date birthDate;
    private Country nationality;
    private Country birthPlace;


    public User (int id){
        this.id = id;
    }

    public User( String name, String surName, String email, String phone  , String pasword) {
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.phone = phone;
        this.password =pasword;
    }

    
    
    
   

    public User(int id, String name, String surname, String email, String phone, Date birthDate, Country nationality, Country birthPlace , String passString) {
 this.name = name;
        this.surName = surName;
        this.email = email;
        this.phone = phone;
        this.id=id;
        
        this.birthDate =birthDate;
        this.nationality = nationality;
        this.password=password;
      

    }

    
     public User(int id, String name, String surname, String email, String phone , String pasword) {
 this.name = name;
        this.surName = surName;
        this.email = email;
        this.phone = phone;
        this.id=id;
        this.password=pasword;
        
       
    }

  
   

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", email='" + email + '\'' +
                ", c='" + nationality + '\'' +
                ", n='" + birthPlace + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +              '}';
    }

}
