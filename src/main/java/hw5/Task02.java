package hw5;

//2. Пусть дан список сотрудников. Написать программу,
// которая найдёт и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности.
import java.util.*;
public class Task02 {
    public static void main(String[] args) {
        Map<String, Integer> employees = new HashMap<>();
        String listOfEmployees = "Иван Иванов " +
                "Светлана Петрова " +
                "Кристина Белова " +
                "Анна Мусина " +
                "Анна Крутова " +
                "Иван Юрин " +
                "Петр Лыков " +
                "Павел Чернов " +
                "Петр Чернышов " +
                "Мария Федорова " +
                "Марина Светлова " +
                "Мария Савина " +
                "Мария Рыкова " +
                "Марина Лугова " +
                "Анна Владимирова " +
                "Иван Мечников " +
                "Петр Петин " +
                "Иван Ежов ";

        String[] listOfNames = listOfEmployees.split(" ");
        for (int i = 0; i < listOfNames.length; i += 2) {
            if (employees.containsKey(listOfNames[i])) {
                employees.replace(listOfNames[i], employees.get(listOfNames[i]) + 1);
            } else {
                employees.put(listOfNames[i], 1);
            }
        }

        Map<String, Integer> newEmployees = new LinkedHashMap<>();
        int max = 1;
        for (int value : employees.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : employees.entrySet()) {
                String key = entry.getKey();
                if (employees.get(key) == i) {
                    newEmployees.put(key, employees.get(key));
                }
            }
        }
        System.out.println(newEmployees);
    }
}

