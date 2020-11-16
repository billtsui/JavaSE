package person.billtsui.collection.exercise;

import java.util.HashMap;
import java.util.Map;

/**
 * @author billtsui
 * @date 2020/11/16
 * 准备一个 HashMap 集合，统计字符串"123,456,789,123,456"中每个数字字符串出现的次数并打印出来。
 */
public class MapCount {
    public static void main(String[] args) {
        String originStr = "123,456,789,123,456";
        String[] arrayStr = originStr.split(",");

        Map<String, Integer> map = new HashMap<>();
        for (String s : arrayStr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        for (String s : map.keySet()) {
            System.out.println(s + "出现了" + map.get(s) + "次");
        }
    }
}
