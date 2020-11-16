package person.billtsui.collection.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author billtsui
 * @date 2020/11/16
 */
public class Poker {
    public static void main(String[] args) {

        //创建扑克牌

        // key是编号，value是牌
        HashMap<Integer, String> pooker = new HashMap<Integer, String>();
        // 创建List集合，存储编号
        ArrayList<Integer> pookerNumber = new ArrayList<Integer>();
        // 定义牌号的数组
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        //定义花色
        String[] colors = {"♤", "♡", "♣", "♢"};// utf-8

        // 从2开始，0是大王，1是小王
        int index = 2;
        // 遍历数组，花色+点数的组合，存储到Map集合
        for (String number : numbers) {
            for (String huaSe : colors) {
                pookerNumber.add(index);
                pooker.put(index++, huaSe + number);
            }
        }
        pooker.put(0, "大王");
        pooker.put(1, "小王");
        pookerNumber.add(0);
        pookerNumber.add(1);
        System.out.println("扑克牌:\n" + pooker);

        // 洗牌
        Collections.shuffle(pookerNumber);
        System.out.println("洗牌结果：\n" + pookerNumber);

        // 发牌，将牌的编号，发给玩家集合，底牌集合，一共四个集合
        ArrayList<Integer> player1 = new ArrayList<Integer>();
        ArrayList<Integer> player2 = new ArrayList<Integer>();
        ArrayList<Integer> player3 = new ArrayList<Integer>();
        ArrayList<Integer> bottom = new ArrayList<Integer>();

        // 发牌过程  3个人抓牌就是 牌号 % 3
        for (int i = 0; i < pookerNumber.size(); i++) {
            if (i < 3) {
                //留三张底牌
                bottom.add(pookerNumber.get(i));
            } else if (i % 3 == 0) {
                player1.add(pookerNumber.get(i));
            } else if (i % 3 == 1) {
                player2.add(pookerNumber.get(i));
            } else if (i % 3 == 2) {
                player3.add(pookerNumber.get(i));
            }
        }

// 对玩家手中的编号排序
        System.out.println();
        System.out.println("发牌结果：");
        look("玩家1：",player1,pooker);
        look("玩家2：",player2,pooker);
        look("玩家3：",player3,pooker);
        look("底牌：",bottom,pooker);

        System.out.println();
        System.out.println("每个人的牌排序：");
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(bottom);

        // 看牌，根据玩家手中的编号，到Map集合中查找，根据键找值
        look("玩家1：",player1,pooker);
        look("玩家2：",player2,pooker);
        look("玩家3：",player3,pooker);
        look("底牌：",bottom,pooker);


    }

    /**
     * 看牌
     * @param name
     * @param player
     * @param pooker
     */
    public static void look(String name,ArrayList<Integer> player, HashMap<Integer, String> pooker) {
        System.out.print(name+" ");
        for (int i = 0; i < player.size(); i++) {
            Integer key = player.get(i);
            String value = pooker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
