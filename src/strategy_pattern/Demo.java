package strategy_pattern;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args){
        Duck duck = new MallarDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyNoWay());
        duck.performFly();
        duck.performQuack();
    }
}
