package co.pasali.sample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author pasali
 */
@Entity
public class User {

   @Id
   @GeneratedValue
   private Integer userId;

   @Column(nullable = false)
   private String firstName;

   @Column(nullable = false)
   private String lastName;

   @Column(nullable = false)
   private String email;

   @Column(nullable = false)
   private String password;

   public Integer getUserId() {
      return userId;
   }

   public void setUserId(Integer userId) {
      this.userId = userId;
   }

   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   @Override
   public String toString() {
      return "User{" +
             "userId=" + userId +
             ", firstName='" + firstName + '\'' +
             ", lastName='" + lastName + '\'' +
             ", email='" + email + '\'' +
             ", password='" + password + '\'' +
             '}';
   }
}
