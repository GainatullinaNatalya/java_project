package hw5;

//        1. Реализуйте структуру телефонной книги с помощью HashMap,
//        учитывая, что 1 человек может иметь несколько телефонов.

import java.util.*;
public class Task01 {

    public static void main(String[] args) {
        Map<String, List<String>> contacts = new HashMap<>();
        contacts.put("Иванов", List.of("4-52-536", "7-52-896"));
        contacts.put("Петрова", List.of("3-65-852", "1-36-856"));
        contacts.put("Белова", List.of("8-96-659", "7-96-356"));
        contacts.put("Мусина", List.of("6-69-987", "6-35-251"));
        contacts.put("Крутова", List.of("2-36-695", "5-69-852"));
        contacts.put("Юрин", List.of("3-36-369", "5-55-555"));

        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию для поиска: ");
        String surname = in.nextLine();
        in.close();
        System.out.printf("%s - номера телефонов: %s", surname, contacts.get(surname));
    }
}

