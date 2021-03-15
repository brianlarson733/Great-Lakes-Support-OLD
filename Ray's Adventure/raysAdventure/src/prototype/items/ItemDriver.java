package prototype.items;

public class ItemDriver {
    public static void main(String args[]) {

        SwordItem ns = new SwordItem();
        System.out.println(ns);

        HealthItem nh = new HealthItem("The item appears as a perfect sphere with a red liquid inside",
                "Restorationation");
        System.out.println(nh);

        SpaceSuitItem newsuit = new SpaceSuitItem("The space suit has a faded white and blue " +
                "checkered pattern", "Portal 6.0");
        System.out.println(newsuit);

    }
}