package person.billtsui.designpattern;

/**
 * @author billtsui
 * @date 2020/12/20
 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }

            }
        }
        return singleton;
    }
}
