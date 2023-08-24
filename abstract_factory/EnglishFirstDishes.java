package abstract_factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishFirstDishes implements FirstDishes{
    List<String> plates = new ArrayList<>(Arrays.asList("spaghetti meatball", "carbonara", "alfredo"));

    public void printNamePlates() {
        System.out.println("First Dishes:\n\t");

        for (String i : plates) {
            System.out.println("- " + i);
        }
    }
}
