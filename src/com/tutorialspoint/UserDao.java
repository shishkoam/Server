package com.tutorialspoint;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
   public List<User> getAllUsers(){
      List<User> userList = null;
//      try {
//         File file = new File("Users.dat");
//         if (!file.exists()) {
            User user1 = new User(1, "package1", ".txt");
            User user2 = new User(2, "package2", ".txt");
            User user3 = new User(3, "package3", ".txt");
            User user4 = new User(4, "package4", ".txt");
            User user5 = new User(5, "package5", ".txt");
            User user6 = new User(6, "big_package", ".mdf");
            userList = new ArrayList<User>();
            userList.add(user1);
            userList.add(user2);
            userList.add(user3);
            userList.add(user4);
            userList.add(user5);
            userList.add(user6);            
            saveUserList(userList);		
//         }
//         else{
//            FileInputStream fis = new FileInputStream(file);
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            userList = (List<User>) ois.readObject();
//            ois.close();
//         }
//      } catch (IOException e) {
//         e.printStackTrace();
//      } catch (ClassNotFoundException e) {
//         e.printStackTrace();
//      }		
      return userList;
   }
   
   public String getUser(int i){
	   List<User> userList =getAllUsers();
   return userList.get(i).getName();
   }

   private void saveUserList(List<User> userList){
      try {
         File file = new File("Users.dat");
         FileOutputStream fos;

         fos = new FileOutputStream(file);

         ObjectOutputStream oos = new ObjectOutputStream(fos);
         oos.writeObject(userList);
         oos.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }   
}