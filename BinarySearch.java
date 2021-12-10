import java.util.Scanner;


public class BinarySearch {
	
	public static void main(String args[]) {
		
	int size = 0 ;
	int i = 0;
//	int j = 0;
	Scanner SC = new Scanner(System.in);
	int key = 0;
	boolean status = false;
	
	System.out.println("Enter the lenght of array");
	size = SC.nextInt();
	int a[] = new int[size];
	int last = a.length - 1 ;
	int first = 0;
	
		System.out.println("enter the array items in ascendingly sorted order ");
		
		for (i=0; i< size ; i++)
		{
			a[i]= SC.nextInt();
		}
		
		System.out.println("enter the value to searched ");
		key= SC.nextInt();
       
		int mid = (first+last)/2;
		
		for ( i=first; i <= last ; i++)
		{ 			
			//for (j=1 ; j< (size-i); j++)
			//{ 
				if (key == a[mid])
				{
			System.out.println("the item is found at position " + mid);
			status = true;
			break;
				}
				
				else if (key > a[mid])
				{ 
					 mid = ((mid+1)+last)/2;
				}
				
				else if (key < a[mid])
				{ 
					 mid = ((mid-1)+first)/2;
				}
				
		}
		
		if (status == false) 
		{
			System.out.println("element not found");
		}
	
		SC.close();
		
    }
    	
    
}
