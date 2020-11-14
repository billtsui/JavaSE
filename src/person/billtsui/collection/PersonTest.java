package person.billtsui.collection;

/**
 * @author billtsui
 * @date 2020/11/14
 */
public class PersonTest {
    public static void main(String[] args) {
        Person<String> person = new Person<>("billtsui", 25, "male");
        System.out.println("name: " + person.getName() + " age: " + person.getAge() + " Sex: " + person.getGender());

        System.out.println("----------");
        String[] name = new String[]{"张飞", "关羽"};
        person.printArray(name);
    }
}
