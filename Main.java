public class ClassA {

   public void printText() {

   System.out.println(" Inside print text method;");

  }

 {

   System.out.print(" Instance Block;");

 }

 

public ClassA() {

  System.out.print(" Inside Constructor;");

 }

 static {

    System.out.print(" Inside static block;");

 }

   public static void main(String[] args) {

       ClassA c = new ClassA();

       c.printText();

     }

} 