package com.tutorialspoint;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name = "package")
public class User implements Serializable {

   private static final long serialVersionUID = 1L;
   private int id;
   private String name;
   private String extention;

   public User(){}
   
   public User(int id, String name, String extention){
      this.id = id;
      this.name = name;
      this.extention = extention;
   }

   public int getId() {
      return id;
   }

   @XmlElement
   public void setId(int id) {
      this.id = id;
   }
   public String getName() {
      return name;
   }
   @XmlElement
   public void setName(String name) {
      this.name = name;
   }
   public String getExtention() {
      return extention;
   }
   @XmlElement
   public void setExtention(String extention) {
      this.extention = extention;
   }		
}