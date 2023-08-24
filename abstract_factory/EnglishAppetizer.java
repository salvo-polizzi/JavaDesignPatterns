package abstract_factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishAppetizer implements Appetizer {
    List<String> plates = new ArrayList<>(Arrays.asList("Scrumbled eggs", "potatos", "tomatoes"));

    public void printNamePlates() {
        System.out.println("Appetizers:\n\t");

        for (String i : plates) {
            System.out.println("- " + i);
        }

        System.out.println("");
    }
}
