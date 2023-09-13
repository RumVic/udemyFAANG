package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayTwoSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        int [] t = {1,2,4,2,9};
        System.out.println(Arrays.toString(twoSum(t, target)));

    }

    public  static  int[] twoSum(int[] integerList, int target) {
        int[] t = new int[2];

        HashMap<String, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < integerList.length; i++) {
            if (myHashMap.containsKey(String.valueOf(integerList[i]))) {
                t[0]=i;
                t[1]= myHashMap.get(String.valueOf(integerList[i]));
            } else {
                int numberToFind = target - integerList[i];
                myHashMap.put(String.valueOf(numberToFind), i);
            }
        }return t;
    }
}
