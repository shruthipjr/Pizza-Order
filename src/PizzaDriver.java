import java.util.Scanner;

public class PizzaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          /*System.out.println("Enter the size of the pizza: ");
          
         Scanner s = new Scanner(System.in);
          System.out.println("Enter the no of cheese toppins : ");
          Scanner i1 = new Scanner(System.in);
          
          System.out.println("Enter the no of pepperoni toppins : ");
          Scanner i2 = new Scanner(System.in);
          
          System.out.println("Enter the no of ham toppins : ");
          Scanner i3 = new Scanner(System.in);
          
		  Pizza p = new Pizza(s.next(), i1.nextInt(),i2.nextInt(),i3.nextInt());*/
          
          Pizza p1 = new Pizza("large",1,1,2);
		  System.out.println(p1.getDescription());
		  
		  Pizza p2 = new Pizza("small",2,3,2);
		  System.out.println(p2.getDescription());
		  
		  Pizza p3 = new Pizza("medium",0,3,2);
		  System.out.println(p3.getDescription());
		  
		  
	}

}
