package behavior.bahaviorImpl;

import behavior.QuackBehavior;

/**
 * 吱吱叫
 *
 * @author duancf
 * @version 1.0
 * @className Squeak
 * @date created in 2023年06月25日 17:03
 * @since 1.0
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
