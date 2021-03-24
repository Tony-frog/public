package day09.javase.base;
class Singleton01{
    //�����Ƚ�����ֻ�е�����getInstance��ʱ�򣬲Ż�ȥ��ʼ�����������
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
    //����������һ�����أ��Ͱѵ�����ʼ����ɣ���֤getInstance��ʱ�򣬵������Ѿ����ڵ��ˡ�
    private final static Singleton Instance =new Singleton();
    private Singleton(){}//���췽��˽�л�
    public static Singleton getInstance() {//�ṩһ�������ķ���
        return Instance;
    }



    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
//        Singleton01 s = Singleton01.getInstance();
//        Singleton01 s1 = Singleton01.getInstance();
        System.out.println(s==s1);  //true��ʾ��ͬһ������
    }
}
