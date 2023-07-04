package behavior.bahaviorImpl;

import behavior.FlyBehavior;

/**
 * 鸭子向前飞实现类
 *
 * @author duancf
 * @version 1.0
 * @className FlyWithWings
 * @date created in 2023年06月25日 16:57
 * @since 1.0
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("向前飞");
    }
}
