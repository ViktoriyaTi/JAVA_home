import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Laptop {
    private String computerProcessor;
    private Float diagonal;
    private Integer rAm;
    private String countryOfOrigin;
    private String brandName;

    public Laptop(String computerProcessor, float diagonal, int rAm, String country, String brand) {
        this.computerProcessor = computerProcessor;
        this.diagonal = diagonal;
        this.rAm = rAm;
        this.countryOfOrigin = country;
        this.brandName = brand;
    }

    public String getСomputerProcessor() {
        return computerProcessor;
    }

    public void setСomputerProcessor(String computerProcessor) {
        this.computerProcessor = computerProcessor;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(float diagonal) {
        this.diagonal = diagonal;
    }

    public int getRAM() {
        return rAm;
    }

    public void setRAM(int rAm) {
        this.rAm = rAm;
    }

    public String getModel() {
        return countryOfOrigin;
    }

    public void setModel(String country) {
        this.countryOfOrigin = country;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brand) {
        this.brandName = brand;
    }

    public String toString() {
        return "Бренд: " + brandName + " " + "Процессор: " + computerProcessor + " " + "Страна: " + countryOfOrigin;
    }

    public static String getFilterName() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Отфильтровать данные по бренду. Введите название бренда: ");
        String desiedBrand = iScanner.next();
        iScanner.close();
        return desiedBrand;
    }

    public static void getFilteredInfo(String desiedBrand, HashSet<Laptop> laptopsSet) {
        for (Laptop elem : laptopsSet) {
            if (elem.brandName.equalsIgnoreCase(desiedBrand))
                System.out.println(elem);

        }

    }

    public static void getFilteredCountry(String filterCountry, HashSet<Laptop> laptopsSet) {
        for (Laptop elem : laptopsSet) {
            if (elem.countryOfOrigin.equalsIgnoreCase(filterCountry))
                System.out.println(elem);

        }
    }

    public static void getFilteredCountryAndBrand(String country, String brand, HashSet<Laptop> laptopsSet) {
        for (Laptop elem : laptopsSet) {
            if ((elem.countryOfOrigin.equalsIgnoreCase(country)) && (elem.brandName.equalsIgnoreCase(brand)))
                System.out.println(elem);

        }
    }

    public static void getInfo(HashSet<Laptop> laptopsSet) {
        System.out.println("Возможные фильтры: ");
        Map<Integer, String> mapOfLaptopsSpecifications = new HashMap<>();
        mapOfLaptopsSpecifications.put(1, "страна производства");
        mapOfLaptopsSpecifications.put(2, "бренд");
        mapOfLaptopsSpecifications.put(3, "страна производства и бренд");
        System.out.println(mapOfLaptopsSpecifications);
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите значение по которому будет отфильтровываться информация: ");
        int number = iScanner.nextInt();
        if (number == 1) {
            System.out.println("Введите название страны: ");
            String filterCountry = iScanner.next();
            getFilteredCountry(filterCountry, laptopsSet);
        } else if (number == 2) {
            System.out.println("Введите название бренда: ");
            String filterBrand = iScanner.next();
            getFilteredInfo(filterBrand, laptopsSet);
        } else {
            System.out.println("Введите название страны: ");
            String filterCountryOne = iScanner.next();
            System.out.println("Введите название бренда: ");
            String filterBrandTwo = iScanner.next();
            getFilteredCountryAndBrand(filterCountryOne, filterBrandTwo, laptopsSet);
        }
        iScanner.close();
    }

}
