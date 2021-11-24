import java.util.Arrays;

/**
 * @description:
 * @author: WenRuo
 * @date: 2021/11/23 16:27
 */

public class Test {


    public static void main(String[] args) {

        int[] money = new int[100];
        for (int i = 0; i < money.length; i++)
            money[i] = 100;

        for (int t = 0; t < 100; t++) {
            for (int i = 0; i < money.length; i++) {
                if (money[i] > 0) {
                    int j = (int) (Math.random() * money.length);
                    money[i] -= 1;
                    money[j] += 1;
                }
            }
        }

        Arrays.sort(money);
        for (int i = 0; i < money.length; i++)
            System.out.print(money[i] + " ");
    }
}
