// TODO: A, add roll back & roll back times: 3
//  B, add random fruit;
//  C, add roll 3 & 4;
//  D, add VIP: roll back time without limit & only get "好吃的" fruit after roll back

package session1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final String[] fruitsName = {"苹果", "桃子", "梨子", "甘蔗"};
        Random random = new Random();
        //init money and fruits
        int money = 100;
        ArrayList<String> fruits = new ArrayList<>();
        int money2 = 100;
        ArrayList<String> fruits2 = new ArrayList<>();
        int count = 3;
        //start game:
        for (int i = 0; i < 100; i++) {
            System.out.println("这是第" + i + "句游戏:");
            int roll = random.nextInt(6) + 1;
            switch (roll) {
                case 1:
                    System.out.println("我的金币增加了");
                    money += 100;
                    break;
                case 2:
                    System.out.println("我的金币减少了");
                    money /= 2;
                    break;
                case 3:
                    System.out.println("我得到了随机水果");
                    fruits.add(fruitsName[random.nextInt(fruitsName.length)]);
                    break;
                case 4:
                    System.out.println("我得到了随机水果");
                    fruits.add(fruitsName[random.nextInt(fruitsName.length)]);
                case 6:
                    System.out.println("我得到了随机水果");
                    fruits.add(fruitsName[random.nextInt(fruitsName.length)]);
                    break;
                default:
                    System.out.println("无事发生");
            }
            if (money > money2) {
                money2 = money;
                fruits2.clear();
                fruits2.addAll(fruits);
                System.out.println("存储成功！");
            }
            if (money < money2 / 2) {
                if (count < 1) {
                    System.out.println("重试次数用尽！");
                } else {
                    money = money2;
                    fruits.clear();
                    fruits.addAll(fruits2);
                    count--;
                    System.out.println("胜败乃兵家常事，大侠请重新来过！");
                }
            }
            System.out.println("金币：" + money + " 水果：" + fruits);
            //let the game slower
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
