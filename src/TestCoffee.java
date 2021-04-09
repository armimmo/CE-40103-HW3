public class TestCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Decaf();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new DarkRoast();
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        Beverage beverage4 = new HouseBlend();
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());
    }
}
