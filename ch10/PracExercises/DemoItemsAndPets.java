package PracExercises;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold fish = new ItemSold();

        fish.setDescription("Goldfish");
        fish.setInvoiceNo(52497);
        fish.setPrice(10.50);

        System.out.println("Item Sold: " + fish.getDescription());
        System.out.println("Invoice #: " + fish.getInvoiceNo());
        System.out.println("Price: " + fish.getPrice());

        PetSold pet = new PetSold();

        pet.setDescription("Puppy");
        pet.setInvoiceNo(64885);
        pet.setPrice(100.50);
        pet.setVaccinated(true);
        pet.setNeutered(false);
        pet.setHousebroken(true);

        System.out.println("\nPet Sold: " + pet.getDescription());
        System.out.println("Invoice #: " + pet.getInvoiceNo());
        System.out.println("Price: " + pet.getPrice());
        System.out.println("Vaccinated: " + pet.getVaccinated());
        System.out.println("Neutered: " + pet.getNeutered());
        System.out.println("Housebroken: " + pet.getHousebroken());
    }
}
