package strategy.improve;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/6/27 17:51
 * @content
 */
public class WildDuck extends AbstractDuck {

    public WildDuck(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("···这是野鸭···");
    }
}
