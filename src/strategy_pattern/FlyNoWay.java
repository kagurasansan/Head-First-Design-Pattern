package strategy_pattern;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我是个不会飞的鸭子");
    }
}
