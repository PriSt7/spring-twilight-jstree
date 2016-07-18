package com.prist.util;

/**
 * @author xiaofeng.huang
 * @date 16/7/14
 * @time 21:55
 */
public class WineQuestion {

    public static void main(String[] args) {
        System.out.println(WineQuestion.calculate(10));
    }

    /**
     * @param money
     * @return
     */
    public static int calculate(int money) {
        int bottlesNum = money / 2;
        return exchange(bottlesNum);

    }


    public static int exchange(int bottles) {
        int emptyBottles = bottles;
        int wineCover = bottles;
        if (emptyBottles < 2 && wineCover < 4) {
            // 递归终止条件
            return 0;
        } else {
            return bottles + exchange(emptyBottles / 2 + wineCover / 4);
        }
    }
}
