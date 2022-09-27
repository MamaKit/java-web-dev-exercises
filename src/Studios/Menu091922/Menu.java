package Studios.Menu091922;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    public static LocalDate dateUpdated;

    public static void main(String[] args) {
        MenuItem grilledCheese = new MenuItem("Grilled Cheese", "Griddle-cooked colby jack cheese sandwich on white bread", "main course", 6.99, "2022-07-15");
        MenuItem cheesecake = new MenuItem("Cheesecake", "It's cheesecake. What more do you want to know?","dessert",9.99, "2021-01-01");
        MenuItem mozzarella = new MenuItem("Mozzarella Sticks", "")
        ArrayList<MenuItem> menu = new ArrayList<>();
        menu.add(grilledCheese);
        menu.add(cheesecake);
        dateUpdated = LocalDate.now();
        System.out.print(menu);
    }
}
