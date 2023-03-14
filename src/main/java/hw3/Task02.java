package hw3;

import java.util.*;

public class Task02 {
    public static void main(String[] args) {
//        Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
        maxMinAverageList();
    }

    private static void maxMinAverageList() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        int sum = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }

        int average = sum / arrayList.size();
        System.out.println(arrayList);
        System.out.println("min = " + Collections.max(arrayList));
        System.out.println("max = " + Collections.min(arrayList));
        System.out.println("μ = " + average);
    }
}

