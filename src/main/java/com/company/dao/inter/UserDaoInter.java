package com.company.dao.inter;


import com.company.entity.User;

import java.util.List;

public interface UserDaoInter {

   public List<User> getAllUser();

   public List<User> getUsersWithParams(String name , String surname , Integer natinality);

     public User getByEmailAndPassword(String email , String password) ;


   public User getById(int userId);

   public boolean updateUser(User u);

   public boolean removeUser(int id);

   public boolean addUser(User u);



}
