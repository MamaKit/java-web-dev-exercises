package Studios.Menu091922;

import java.math.BigDecimal;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class MenuItem {
    String name;
    String description;
    String category;
    BigDecimal price;
    LocalDate dateAdded;
    boolean isNew;

    public MenuItem (String name, String description, String category, BigDecimal price, String date, boolean isNew) {
        this.isNew = isNew;
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dateAdded = LocalDate.parse(date);
    }

    public void isNew() {
        LocalDate today = LocalDate.now();
        long between = DAYS.between(this.dateAdded, today);

        if (between < 30) {
            this.isNew = true;
        } else {
            this.isNew = false;
        }
    }

}
