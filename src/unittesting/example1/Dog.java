package unittesting.example1;

/**
 * This class represents a dog entity. It's purpose is to demonstrate some
 * simple method argument validation and to provide a basis for unit testing.
 * The unit tests validate the requirements as documented in the Javadoc
 * comments.
 * 
 * @author Jim Lombardo
 */
public class Dog {
    private int age;
    private String name;

    /** default constructor */
    public Dog() {}
    
    /**
     * Convenience constructor to initialize dog properties.
     * @param name - the name of the dog
     * @param ageInRealYears - actual age of the dog, restricted to age >= 0
     * and age <= 20
     */
    public Dog(String name, int ageInRealYears) {
        setName(name);
        setAge(ageInRealYears);
    }
    
    /**
     * Get the age of the dog in dog years.
     * @return the age of the dog in dog years, using the formula 
     * dogYears = realAge * 7.
     */
    public final int getAgeInDogYears() {
        return age * 7;
    }

    /**
     * Get the age of the dog in real years.
     * @return the age of the dog in real years.
     */
    public final int getAge() {
        return age;
    }

    /**
     * Sets the age of the dog in real years.
     * @param age - a whole number > 0 and < 20
     * @throws IllegalArgumentException if out of range
     */
    public final void setAge(int age) throws IllegalArgumentException {
        // Reasonable valid range for dogs
        if(age >= 0 && age <= 20) {
            this.age = age;
        } else {
            throw new IllegalArgumentException(
                    "Expected dog age > 0 and < 20, got: " + age);
        }
    }

    /**
     * Get the dog name.
     * @return the dog name
     */
    public final String getName() {
        return name;
    }

    /**
     * Sets the name of the dog without restriction.
     * @param name - the name of the dog
     * @throws IllegalArgumentException if name is null or length == 0
     */
    public final void setName(String name) throws IllegalArgumentException {
        if(name == null || name.length() == 0) {
            throw new IllegalArgumentException("The dog name is a required field");
        }
        this.name = name;
    }
    
    
}
