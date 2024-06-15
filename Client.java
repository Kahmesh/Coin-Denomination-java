package assignment1;

 import java.util.Scanner;
 // import java scanner class for user input
public class Client 
//client class
{
public static void displayChange(Change c[], int n)
{
	//Creating Scanner object
	Scanner sc = new Scanner(System.in);
				
	int i;
	//Iterator for loop
				

	int denom[] = new int[5];
	//variable to store array of 5 denominations
		
	boolean not_found = true;
		
	System.out.print("\nEnter the name: ");
	// prompt user input
	String name = sc.nextLine();			
	// get input string 
		
	for(i=0; i<n; ++i)
	{
		if(c[i].getName().equalsIgnoreCase(name))
			{
			denom = c[i].calculate();
			//Calculate change of each denominations
				
			//Display count for each denomination
			System.out.println("\nCustomer: " + c[i].getName() + " " + c[i].getAmount() + " cents\n");
			System.out.println("Change:");
				if(denom[0] != 0)
					System.out.println("$1: " + denom[0]);
				if(denom[1] != 0)
					System.out.println("50 cents: " + denom[1]);
				if(denom[2] != 0)
					System.out.println("25 cents: " + denom[2]);
				if(denom[3] != 0)
					System.out.println("10 cents: " + denom[3]);
				if(denom[4] !=0)
					System.out.println("5 cents: "+ denom[4]);
				not_found = false;
				break;
			}
		}
		
		if(not_found)
			System.out.println("Name: " + name + "Not Found");
		// error message is diaplyed if customer name is not found
	}
	
	public static void displaySmallest(Change c[], int n)
	// for menu option of displaying smallest change
	{
		int denom[] = new int[5];
				
		int i;
		
		int min = c[0].getAmount();
		//Variables for finding minimum value amount

		
		int index = 0;
		//set index to zero to record
		
		for(i=1; i<n; ++i)
		{
			if(c[i].getAmount() < min)
			{
				min = c[i].getAmount();
				index = i;
			}
		}					

		denom = c[index].calculate();
		
		System.out.println("\nCustomer: " + c[index].getName() + " " + c[index].getAmount() + " cents\n");
		System.out.println("Change:");
		if(denom[0] != 0)
			System.out.println("$1: " + denom[0]);
		if(denom[1] != 0)
			System.out.println("50 cents: " + denom[1]);
		if(denom[2] != 0)
			System.out.println("25 cents: " + denom[2]);
		if(denom[3] != 0)
			System.out.println("10 cents: " + denom[3]);
		if(denom[4] !=0)
			System.out.println("5 cents: "+ denom[4]);
	}
	
	public static void displayLargest(Change c[], int n)
	// to display largest denomination
	{
		int denom[] = new int[5];
				
				int i;
		
		int max = c[0].getAmount();
		//Variable for  maximum  amount

		
		//Variable for the index of record
		int index = 0;
		
		for(i=1; i<n; ++i)
		{
			if(c[i].getAmount() > max)
			{
				max = c[i].getAmount();
				index = i;
			}
		}
		
		denom = c[index].calculate();
		
		System.out.println("\nCustomer: " + c[index].getName() + " " + c[index].getAmount() + " cents\n");
		System.out.println("Change:");
		if(denom[0] != 0)
			System.out.println("$1: " + denom[0]);
		if(denom[1] != 0)
			System.out.println("50 cents: " + denom[1]);
		if(denom[2] != 0)
			System.out.println("25 cents: " + denom[2]);
		if(denom[3] != 0)
			System.out.println("10 cents: " + denom[3]);
		if(denom[4] !=0)
			System.out.println("5 cents: "+ denom[4]);	
	}
	
	public static void displayTotal(Change c[], int n)// for total 
	{
		//Variable to store array of denominations & their total
		int denom[] = new int[5];
		int total_denom[] = new int[5];
		
		//Variable to store sum of all coins
		int total;
				
				int i, k;

		for(i=0; i<n; ++i)
		{
			denom = c[i].calculate();
			
			for(k=0; k<5; ++k)
				total_denom[k] = total_denom[k] + denom[k];
		}
		
		total = 0;
		
		for(i=0; i<5; ++i)
			total = total + total_denom[i];
		
		System.out.println("\nTotal Denomination Coins:");
		System.out.println("$1:"+ total_denom[0]);
		System.out.println("50 cents: " + total_denom[1]);
		System.out.println("25 cents: " + total_denom[2]);
		System.out.println("10 cents: " + total_denom[3]);
		System.out.println("5 cents: " + total_denom[4]);
		
		}
	
	public static void displayTotalsum(Change c[], int n)
	{
		int total_sum[] = new int[5];
		int denom[] = new int[5];
		
		int total;
		
		int i,k;
		
		for(i=0; i<n; ++i)
		{
			denom = c[i].calculate();
			
			for(k=0; k<5; ++k)
				total_sum[k] = total_sum[k] + denom[k];
		}
		
		total = 0;
		
		for(i=0; i<5; ++i)
			total = total + total_sum[i];
		
		
		System.out.println("$1:"+ total_sum[0]);
		System.out.println("50 cents: " + total_sum[1]);
		System.out.println("25 cents: " + total_sum[2]);
		System.out.println("10 cents: " + total_sum[3]);
		System.out.println("5 cents: " + total_sum[4]);
	}


//Studentinfo
public static void StudentInfo() {
    System.out.println("Student name: Kahmesh");// print student name
    System.out.println("Student number: 34559625");// print student number
    System.out.println("Mode of enrolment:Online");// print enrollment mode
    System.out.println("Teacher name:Mr.Siew Cheong Chong");// print teacher name
    System.out.println("Day :Saturday  Time:12pm");// print teacher name


}


public static void main(String[]args) {
//main method
StudentInfo();

	//create Scanner object
	Scanner sc = new Scanner(System.in);
	
	
	//Declare variable
	char change='0';
	int change_menu;
	String name;
	int amount;
	
	int i;
	//iterator
	
	int n = 0;
	//variable to store number of person
	
	//array of object of change type
	Change c[] = new Change[10];
	
	//Hard coded values for 
	/*
	  c[0] = new Change("Mesh",45);
	  c[1] = new Change("Aby", 135);
	  c[2] = new Change("Rinku", 15);
	  c[3] = new Change("Steve",60);
	  c[4] = new Change("Yash",65);
	  c[5] = new Change("Niresh",20);
	  c[6] = new Change("Trevor",168);
	  c[7] = new Change("Rong",45);
	  c[8] = new Change("Ching",22);
	  c[9] = new Change("Tinesh",150);
	  c[10] = new Change("Hasith",80);
	  n = 11;
	 */
	
	System.out.print("Please enter atleast 10 name and the amount of coins that they have.");
	
	// loop for new person
	boolean new_person;
	do
	{
		new_person = true;
		
		//Ask user to input name and amount
		System.out.print("Please the name");
		name = sc.nextLine();
		System.out.print("Please enter the value of coin in multipies of 5");
		amount = sc.nextInt();
		sc.nextLine();
		
		// check if amount is amount is 5 if not round off
		
		if(amount%5==0)
		
		 if (amount % 5 < 2.5)
			amount = amount - amount %5;
		else
			amount = amount +(amount - amount%5);
		System.out.println(amount);
		continue ;
		
		// check if new person, add details
		if(new_person)
			c[n++] = new Change(name,amount);
		if(n>=10)
			break;
		
		System.out.print("Do you have more person to enter(Y/N):");
		change= Character.toUpperCase(sc.nextLine().charAt(0));
		
	}while(change!='N');
	// repeat menu until user chooses to exit
	do
	{
		//display menu
		System.out.println("\n1.Enter a name and display change to be given for each denomination");
		
		System.out.println("\n2.Find the name with the largest amount and display change to be"
				+ "given for each denomination");
		
		System.out.println("\n3.Find the name with the smallest amount and display change to be\n"
				+ "given for each denomination");
		
		System.out.println("\n4.Calculate and display the total number of coins for each\n"
				+ "denomination");
		
		System.out.println("\n5.Calculate and display the total amount (i.e. NOT the total number\n"
				+ "of coins) for the sum of all denominations");
		System.out.println("\n6.Exit");
		
		System.out.print("Please select an option");
		change_menu = sc.nextInt();
		sc.nextLine();
		
		//check and compare user input(switch case)
		switch(change_menu)
		{//case for option 1
		case 1:
			displayChange(c,n);
			break;
		
		//case for option 2
		case 2:
			displayLargest(c,n);
			break;
			
		case 3: //for option 3
			displaySmallest(c,n);
			break;
			
		//option 4 case
		case 4:
			displayTotal(c,n);
			break;
			
		case 5:
			displayTotalsum(c,n);
			break;
			//exit program
		case 6:
			System.out.println("Thank you for using this program.GoodBye!");
			System.exit(0);
			break;
			
			// case for invalid option
			System.out.println("Invalid option.Please try again");
			
		}
		
	}while (change_menu !=6);
}
	}
}


