import java.util.ArrayList;
import java.util.Iterator;

/*Пусть дан произвольный список целых чисел, удалить из него четные числа*/

public class TaskThreeTwo {
    public static void main(String[] args) {
        deleteEvenNumbers(getRandomArrayList());
    }

    // получение ранодомного arraylist из 10 элементов
    public static ArrayList<Integer> getRandomArrayList() {
        int n = 10;
        ArrayList<Integer> arrayRandomList = new ArrayList<>(n);

        for (int i = 0; i < 10; i++) {
            arrayRandomList.add((int) Math.round((Math.random() * 10)));
        }
        System.out.println("Рандомный список из 10 элементов\n" + arrayRandomList);
        return arrayRandomList;
    }

    public static void deleteEvenNumbers(ArrayList<Integer> arrayRandom) {

        for (Iterator<Integer> iterator = arrayRandom.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                iterator.remove();
            }
        }
        System.out.println("Обработанный список из нечетных элементов\n" + arrayRandom);
    }
}

// //получение ранодомного одномерного массива из 10 элементов
// public static int[] getRandomArray() {
// int n = 10;
// int[] arrayRandom = new int[n];

// for (int i = 0; i < 10; i++) {
// arrayRandom[i] = (int) (Math.random() * 10);
// System.out.println(arrayRandom[i]);
// }
// return arrayRandom;
// }