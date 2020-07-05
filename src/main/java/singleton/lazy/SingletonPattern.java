package singleton.lazy;

/**
 * @author liangyehao
 * @version 1.0
 * @date 2020/7/5 21:45
 * @content
 */
public class SingletonPattern {
    public static void main(String[] args) {
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton1.getInstance());
        System.out.println(Singleton2.getInstance());
        System.out.println(Singleton2.getInstance());
    }
}


/**
 * Singleton1: synchronized锁住获取实例方法
 *
 * @author liangyehao
 * @date 2020/07/05
 */
class Singleton1{

    private Singleton1(){}

    private static Singleton1 singleton1;


    /**
     * 获得实例
     * synchronized锁住获取实例的方法
     *
     * -只是第一次的时候需要锁
     * -实例创建后每次获取都有锁,性能低
     *
     * @return {@link Singleton1}
     */
    public synchronized static Singleton1 getInstance(){
        if (singleton1==null) {singleton1 = new Singleton1();}
        return singleton1;
    }
}

/**
 * Singleton2: 双重检查所锁
 *
 * @author liangyehao
 * @date 2020/07/05
 */
class Singleton2{

    private Singleton2(){}


    /**
     * 使用volatile关键字防止指令重排
     *
     * new Singleton2() 可以分解为3步:
     *   1.分配内存
     *   2.初始化对象
     *   3.指向刚分配的内存
     *
     * 假设A线程执行了1和3,还没执行2,B线程来判断null,B线程就会返回还没实例化的instance
     */
    private volatile static Singleton2 singleton2;


    /**
     * 获得实例
     *
     * 双重检查锁可以去掉方法synchronized关键字,提高性能
     *
     * @return {@link Singleton2}
     */
    public static Singleton2 getInstance(){
        if (singleton2 == null) {
            synchronized (Singleton2.class){
                if (singleton2 == null) {
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}