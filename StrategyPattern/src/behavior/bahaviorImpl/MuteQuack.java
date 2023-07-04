package behavior.bahaviorImpl;

import behavior.QuackBehavior;

/**
 * 不会叫
 *
 * @author duancf
 * @version 1.0
 * @className MuteQuack
 * @date created in 2023年06月25日 17:04
 * @since 1.0
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
