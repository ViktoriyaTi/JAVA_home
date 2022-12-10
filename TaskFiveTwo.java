
/*Пусть дан список сотрудников:Иван Иванов.
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeMap;

public class TaskFiveTwo {
    public static void main(String[] args) {
        getDublicatenamesOfListEmployees();
    }

    public static void getDublicatenamesOfListEmployees() {
        String[] str = { "Ivanov Ivan", "Fedotov Ivan", "Petrov Sergey", "Nikonov Niko", "Danilov Sergey",
                "Mozaikin Ivan", "Terexov Ivan" };
        ArrayList<String> listOfEmployees = new ArrayList<>(Arrays.asList(str));
        TreeMap<Integer, String> names = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < listOfEmployees.size(); i++) {
            String[] surnames = listOfEmployees.get(i).split(" ");
            String name = surnames[1];
            int count = 0;
            for (int j = 0; j < listOfEmployees.size(); j++) {
                String[] surname1 = listOfEmployees.get(j).split(" ");
                String name1 = surname1[1];
                if (name.equals(name1)) {
                    count++;
                }
            }
            if (!names.containsValue(name)) {
                names.put(count, name);
            }
        }
        for (var el : names.entrySet()) {
            System.out.print(el.getKey() + " " + el.getValue() + "\n");
        }
    }
}
