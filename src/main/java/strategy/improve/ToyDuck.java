package strategy.improve;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/6/27 18:01
 * @content
 */
public class ToyDuck extends AbstractDuck {

    public ToyDuck(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    /**
     * 显示鸭子信息
     */
    @Override
    public void display() {
        System.out.println("···这是玩具鸭···");
    }

    // 需要重写父类所有方法


    @Override
    public void quack() {
        System.out.println("玩具鸭不会叫···");
    }

    @Override
    public void swim() {
        System.out.println("玩具鸭会游泳···");
    }

}
