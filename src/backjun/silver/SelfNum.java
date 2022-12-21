package backjun.silver;

import java.util.ArrayList;
import java.util.Collections;

public class SelfNum {
    public static void main(String[] args) {
        int[] value = new int[10000];
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < value.length; i++) {
            value[i] = i + 1;
        }

        for (int i = 1; i < value.length; i++) {
            int num = not_selfNum(i);
            arr.add(num);
        }
        Collections.sort(arr);

        for (Integer integer : arr) {
            for (int j = 0; j < value.length; j++) {
                if (integer == value[j]) {
                    value[j] = 0;
                }
            }
        }
        for (int j : value) {
            if (j != 0) {
                System.out.println(j);
            }
        }

        int a = 1999;

    }

    public static int not_selfNum(int i) {
        int a = String.valueOf(i).length();
        int b = i;
        int input = b;
        if (a == 1) {
            input += b;
        } else {
            for (int j = 0; j < a; j++) {
                input += b % 10;
                b = b / 10;
            }
        }
        return input;
    }
}
