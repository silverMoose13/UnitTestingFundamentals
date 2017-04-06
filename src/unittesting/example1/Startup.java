package unittesting.example1;

/**
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog = new Dog("Fido", 5);
        System.out.println("Dog created:\n\tName: " + dog.getName() +
                "\n\tActual age: " + dog.getAge() + "\n\tAge in dog years: "
                + dog.getAgeInDogYears());
    }

}
