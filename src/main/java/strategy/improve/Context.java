package strategy.improve;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/6/27 19:05
 * @content
 */
public class Context {

    public static void main(String[] args) {
//        AbstractDuck duck = new WildDuck(new GoodFlyBehavior());
//        AbstractDuck duck = new PekingDuck(new BadFlyBehavior());
        AbstractDuck duck = new ToyDuck(new NoFlyBehavior());
        duck.display();
        duck.fly();
    }
}
