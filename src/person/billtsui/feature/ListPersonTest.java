package person.billtsui.feature;

import person.billtsui.javaoo.StaticOuter;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author billtsui
 * @date 2020/12/26
 */
public class ListPersonTest {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        Random r = new Random();
        for (int i = 1; i <= 30; i++) {
            Person person = new Person();
            person.setId(r.nextInt(100));
            person.setAge(r.nextInt(100));
            person.setName("name" + i);
            personList.add(person);
        }

        System.out.println(personList);

        //使用Stream接口实现过滤18岁以上人员的功能
        personList.stream().filter(person -> person.getAge() >= 18).forEach(person -> System.out.println(person));
        personList.stream().skip(2).limit(3).forEach(System.out::println);

        //要继承Comparable<T>接口
        personList.stream().sorted().forEach(System.out::println);

        //要重写equals方法
        personList.stream().distinct().forEach(System.out::println);

        personList.stream().map(Person::getAge).forEach(System.out::println);

        personList.stream().sorted(Comparator.comparingInt(Person::getAge)).forEach(System.out::println);

        boolean result = personList.stream().allMatch(person -> person.getAge() <= 100);

        Optional<Person> max = personList.stream().max(Comparator.comparingInt(Person::getAge));

        System.out.println(max);

        Optional<Integer> reduce = personList.stream().map(Person::getAge).reduce(Integer::sum);

        System.out.println(reduce);

    }
}
