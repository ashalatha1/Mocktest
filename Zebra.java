package com.ibm.assignment.animal;
public class Zebra extends Animal
{
	public boolean is_wild;
	
	public Zebra (int age, String gender, boolean is_wild)

	  {
	     super(age,gender);
	     this.is_wild = is_wild;
	  }
	public void run () {
	}
}