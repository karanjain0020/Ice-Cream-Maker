import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		List<IceCream> Creams = new ArrayList<>();
		
		IceCream c1 = new IceCreamCone("vanilla", "waffe");
		IceCream c2 = new IceCreamCone("chocolate", "pretzel");
		IceCream i3 = new IceCreamCup("rum and raisins", "medium");
		
		c1.addTopping("choco chips");
		c1.addTopping("marshmellows");
		c1.addTopping("banana");
		
		c2.addTopping("peanut butter");
		c2.addTopping("nutella");
		
		i3.addTopping("bonet");
		i3.addTopping("gummy bears");
		
		Creams.add(c1);
		Creams.add(c2);
		Creams.add(i3);

		for(IceCream i: Creams) {
			i.display();
		}
		
		
	}

}
