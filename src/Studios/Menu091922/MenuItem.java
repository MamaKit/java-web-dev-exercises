package Studios.Menu091922;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import static java.time.temporal.ChronoUnit.DAYS;

public class MenuItem {
    String name;
    String description;
    String category;
    double price;
    LocalDate dateAdded;
    boolean newItem;

    public MenuItem (String name, String description, String category, double price, String date) {
        this.dateAdded = LocalDate.parse(date);
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public String toString() {
        if (this.isNew()) {
            return "NEW ITEM! " + name + " " + price + "\n" + description;
        } else {
            return name + " " + price + "\n" + description;
        }
    }

    public boolean isNew() {
        LocalDate today = LocalDate.now();
        long between = DAYS.between(this.dateAdded, today);

        if (between <= 7) {
            return true;
        } else {
            return false;
        }
    }


}
