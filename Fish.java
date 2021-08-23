package com.ibm.assignment.animal;
public class Fish extends Animal

{
  private int sizeInFt;

  private boolean canEat;



  public Fish (int age, String gender, int sizeInFt, boolean canEat)

  {
     super(age, gender);
     this.sizeInFt = sizeInFt;
     this.canEat = canEat;

  }
  public int GetSizeInFt() { 
	  return(sizeInFt); 
}
  public void sizeInFt(int sizeInFt) {
	  this.sizeInFt = sizeInFt;
  }

  public boolean iscanEat() { 
	  return(canEat); 
 }
  public void setcanEat(boolean canEat) {
	  this.canEat = canEat;
  }
  @Override
public String toString() {
	return "Fish [sizeInFt=" + sizeInFt + ", canEat=" + canEat + ", age=" + age + ", gender=" + gender + "]";
}
}

