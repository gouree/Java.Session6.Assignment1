import java.util.*;
/*
 * Using the same above arrays, write a program to find the number of days
	from January 1 up to the given date (which is given as Month Day Year
	combination). 
 */

public class CalDays
{
	
	public static void main(String args[])
	{
		Calculate c= new Calculate();	// object of class calculate
		c.getDate();
				
	}
	
	
}

//calculate class
class Calculate
{
	String date;
	int dd,mm,yy;
	Scanner input= new Scanner(System.in);
	
	
	int i;
	int days[]=new int[12];// array for storing days of month
		
	// method for calculating total number of days from january till specified month
	int getTotalDays(int month)
	{
		int val;
			
		switch (month)
		{
			case 1: val=31;
					return(val);
						
			case 2:	val=28+31;
					return(val);
							
			case 3:days[i]=val=28+31+31;
					return(val);
				
			case 4:days[i]=val=28+31+31+30;
					return(val);
									
			case 5:days[i]=val=28+31+31+30+31;
					return(val);
				
			case 6:days[i]=val=28+31+31+30+31+30;
					return(val);	
				
			case 7:days[i]=val=28+31+31+30+31+30+31;
					return(val);	
				
			case 8:days[i]=val=28+31+31+30+31+30+31+31;
					return(val);		
				
			case 9:days[i]=val=28+31+31+30+31+30+31+31+30;
					return(val);			
				
			case 10:days[i]=val=28+31+31+30+31+30+31+31+30+31;
					return(val);				
				
			case 11:days[i]=val=28+31+31+30+31+30+31+31+30+31+30;
					return(val);				
				
			case 12:days[i]=val=28+31+31+30+31+30+31+31+30+31+30+31;
					return(val);				
				
			default: System.out.println("Invalid month entry");	
					return(-1);
		}
		
	}	
		
	//Method to get number of days of a particular month
	int getDaysOfMonth(int month)
	{
			int val;
			
			switch (month)
			{
				case 1: val=31;
						return(val);
						
				case 2:	val=28;
						return(val);
			
				case 3:days[i]=val=31;
						return(val);
						
				case 4:days[i]=val=30;
						return(val);
									
				case 5:days[i]=val=31;
						return(val);
						
				case 6:days[i]=val=30;
						return(val);	
						
				case 7:days[i]=val=31;
						return(val);	
						
				case 8:days[i]=val=31;
						return(val);		
						
				case 9:days[i]=val=30;
						return(val);	
						
				case 10:days[i]=val=31;
						return(val);
						
				case 11:days[i]=val=30;
						return(val);	
						
				case 12:days[i]=val=31;
						return(val);				
				
				default: System.out.println("Invalid Month");	
						return(-1);
			}
		
	}
	
	//method to accept date in the for dd mm yy
	void getDate()
	{
		System.out.println("Program to calculate total number of days from january 17 till specified date");
		System.out.println("Enter the date (dd)  ---->");
		dd= input.nextInt();
		
		System.out.println("Enter the month (mm) ---->");
		mm= input.nextInt();
		
		System.out.println("Enter the year (yy) ---->");
		yy= input.nextInt();
		
		
		calDays(mm,yy,dd);	
	}
	
	
	//method to check whether date entered is correct for given month
	int chk_days(int days,int month)
	{
		switch (month)
		{
		case 1:  if(days>31)
				 return(-1);
		case 2 : if(days>28)
				return(-1);
		case 3 : if(days>31)
			     return(-1);
		case 4: if(days>30)
			    return(-1);
		case 5 : if(days>31)
			 	return(-1);
		case 6: if(days>30)
				return(-1);
		case 7 : if(days>31)
			 	return(-1);
		case 8: if(days>31)
				return(-1);
		case 9 : if(days>30)
		     	return(-1);
		case 10: if(days>31)
		    	return(-1);
		case 11 : if(days>30)
				return(-1);
		case 12: if(days>31)
				return(-1);
		default: return(0);
		}
		
		
	}
	
	//method to calculate total number of days from january 2017
	void calDays(int month,int year, int days)
	{
		int total_days_of_month,days_of_month,days_of_year,ans,chkd;
		
		// store total number of days from january till particular month
		total_days_of_month= getTotalDays(month);
		
		// store number of days of year.Value will be 0 if year is 2017 .If >2017 we need to add 365 days for each year
		days_of_year= getDaysYear(year); 
		
		//store days of particular month
		days_of_month=getDaysOfMonth(month);
		
		//check for invalid date,month and year entries
		chkd=chk_days(days,month);
		if(days_of_year==-1 || days_of_month==-1||chkd==-1)
		{
			System.out.println("Invalid Entry.. Please Re-Run and re enter the values!!");
			
		}
		else
		{
			//calculating total number of days from january 2017
		ans= days_of_year+ (total_days_of_month-(days_of_month-days));
		System.out.println("Number of days -->"+ans);
		}
	}
	
	//calculate total number of days of particular year.
	public int getDaysYear(int year) 
	{
		int val;
		if (year<17)
		{
			System.out.println("Sorry cannot calculate the number of days.. Enter date  = 2017");
			return(-1);
		}
		
		else if(year==17)
		{
			return 0;
		}
		else 
		{
			val= year-17;
			return (val*365);
					
		}
	}
}

