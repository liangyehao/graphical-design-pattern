package strategy.traditional;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/6/27 18:03
 * @content
 */
public class Client {
    public static void main(String[] args) {
//        AbstractDuck duck = new ToyDuck();
        AbstractDuck duck = new PekingDuck();
        duck.display();
        duck.quack();
        duck.swim();
        duck.fly();
    }
}
