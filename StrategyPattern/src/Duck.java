import behavior.FlyBehavior;
import behavior.QuackBehavior;

/**
 * 鸭子抽象类
 *
 * @author duancf
 * @version 1.0
 * @className Duck
 * @date created in 2023年06月25日 16:52
 * @since 1.0
 */
public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void display(){
        System.out.println("抽象鸭子");
    };

    public void swim(){
        System.out.println("鸭子都会游泳");
    }

    public void performQuack(){
        System.out.println("鸭子叫");
    }

    public void performFly(){
        System.out.println("鸭子飞");
    }
}
