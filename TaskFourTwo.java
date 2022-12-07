
/* Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
*/
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class TaskFourTwo {
    public static void main(String[] args) {
        int n = 5;
        LinkedList<Integer> lst = getRandomLinkedList(n);
        enqueue(lst);
        dequeue(lst);
        first(lst);
    }

    public static LinkedList<Integer> getRandomLinkedList(int n) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        // получение ранодомного linkedlista из n элементов, значения не больше 10
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            int myRandomNumber = random.nextInt(10);
            linkedList.add(myRandomNumber);
        }
        System.out.println("Исходный рандомный список " + linkedList);
        return linkedList;
    }

    public static void enqueue(LinkedList<Integer> linkedList) {
        System.out.print("Введите число для добавления его в конец списка: ");
        Scanner iScanner = new Scanner(System.in);
        int scanerNumber = iScanner.nextInt();
        linkedList.offer(scanerNumber);
        System.out.println("Список,после добавления элемента " + scanerNumber + " в конец списка:" + linkedList);

    }

    public static void dequeue(LinkedList<Integer> linkedList) {
        int firstnumber = linkedList.getFirst();
        linkedList.removeFirst();
        System.out.println("Список,после удаления первого элемента " + linkedList);
    }

    public static void first(LinkedList<Integer> linkedList) {
        int firstnumber = linkedList.getFirst();
        System.out.println("Первый элемент списка: " + firstnumber);
    }
}
