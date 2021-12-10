class ClassB
{
    public int x;

    private int y;

    void cal(int a, int b)

    {
        x =  a;

        y =  b;
    }        

    
    //void print() 
    {

     System.out.println(" "+y);

    }

}    

public class ClassA 

{

    public static void main(String args[])

    {

     ClassB obj = new ClassB();   

        obj.cal(-10, 20);

        System.out.print(obj.x);  
        //System.out.print(obj.y);  

        //obj.print();

    }

}