import behavior.bahaviorImpl.FlyNoWays;
import behavior.bahaviorImpl.FlyWithWings;
import behavior.bahaviorImpl.Quack;
import behavior.bahaviorImpl.Squeak;

/**
 * 测试
 *
 * @author duancf
 * @version 1.0
 * @className Main
 * @date created in 2023年06月25日 18:11
 * @since 1.0
 */
public class Main {
    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        duck1.setFlyBehavior(new FlyWithWings());
        duck1.setQuackBehavior(new Quack());
        duck1.display();
        duck1.performFly();
        duck1.performQuack();
        duck1.swim();

        Duck duck2 = new ModelDuck();
        duck2.setFlyBehavior(new FlyNoWays());
        duck2.setQuackBehavior(new Squeak());
        duck2.display();
        duck2.performFly();
        duck2.performQuack();
        duck2.swim();
    }
}
