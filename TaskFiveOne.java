import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что 1 человек может иметь несколько телефонов. */

public class TaskFiveOne {
    public static void main(String[] args) {
        System.out.println("Введите фамилию сотрудника: ");
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.next();
        Map<String, String> resultPhoneBook = fillPhoneBook();
        getPhoneInfoByName(resultPhoneBook, name);
        iScanner.close();

    }

    public static Map<String, String> fillPhoneBook() {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("89091872543", "Ivanov");
        phoneBook.put("84991324533", "Kirillov");
        phoneBook.put("89161672221", "Ivanov");
        phoneBook.put("89051672100", "Torgov");
        return phoneBook;

    }

    public static void getPhoneInfoByName(Map<String, String> phoneBook, String name) {

        for (Map.Entry<String, String> phoneBookEntry : phoneBook.entrySet()) {
            if (phoneBookEntry.getValue().equalsIgnoreCase(name)) {
                System.out.println(phoneBookEntry.getKey());
            }
        }

    }
}
