import java.util.Scanner;


public class LinearSearch {
	
	public static void main(String args[]) {
		
	int size = 0 ;
	int i = 0;
	Scanner SC = new Scanner(System.in);
	int key = 0;
	boolean status = false;
	
	System.out.println("Enter the lenght of array");
	size = SC.nextInt();
	int a[] = new int[size];
	
		System.out.println("enter the item in array ");
		
		for ( i=0; i< size ; i++)
		{
			a[i]= SC.nextInt();
		}
		
		System.out.println("enter the value to searched ");
		key= SC.nextInt();
       
		
		for ( i=0; i< size ; i++)
		{
			if (key == a[i])
			{ 
				
			System.out.println("the item is found at position " + i);
			status= true;
			return;
			}
			
		}
		
		if (status=false) {
		System.out.println("item not found ");
		}
		
	SC.close();
		
    }
    	
    
}
