// TODO: A, add roll back time: 3
//  B, add random "好吃的" fruit;
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
                case 6:
                    System.out.println("我得到了水果");
                    fruits.add(fruitsName[random.nextInt(fruitsName.length)]);
                    break;
                default:
                    System.out.println("无事发生");
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
