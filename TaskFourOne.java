import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/* Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список */

public class TaskFourOne {
    public static void main(String[] args) {
        int n = 5;
        getReverseLinkedList(n);
    }

    public static LinkedList<Integer> getReverseLinkedList(int n) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        // получение ранодомного linkedlista из n элементов, значения не больше 100
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int myRandomNumber = random.nextInt(100);
            linkedList.add(myRandomNumber);
        }
        System.out.println("Рандомный список из " + n + " элементов:\n" + linkedList);
        // перевернутый список
        Collections.reverse(linkedList);
        System.out.println("Перевернутый список из " + n + " элементов:\n" + linkedList);
        return linkedList;

    }
}