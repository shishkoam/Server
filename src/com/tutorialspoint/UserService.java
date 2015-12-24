package com.tutorialspoint;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/PackageService")
public class UserService {

   UserDao userDao = new UserDao();

   @GET
   @Path("/packages")
   @Produces(MediaType.APPLICATION_XML)
   public List<User> getUsers(){
      return userDao.getAllUsers();
   }
   @GET
   @Path("/packages/1")
   @Produces(MediaType.TEXT_PLAIN)
   public String getUser(){
      return userDao.getUser(1);
   }
}