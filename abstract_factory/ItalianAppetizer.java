package abstract_factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ItalianAppetizer implements Appetizer{
    List<String> plates = new ArrayList<>(Arrays.asList("Uova strapazzate", "patate", "pomodori"));

    public void printNamePlates() {
        System.out.println("Antipasti:\n\t");

        for (String i : plates) {
            System.out.println("- " + i);
        }
    }
}
