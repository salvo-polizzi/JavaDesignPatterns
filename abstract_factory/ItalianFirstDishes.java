package abstract_factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItalianFirstDishes implements FirstDishes{
    List<String> plates = new ArrayList<>(Arrays.asList("spaghetti al pomodoro", "carbonara", "pasta alla gricia"));

    public void printNamePlates() {
        System.out.println("First Dishes:\n\t");

        for (String i : plates) {
            System.out.println("- " + i);
        }
    }
}

