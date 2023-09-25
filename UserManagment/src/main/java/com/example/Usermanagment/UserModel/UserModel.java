package com.example.Usermanagment.UserModel;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Entity


public class UserModel {
     @Id
      private Integer userId;

     @NotNull
     private String userName;
    @NotNull
     private LocalDate dateOfBirth;
    @Email
    private String email;

    @Size(min = 10, max = 10, message = "Phone number must be exactly 10 digits.")
    private Long phoneNumber;

     private LocalDate date;
     private LocalTime time;

 public Integer getUserId() {
  return userId;
 }

 public void setUserId(Integer userId) {
  this.userId = userId;
 }

 public String getUserName() {
  return userName;
 }

 public void setUserName(String userName) {
  this.userName = userName;
 }

 public LocalDate getDateOfBirth() {
  return dateOfBirth;
 }

 public void setDateOfBirth(LocalDate dateOfBirth) {
  this.dateOfBirth = dateOfBirth;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public Long getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(Long phoneNumber) {
  this.phoneNumber = phoneNumber;
 }

 public LocalDate getDate() {
  return date;
 }

 public void setDate(LocalDate date) {
  this.date = date;
 }

 public LocalTime getTime() {
  return time;
 }

 public void setTime(LocalTime time) {
  this.time = time;
 }

}
