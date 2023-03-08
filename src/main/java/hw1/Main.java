package hw1;

import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
//        1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
        int[] arr = {5, 10, 6, 2, 9, 1, 32, 20, 0};
        System.out.printf("max = %d, min = %d", findMax(arr), findMin(arr));

        System.out.println();

//        2. Дан массив nums = [3,2,2,3] и число val = 3.
//        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] nums2 = numToEnd(nums, val);

        for (int i = 0; i < nums.length; i++)
            System.out.print(nums2[i] + " ");

        System.out.println();

//        3. В консоли запросить имя пользователя.
//        В зависимости от текущего времени, вывести приветствие
        inputNameAndPrintHiByTime();
    }

    private static int findMax(int[] arr) {
        int maxx = arr[0];
        for (int i : arr) {
            if (i > maxx) {
                maxx = i;
            }
        }
        return maxx;
    }

    private static int findMin(int[] arr) {
        int minn = arr[0];
        for (int i : arr) {
            if (i < minn) {
                minn = i;
            }
        }
        return minn;
    }


    static int[] numToEnd(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[j] == val) {
                j--;
            }
            if (nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
        }
        return nums;
    }

    public static void inputNameAndPrintHiByTime() {
        System.out.println("Enter your name: ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        in.close();
        if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
            System.out.printf("Добрый день, %s!", name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
            System.out.printf("Добрый вечер, %s!", name);
        } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
                && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
            System.out.printf("Доброй ночи, %s!", name);
        }
    }
}


