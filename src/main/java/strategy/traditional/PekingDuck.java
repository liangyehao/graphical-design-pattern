package strategy.traditional;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/6/27 17:52
 * @content
 */
public class PekingDuck extends AbstractDuck {
    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("···这是北京鸭···");
    }

    @Override
    public void fly() {
        System.out.println("北京鸭不会飞翔···");
    }
}
