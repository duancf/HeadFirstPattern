package behavior.bahaviorImpl;

import behavior.QuackBehavior;

/**
 * 呱呱叫
 *
 * @author duancf
 * @version 1.0
 * @className Quack
 * @date created in 2023年06月25日 17:01
 * @since 1.0
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }
}
