package JavaOO;

public class Singleton {

    // private static Singleton singleton = new Singleton(); 饿汉式
    private static Singleton singleton = null; //懒汉式

    private Singleton(){
    }

    public static Singleton getInstance(){
        // return singleton; 饿汉式
        if(null == singleton){
            singleton = new Singleton();
        }
        return singleton;
    }
}
