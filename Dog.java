package Java_week3;
public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printDetails() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Max", "German Shepherd");

        dog1.setName("Charlie");
        dog1.setBreed("Labrador");

        dog2.setName("Rocky");
        dog2.setBreed("Bulldog");

        System.out.println("Updated Dog 1 Details:");
        dog1.printDetails();

        System.out.println("\nUpdated Dog 2 Details:");
        dog2.printDetails();
    }
}
