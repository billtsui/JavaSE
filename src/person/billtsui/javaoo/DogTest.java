package person.billtsui.javaoo;

/**
 * @author Bill Tsui
 * @date 2020/10/24 18:23
 */
public class DogTest {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.show();

        Dog d2 = new Dog("旺财","白色",10);
        d2.show();
    }
}
