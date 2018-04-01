


public class PizzaOrder {

	//Main method to test the PizzaOrder class
	public static void main(String[] args) {
		
				// Creating a large pizza, 1 cheese, 1 ham Pizza
				 Pizza pizza1 = new Pizza("large", 1,0,1);
				 
				//Creating medium pizza, 2 cheese, 2 pepperoni
			     Pizza pizza2 = new Pizza("medium", 2,2,0);
			     
               //Creating object of PizzaOrder
			     PizzaOrder order = new PizzaOrder();
			     
			   //set the no of pizza and set the pizza objects
			     order.setNumPizzas(2);
			     order.setPizza1(pizza1);
			     order.setPizza2(pizza2);
			   
			    //call the calcTotal method to get the total cost of the order
			     double total = order.calcTotal();
			     System.out.println("Total cost of the order is : " +total);
	}


	 private int noOfPizza;
	 private Pizza pizza1;
	 private Pizza pizza2;
	 private Pizza pizza3;
	 
	// Default constructor
	public PizzaOrder(){
		noOfPizza = 0;
		pizza1 = null;
		pizza2 = null;
		pizza3 = null;
	}
	
	//Set method to set the noOfPizza variable
	 public void setNumPizzas(int numPizzas){
		 if(numPizzas>=1 && numPizzas<=3 ){
		 this.noOfPizza = numPizzas;
		 }
	 }
	//Set method to set the pizza1 object
	 public void setPizza1(Pizza pizza1){
		 this.pizza1 = pizza1;
	 }
	//Set method to set the pizza2 object
	 public void setPizza2(Pizza pizza2) {
		 this.pizza2 = pizza2;
	 }
	//Set method to set the pizza3 object
	 public void setPizza3(Pizza pizza3){
		 this.pizza3 = pizza3;
	 }
	 
	//Method to calculate the total cost of the order based on the number of order
	 public double calcTotal(){
		 if(noOfPizza == 2){
			 return pizza1.calCost() + pizza2.calCost();
		 }
		 else if(noOfPizza == 3){
			 return pizza1.calCost() + pizza2.calCost() + pizza3.calCost();
		 }
		 else{
			 
			 return pizza1.calCost();
		 }
		
	 }
	 
	
 }


