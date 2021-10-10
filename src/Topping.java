import java.util.ArrayList;
import java.util.List;

public class Topping {
	private List<String> toppings;
	
	
	public Topping() {
		toppings = new ArrayList<>();
		init();
		
	}

	
	public void init() {
		toppings.add("sprinkles");
		toppings.add("hot fudge");
		toppings.add("nuts");

	}
	
	public void addTopping(String topping) {
		toppings.add(topping);
	}
	
	
    public void display() {
    	System.out.println("Toppings: ");
    	for(String s: toppings) {
    		System.out.println(s);
    	}
    }
    
    
    
}
