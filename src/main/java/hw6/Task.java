package hw6;
// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
// Создать множество ноутбуков (ArrayList).
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
// Например, спросить у пользователя минимальный размер оперативной памяти или конкретный цвет.
// Выводить только те ноутбуки, что соответствуют условию

import java.util.*;

public class Task {
    public static void main(String[] args) {
        laptop l1 = new laptop("Apple", "17", "black", "Intel", "16");
        laptop l2 = new laptop("Dell", "14", "white", "AMD", "4");
        laptop l3 = new laptop("LG", "15", "black", "Intel", "16");
        laptop l4 = new laptop("Aser", "17", "green", "AMD", "8");
        laptop l5 = new laptop("Asus", "14", "black", "Intel", "16");

        List<laptop> laptopList = List.of(l1, l2, l3, l4, l5);

        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер параметра поиска:\n1 - название\n2 - диагональ экрана\n3 - цвет\n4 - процессор\n5 - размер ОП");
        int characteristic = in.nextInt();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомую характеристику: ");
        String typeOfCharacteristic = scanner.nextLine();

        if (characteristic == 1) {
            for (laptop name : laptopList) {
                if (name.getName().equalsIgnoreCase(typeOfCharacteristic)) {
                    System.out.println(name.toString());
                }
            }
        } else if (characteristic == 2) {
            for (laptop screenDiagonal : laptopList) {
                if (screenDiagonal.getScreenDiagonal().equalsIgnoreCase(typeOfCharacteristic)) {
                    System.out.println(screenDiagonal.toString());
                }
            }
        } else if (characteristic == 3) {
            for (laptop color : laptopList) {
                if (color.getColor().equalsIgnoreCase(typeOfCharacteristic)) {
                    System.out.println(color.toString());
                }
            }
        } else if (characteristic == 4) {
            for (laptop processes : laptopList) {
                if (processes.getProcesses().equalsIgnoreCase(typeOfCharacteristic)) {
                    System.out.println(processes.toString());
                }
            }
        } else if (characteristic == 5) {
            for (laptop ramSize : laptopList) {
                if (ramSize.getRamSize().equalsIgnoreCase(typeOfCharacteristic)) {
                    System.out.println(ramSize.toString());
                }
            }
        } else {
            System.out.println("Нет такого параметра");
        }
        in.close();

        System.out.println(l1.equals(l3));
        System.out.println(l2.hashCode());
    }
}
