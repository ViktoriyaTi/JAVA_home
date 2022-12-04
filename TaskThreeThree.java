
/*Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка. */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TaskThreeThree {

    public static void main(String[] args) {
        int n = 10;
        getMaxAndMinAndAverageNumbers(getRandomArrayList(n), n);
    }

    // получение ранодомного arraylist через Random из 10 элементов, значения не
    // больше 50
    public static ArrayList<Integer> getRandomArrayList(int n) {

        ArrayList<Integer> arrayRandom = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int myRandomNumber = random.nextInt(50);
            arrayRandom.add(myRandomNumber);
        }
        System.out.println("Рандомный список из 10 элементов\n" + arrayRandom);
        return arrayRandom;
    }

    public static void getMaxAndMinAndAverageNumbers(ArrayList<Integer> arrayRandom, int n) {
        int max = 0;
        int min = 0;
        float averageNumber = 0;
        int sum = 0;
        Collections.sort(arrayRandom);
        min = arrayRandom.get(0);
        System.out.println("Минимальное значение:" + min);
        max = arrayRandom.get(arrayRandom.size() - 1);
        System.out.println("Максимальное значение:" + max);
        for (int i = 0; i < arrayRandom.size(); i++) {
            sum += arrayRandom.get(i);
        }
        System.out.println(sum);
        averageNumber = sum / n;
        System.out.println("Среднее значение:" + averageNumber);

    }

}
