
public class IceCream implements iIceCream{
	private String flavor;  //do we not need protected here because we are able to access the field through the constructor and the constructor 
	//is already public and so can be accessed from anywhere

	protected Topping topping; //what is the difference between public and private
	
	
	public IceCream(String flavor){ //why do we not apply the protected modifier to this class. 
		this.flavor= flavor;
		topping = new Topping();
		
	}
	
	public void addTopping(String name) {
		topping.addTopping(name);
	}
	
	public void display() {
		System.out.println("Ice cream flavor: "+flavor);
		topping.display();
	}

}
