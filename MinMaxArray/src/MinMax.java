
import java.util.Scanner;
public class MinMax 
{

	public static void main(String args[])
	{
		
		Check c = new Check(); // object of class Check
		c.getArray();
		c.displayArray();
		c.minmax();
		
		
	}
}

class Check
{
	int i,max=0,min;
	int a[]= new int[10];	//	Declaring array a
	Scanner input= new Scanner(System.in);	
	
	
	//method to input array elements from user
	void getArray()
	{
		System.out.println("Enter array elements --->");
		for(i=0;i<10;i++)
		{
			a[i]= input.nextInt();
		}
	}

	//method to check minimum and maximum array element
	public void minmax()
	{
		min = a[0];
		for(i=0;i<10;i++)
		{
			if(a[i]>max)
				max=a[i];
						
			if(a[i]<=min)
				min=a[i];
		}
		
		System.out.println("  ");
		
		System.out.println("Minimum number in array --->"+min);
		
		System.out.println("Maximum number in array --->"+max);
	}
	
	//method to display the array elements

	void displayArray()
	{
		System.out.println(" array elements --->");
		for(i=0;i<10;i++)
		{
			System.out.print(a[i]+"   ");
		}
	}
	
	
}

