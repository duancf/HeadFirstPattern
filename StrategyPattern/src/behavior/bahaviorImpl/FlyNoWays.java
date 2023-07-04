package behavior.bahaviorImpl;

import behavior.FlyBehavior;

/**
 * 不会飞的行为
 *
 * @author duancf
 * @version 1.0
 * @className FlyNoWays
 * @date created in 2023年06月25日 16:59
 * @since 1.0
 */
public class FlyNoWays implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
