package com.ibm.assignment.animal;
public class Duck extends Animal

{
public String beakcolor = "yellow";
public Duck (int age,String gender, String beakcolor) {
	super(age,gender);
	this.beakcolor = beakcolor;
}
public void swim() {
}
public void quack() {
}
@Override
public String toString() {
	return "Duck [beakcolor=" + beakcolor + ", age=" + age + ", gender=" + gender +"]";

}
}