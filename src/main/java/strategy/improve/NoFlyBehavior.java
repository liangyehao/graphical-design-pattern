package strategy.improve;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/6/27 19:02
 * @content
 */
public class NoFlyBehavior implements FlyBehavior {
    /**
     * 由子类具体实现
     */
    public void fly() {
        System.out.println("不会飞翔···");
    }
}
