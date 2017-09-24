package PracExercises;

public class DemoSubscriptions {
    public static void main(String[] args) {
        PhysicalNewspaperSubscription paperPhy = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription paperOn = new OnlineNewspaperSubscription();

        PhysicalNewspaperSubscription paperPhy2 = new PhysicalNewspaperSubscription();

        System.out.println("Set name: Bob");
        paperPhy.setName("Bob");
        System.out.println("Set address: ");
        paperPhy.setAddress();
        System.out.println("Set Address: A st");
        paperPhy.setAddress("A st");
        System.out.println("Details >>");
        System.out.println("Name: " + paperPhy.getName());
        System.out.println("Address: " + paperPhy.getAddress());
        System.out.println("Price: " + paperPhy.getRate());

        System.out.println("\nSet name: Mitch");
        paperPhy2.setName("Mitch");
        System.out.println("Set Address: B st");
        paperPhy2.setAddress("B st");
        System.out.println("Details >>");
        System.out.println("Name: " + paperPhy2.getName());
        System.out.println("Address: " + paperPhy2.getAddress());
        System.out.println("Price: " + paperPhy2.getRate());

        System.out.println("\nSet Name: john");
        paperOn.setName("John");
        System.out.println("Set address: ");
        paperOn.setAddress();
        System.out.println("Set address: johngmail.com");
        paperOn.setAddress("johngmail.com");
        System.out.println("Set address: john@gmail.com");
        paperOn.setAddress("john@gmail.com");
        System.out.println("Details >>");
        System.out.println("Name: " + paperOn.getName());
        System.out.println("Address: " + paperOn.getAddress());
        System.out.println("Price: " + paperOn.getRate());
    }
}
