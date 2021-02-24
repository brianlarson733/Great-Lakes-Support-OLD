package prototype.items;

public class ItemDriver {
    public static void main(String args[]) {

        SwordItem ns = new SwordItem();
        System.out.println(ns);

        HealthItem nh = new HealthItem("This is a health item", "Potion");
        System.out.println(nh);
    }
}