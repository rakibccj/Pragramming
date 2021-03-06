package basic.rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    static int binarySearch(ArrayList<Integer> arry, Integer left, Integer right, Integer s) {
        if (right >= left) {
            int mid = (left + right) / 2;
            if (arry.get(mid) == s) {
                return mid;
            } else if (arry.get(mid) > s) {
                return binarySearch(arry, left, right = mid - 1, s);
            } else {
                return binarySearch(arry, left = mid + 1, right, s);
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Integer l = 0, r, s;
        ArrayList<Integer> arry = new ArrayList<>(Arrays.asList(1, 2, 6, 8, 10, 34, 90, 100));
        System.out.println(arry);
        System.out.println("Give a number to search form the Array");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextInt();
        r = arry.size();
        Integer valueSearCh = binarySearch(arry, l, r, s);
        if (valueSearCh == -1) {
            System.out.println("painai");
        } else {
            System.out.println("Your location is " + valueSearCh);
        }
    }
}
