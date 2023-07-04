/**
 * 绿头鸭
 *
 * @author duancf
 * @version 1.0
 * @className MallardDuck
 * @date created in 2023年06月25日 17:13
 * @since 1.0
 */
public class MallardDuck extends Duck{

    public MallardDuck() {
    }

    @Override
    public void display() {
        System.out.println("我是一个绿头鸭");
    }

    @Override
    public void performQuack() {
        quackBehavior.quack();
    }

    @Override
    public void performFly() {
        flyBehavior.fly();
    }
}
