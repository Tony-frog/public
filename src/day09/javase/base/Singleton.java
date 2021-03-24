package day09.javase.base;
class Singleton01{
    //懒汉比较懒，只有当调用getInstance的时候，才回去初始化这个单例。
    private static volatile Singleton01 singleton01;
    private Singleton01() {}
    public static Singleton01 getInstance() {
        if (singleton01 == null) {
            synchronized (Singleton01.class) {
                if (singleton01 == null) {
                    singleton01 = new Singleton01();
                }
            }
        }
        return singleton01;
    }
}

public class Singleton {
    //饿汉就是类一旦加载，就把单例初始化完成，保证getInstance的时候，单例是已经存在的了。
    private final static Singleton Instance =new Singleton();
    private Singleton(){}//构造方法私有化
    public static Singleton getInstance() {//提供一个公开的方法
        return Instance;
    }



    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
//        Singleton01 s = Singleton01.getInstance();
//        Singleton01 s1 = Singleton01.getInstance();
        System.out.println(s==s1);  //true表示是同一个对象
    }
}
