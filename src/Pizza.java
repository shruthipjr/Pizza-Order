

public class Pizza {
	
	private String sizeOfPizza;
	private int noCheeseToppings;
	private int noPepToppings;
	private int noHamToppings;
	
	//Parameterized constructor
public Pizza(String sizeOfPizza, int noCheeseToppings, int noPepToppings, int noHamToppings  )
{
	this.setSizeOfPizza(sizeOfPizza);
	this.setNoCheeseToppings(noCheeseToppings);
	this.setNoPepToppings(noPepToppings);
	this.setNoHamToppings(noHamToppings);
}

 // Default constructor
public Pizza(){
	sizeOfPizza = null;
	noCheeseToppings = 0;
	noPepToppings = 0;
	noHamToppings = 0;
} 

//Get method to get the sizeOfPizza variable
public String getSizeOfPizza() {
	return sizeOfPizza;
}

//Set method to set the sizeOfPizza variable
public void setSizeOfPizza(String sizeOfPizza) {
	this.sizeOfPizza = sizeOfPizza;
}

//Get method to get the noCheeseToppings variable
public int getNoCheeseToppings() {
	return noCheeseToppings;
}

//Set method to set the noCheeseToppings variable
public void setNoCheeseToppings(int noCheeseToppings) {
	this.noCheeseToppings = noCheeseToppings;
}

//Get method to get the noPepToppings variable
public int getNoPepToppings() {
	return noPepToppings;
}

//Set method to set the noPepToppings variable
public void setNoPepToppings(int noPepToppings) {
	this.noPepToppings = noPepToppings;
}

//Get method to get the noHamToppings variable
public int getNoHamToppings() {
	return noHamToppings;
}

//Set method to set the noHamToppings variable
public void setNoHamToppings(int noHamToppings) {
	this.noHamToppings = noHamToppings;
}

//methtod to calculate the cost
public double calCost()
{
	if(sizeOfPizza.equalsIgnoreCase("small")){
		
		return (10 +(2* noCheeseToppings) + (2*noPepToppings) + (2*noHamToppings)) ;
	}
	else if(sizeOfPizza.equalsIgnoreCase("medium")){
		return (12 +(2*noCheeseToppings) + (2*noPepToppings) + (2*noHamToppings)) ;
	}
	else if(sizeOfPizza.equalsIgnoreCase("large"))
	{
		return (14 +(2*noCheeseToppings) + (2*noPepToppings) + (2*noHamToppings)) ;	
	}
	else{
		System.out.println("Invalid option");
		return 0.0;
	}
	
}

//Method to get the size of pizza , number of toppings and the total cost
 public String getDescription(){
	 String description = ("The size of pizza is: " + sizeOfPizza + " the no of Cheese Toppings is :" + noCheeseToppings + " the no of Pepperoni Toppings is : "
    + noPepToppings + " the no of ham toppings is : " + noHamToppings + " the total cost is : $" + calCost());

	  return description;
   }
 
 //Main method to test the Pizza class
 public static void main(String[] args) {
	 
     Pizza p1 = new Pizza("large",1,1,2);
	  System.out.println(p1.getDescription());
	  
	  Pizza p2 = new Pizza("small",2,3,2);
	  System.out.println(p2.getDescription());
	  
	  Pizza p3 = new Pizza("medium",0,3,2);
	  System.out.println(p3.getDescription());
 }
}
