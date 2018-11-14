package decorator_pattern;

public class Demo {
    public static void main(String arg[]){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + "￥" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "￥" + beverage2.cost());

    }
}
