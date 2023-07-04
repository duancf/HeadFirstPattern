/**
 * 红头鸭
 *
 * @author duancf
 * @version 1.0
 * @className RedHeadDuck
 * @date created in 2023年06月25日 17:17
 * @since 1.0
 */
public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
    }

    @Override
    public void display() {
        System.out.println("我是一个红头鸭");
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
