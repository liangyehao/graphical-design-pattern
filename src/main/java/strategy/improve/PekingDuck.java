package strategy.improve;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/6/27 17:52
 * @content
 */
public class PekingDuck extends AbstractDuck {

    public PekingDuck(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;

    }

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("···这是北京鸭···");
    }


}
