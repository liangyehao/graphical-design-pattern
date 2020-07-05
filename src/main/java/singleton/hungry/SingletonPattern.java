package singleton.hungry;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/5 21:41
 * @content
 */
public class SingletonPattern {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
    }

}

class Singleton{

    private Singleton(){}

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }
}