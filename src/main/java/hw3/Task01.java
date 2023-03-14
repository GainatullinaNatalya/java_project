package hw3;


import java.util.*;

public class Task01 {
    public static void main(String[] args) {
//        Пусть дан произвольный список целых чисел, удалить из него четные числа
//        1 способ:
        randomArraySelectOddNum();
//        2 способ:
        randomArrayDeleteEvenNum();
    }

    private static void randomArraySelectOddNum() {
        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        System.out.println(arrayList);
        arrayList.stream().filter(n -> n % 2 == 1).forEach(System.out::println);
    }

    private static void randomArrayDeleteEvenNum() {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1, 100));
        }
        System.out.printf("Random list: %s", numbers);

        System.out.println();

        int i = 0;
        while (i < numbers.size()) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("list with deleted even numbers: %s", numbers);
    }
}