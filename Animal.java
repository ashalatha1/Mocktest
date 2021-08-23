package com.ibm.assignment.animal;
public class Animal

{
	
public int age;

   public String gender;

   protected boolean mammal;
  
public Animal(int age, String gender)

    {
super();
this.age=age;
this.gender=gender;

    }
public boolean isMammal() {
	return Boolean.TRUE;
}
public void mate() {
	System.out.println("Mate Accordingly");
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}

}