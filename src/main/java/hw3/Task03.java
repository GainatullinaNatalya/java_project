package hw3;

import java.util.*;

public class Task03 {
    public static void main(String[] args) {
//        Создать список типа ArrayList<String>.
//        Поместить в него как строки, так и целые числа.
//        Пройти по списку, найти и удалить целые числа.

        List<String> mixlist = new ArrayList<>();
        mixlist.add("Hello");
        mixlist.add("42");
        mixlist.add("cat");
        mixlist.add("123");
        mixlist.add("java");
        System.out.println(mixlist);

        int n = 0;

        for (int i = 0; i < mixlist.size(); i++) {
            try {
                n = Integer.parseInt(mixlist.get(i));
                mixlist.remove(i);
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(mixlist);
    }
}