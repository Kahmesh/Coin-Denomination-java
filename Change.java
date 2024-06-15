package assignment1;

public class Change {
	//instance variable for change class string name and int amount
	private String name;
	private int amount;

public Change()// default constructor for Change.class
{
	name = "someone";
	amount = 0;
}

public String getName()
//Supply methods for setting the name, setting the amount, getting the name and getting the amount.

{
	return name;
}

public int getAmount()
{
	return amount;
}

public void setName(String name)
//The set method for the name instance variable should ensure that the input is not empty or contain whitespaces 
//(otherwise set a default value)

{
	if (name.trim().isEmpty()){
		this.name= "someone";
		this.name = name;
	}
}

public void setamount(int amount)//setter method for amount
{
	this.amount= amount;
}

public Change( String name, int amount)
//This is parameterized constructor will take two parameters, a string to set the name and an integer to set the amount

{
	this.name=name;
	this.amount=amount;
}

public int[]calculate()// calculation class 
{
	int oneD, fiftyC, twentyFiveC, tenC, fiveC;// decalre change
	
	oneD = amount / 100;//calculations for one dollar
	fiftyC= (amount%100)/50;
	twentyFiveC= ((amount %100)%50)/ 25;
	tenC=(((amount%100)%50)%25)/10;
	fiveC=((((amount%100)%50)%25)%10)/5;
	int denom[]= {oneD, fiftyC, twentyFiveC, tenC, fiveC};
	return denom;//return denomination count
}
//Give Java code for an equals method for the Change class.
@Override
public boolean equals(Object obj) {
  //This is type casting
  Change name = (Change)obj;

  //Compare name of customer if both are same then return true otherwise return false
  if(this.name.equalsIgnoreCase(name.name))
      return true;
      return false; 
}//equals() end 
	
	
}





