/*
 * Using two arrays, one to store the names of months and the other one to
store the days in each month, write a program to find the number of days in a
given month. 
 */
import java.util.*;

public class MonthDays {

	public static void main(String args[])
	{
		//initializing month array
		String[] month= new String[12];
		{
			month[0]="january";
			month[1]="february";
			month[2]="march";
			month[3]="april";
			month[4]="may";
			month[5]="june";
			month[6]="july";
			month[7]="august";
			month[8]="september";
			month[9]="october";
			month[10]="november";
			month[11]="december";
		}
		//object of class Check
		Check c= new Check();
		
		c.checkDays(month);//checking days of month
		
		c.display(month); //displaying the output
				
			
		
	}
}

class Check
{
	int i;
	int days[]=new int[12];// array for storing days of month
	
	// checking the month and addding value of days in day array
	void checkDays(String m[])
	{
		for(i=0;i<12;i++)
		{
			switch (m[i])
			{
			case "january": days[i]=31;
							break;
			case "february":days[i]=28;
							break;
			case "march":days[i]=31;
							break;
			case "april":days[i]=30;
							break;
			
			case "may":days[i]=31;
							break;
			case "june":days[i]=30;
							break;
			case "july":days[i]=31;
							break;
			case "august":days[i]=31;
							break;
			case"september":days[i]=30;
							break;
			case "october":days[i]=31;
							break;
			case"november":days[i]=30;
							break;
			case "december":days[i]=31;
							break;
			
			default: System.out.println("invalid case");				
			}
		}
	}
	
	//displaying the result
	void display(String[] m)
	{
		for(i=0;i<12;i++)
		System.out.println(m[i]+" ---->"+days[i] + "  days");
	}
}