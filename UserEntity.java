package com.example.demo.entity;
import java.io.Serializable;
public class UserEntity implements Serializable{
	private static final long serialVersionUID=1L;
	private int id;
	private String name;
	private String age;
	private String gender;
	private String score;
	private String phonenumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getAge() {
		return age;
	}
   public void setAge(String age) {
	   this.age=age;
   }
   public String getGender() {
	   return gender;
   }
   public void setGender(String gender) {
	   this.gender=gender;
   }
   public String getScore() {
	   return score;
   }
   public void setScore(String score) {
	   this.score=score;
   }
   public String getPhonenumber() {
	   return phonenumber;
   }
   public void setPhonenumber(String phonenumber) {
	   this.phonenumber=phonenumber;
   }
   public UserEntity() {
	   
   }
   public UserEntity(int id,String name,String age,String gender,String score,String phonenumber) {
	   this.id=id;
	   this.name=name;
	   this.age=age;
	   this.gender=gender;
	   this.score=score;
	   this.phonenumber=phonenumber;
   }}
//这个练习主要对用户的id，姓名，年龄，性别，成绩，电话进行增删查改操作
