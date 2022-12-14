import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Laptop laptopOne = new Laptop("Intel Core i3 1115G4 3.0", 15.6F, 8, "China", "Xiaomi");
        Laptop laptopTwo = new Laptop("Intel Core i3 1115G4 3.0", 14.0F, 8, "China", "ASUS");
        Laptop laptopThree = new Laptop("Apple M1 Pro", 14.2F, 16, "USA", "Apple");
        Laptop laptopFour = new Laptop("Intel Core i3 1115G4 3.0", 17.2F, 8, "Malaysia", "ASUS");
        // System.out.println(laptopOne);
        HashSet<Laptop> laptopsSet = new HashSet<>();
        laptopsSet.add(laptopOne);
        laptopsSet.add(laptopTwo);
        laptopsSet.add(laptopThree);
        laptopsSet.add(laptopFour);
        System.out.println("Множество ноутбуков:\n" + laptopsSet);
        // Laptop.getFilteredInfo(Laptop.getFilterName(), laptopsSet);
        Laptop.getInfo(laptopsSet);
    }

}
