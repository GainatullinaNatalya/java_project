package hw4;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
//        1. Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.

        LinkedList<String> consoleList = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку через Enter. По окончании введите слово 'print': ");
        while (true) {
            String consoleString = in.nextLine();
            if (consoleString.equalsIgnoreCase("print")) {
                Iterator<String> i = consoleList.iterator();
                while (i.hasNext()) {
                    System.out.println(i.next());
                }
            } else if (consoleString.equalsIgnoreCase("revert")) {

                consoleList.pop();
            } else {

                consoleList.push(consoleString);
            }
        }
    }
}