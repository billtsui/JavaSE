package person.billtsui.reflact;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

/**
 * @author billtsui
 * @date 2020/12/12
 */
public class PersonConstractorTest {
    public static void main(String[] args) throws Exception {
        Person p1 = new Person();
        System.out.println("无参方式创建的对象是：" + p1);

        Class c1 = Person.class;
        System.out.println("反射创建的对象是：" + c1.newInstance());

        Constructor constructor = c1.getConstructor();
        System.out.println("无参方式创建的对象是：" + constructor.newInstance());

        Person p2 = new Person(30, "billtsui");
        System.out.println("有参方式创建的对象是：" + p2);

        Class c2 = Person.class;
        Constructor constructor1 = c2.getConstructor(int.class, String.class);
        System.out.println("反射有参方式构造的对象：" + constructor1.newInstance(30, "billtsui"));

        Constructor[] constructors = c2.getConstructors();
        for (Constructor constructor2 : constructors) {
            System.out.println("构造方法的访问修饰符是：" + constructor2.getModifiers());
            System.out.println("构造方法的方法名称是：" + constructor2.getName());
            System.out.println("构造方法的所有参数类型是：");
            for (Parameter parameter : constructor2.getParameters()) {
                System.out.println(parameter);
            }
        }
    }
}
