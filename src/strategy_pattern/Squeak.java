package strategy_pattern;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("嘎嘎嘎");
    }
}
