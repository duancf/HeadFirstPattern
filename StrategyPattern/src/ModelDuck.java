/**
 * 模型鸭
 *
 * @author duancf
 * @version 1.0
 * @className ModelDuck
 * @date created in 2023年06月25日 17:19
 * @since 1.0
 */
public class ModelDuck extends Duck{
    public ModelDuck() {
    }

    @Override
    public void display() {
        System.out.println("我是一个模型鸭");
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
