
public class FinalTests {

	public static void main(String[] args) {
		Beverage beverage = new Soy( new Soy(new Espresso()));
		System.out.println(beverage.getDescription() + "-$" + beverage.cost());
		
		Beverage beverage2 = new Whip(new Mocha (new Soy(new DarkRoast())));
		System.out.println(beverage2.getDescription() + "-$" + beverage2.cost());
		
		Beverage beverage3 = new Whip(new SteamedMilk(new Decaf()));
		System.out.println(beverage3.getDescription() + "-$" + beverage3.cost());
	}
}


