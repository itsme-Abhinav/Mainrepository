import java.util.Scanner;


public class bubbleSort {
	
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
		
for (int i=0; i<size;i++) 
{
	for(j=1;j<(size-i);j++)
{
if (a[j-1]>a[j])
{
	swap
}
}
}
		
    }
    	
    
}
