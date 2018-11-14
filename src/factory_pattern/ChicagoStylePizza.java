package factory_pattern;

public class ChicagoStylePizza extends Pizza {
    public ChicagoStylePizza() {
        name = "chiacgostyle pizza";
    }

    @Override
    public void cut() {
        super.cut();
        System.out.println("re cut");
    }
}
