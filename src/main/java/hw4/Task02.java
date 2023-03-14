package hw4;

import java.util.*;
public class Task02 {
    public static void main(String[] args) {
//        2. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
        Random random = new Random();
        LinkedList<Integer> randList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            randList.add(random.nextInt(1, 100));
        }
        System.out.println(randList);

        for (int i = 0; i < 10; i++) {
            System.out.print(randList.getLast() + ", ");
            randList.removeLast();
        }
    }
}
