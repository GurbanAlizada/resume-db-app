package com.company.main;


import at.favre.lib.crypto.bcrypt.BCrypt;
import com.company.dao.impl.*;
import com.company.dao.inter.*;
import com.company.entity.Skill;
import com.company.entity.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {


                

           
        User u = new User( "Test" , "Test" ,  "q@gmail.com" , "+99442454" , "qax12345");;
        UserDaoInter dao = new UserDaoImpl();
              //  dao.addUser(u);
               //  System.out.println(dao.getByEmailAndPassword("sarkhanrasullu@gmail.com","123456" ).getSurName());
            //System.out.println(          dao.getAllUser());


                  User user1 = dao.getById(44);

                 BCrypt.Verifyer verifyer = BCrypt.verifyer();

                 String password = "qax12345";
                 BCrypt.Result result =  verifyer.verify(password.toCharArray(), user1.getPassword().toCharArray());
            
                 System.out.println(result.verified);
        /*
        UserDaoInter dao = Context.instanceUserDao();
        System.out.println(dao.getAllUser());
        //System.out.println(dao.getById(9));
        // User u = dao.getById(9);
        // u.setSurName("RASULLU");
        //dao.updateUser(u);
        //  System.out.println(dao.getById(9));
        //  User u = new User( "Messi" , "Leo " , "fsdfsdfds" , "dsss");
        //dao.addUser(u);
        //System.out.println(dao.getAllUser());
        //dao.removeUser(11);
         */

        /*
        UserSkillDaoInter dao = new UserSkillIDaompl();
        System.out.println(dao.getAllSkillByUserId(9));

         */


        /*
        EmploymentHistoryDaoInter dao = new EmploymentHistoryDaoImpl();
        System.out.println(dao.getAllEmploymentHistoryByUserId(9));


         */


        /*
        SkillDaoInter dao = new SkillDaoImpl();
        System.out.println(dao.getAllSkills());

        CountryDaoInter dao2 = new CountryDaoImpl();
        System.out.println(dao2.getAllCountry());


         */

        ///UserDaoInter dao = new UserDaoImpl();

       // System.out.println(dao.getUsersWithParams("Gurban", null, null));

    }
}
