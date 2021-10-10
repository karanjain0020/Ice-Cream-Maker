
public class IceCreamCup extends IceCream{
	private String type;
	
	public IceCreamCup(String flavor, String type) {
		super(flavor);
		this.type = type;
	}
	
	
	
	public void addTopping(String toppings) {
		if(toppings.equals("bonet")){
			System.out.println("Sorry! Cannot add bonet to a cup");
		}
		else {
		topping.addTopping(toppings); //will it not be better to call super.addTopping(toppings)
		}
	}
	
	public void display() {
		System.out.println("Cone type: "+type);
		topping.display();
	}
	
		
}
