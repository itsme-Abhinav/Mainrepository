
public class helloworld3 {
	String comment;
	String name;

	public void insert (String c, String n )
	{
		comment = c;
		name= n;
		
	}	
	
	public void display()
	
	{
		System.out.println(comment+"  "+name);
	}
}

class hello3 
{
	public static void main (String[] args)
	{
		helloworld3 h3 = new helloworld3();
		h3.insert("first project calling by", "Abhinav");
h3.display();
}
}

