package strategy.improve;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/6/27 19:01
 * @content
 */
public class BadFlyBehavior implements FlyBehavior {
    /**
     * 由子类具体实现
     */
    public void fly() {
        System.out.println("飞翔技术一般···");
    }
}
