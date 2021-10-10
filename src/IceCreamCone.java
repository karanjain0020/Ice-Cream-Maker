
public class IceCreamCone extends IceCream{
	private String type;
	
	public IceCreamCone(String flavor, String type) {
		super(flavor);
		this.type = type;
	}
	
	
	
	public void addTopping(String toppings) {
		if(toppings.equals("banana")){
			System.out.println("Sorry! Out of banana topping");
		}
		else {
		topping.addTopping(toppings);
		}
	}
	
	public void display() {
		System.out.println("Cone type: "+type);
		super.display();
	}
	
		
}
