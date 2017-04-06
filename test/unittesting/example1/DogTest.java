package unittesting.example1;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * This test class uses JUnit 4.x syntax
 * @author jlombardo
 */
public class DogTest {
    // insead of declaring in each test, just do it here
    private Dog instance;
    
    public DogTest() {
    }

    /*
     * Use @BeforeClass and @AfterClass annotations for class wide “setup” 
     * and “tearDown” respectively. Think them as one time setup and tearDown. 
     * They run for one time before and after all test cases.
     */
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    /*
     * Use @Before and @After annotations for instance wide “setup” and 
     * “tearDown” methods respectively. They run before and after 
     * every test case.
     */
    
    @Before
    public void setUp() {
        // Insead of initializing in each test, just do it here
        // Declaration is above.
        instance = new Dog();
    }
    
    @After
    public void tearDown() {
        // clean up after yourself!
        instance = null;
    }

    @Test
    public void getAgeInDogYearsShouldBeMultipleOf7() {
//        Dog instance = new Dog();
        int expResult = instance.getAge() * 7;
        int result = instance.getAgeInDogYears();
        assertEquals(expResult, result);
    }
    
    
    @Test(expected = IllegalArgumentException.class)
    public void setAgeShouldThrowIaeIfNumberBelowRange() {
//        Dog instance = new Dog();
        instance.setAge(-1);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setAgeShouldThrowIaeIfNumberAboveRange() {
//        Dog instance = new Dog();
        instance.setAge(21);
    }

    @Test
    public void setAgeShouldAllow0to20() {
//        Dog instance = new Dog();
        for(int i=0; i < 21; i++) {
            try {
                instance.setAge(i);

            } catch(IllegalArgumentException iae) {
                fail("Arguments from 0 to 20 inclusive should be legal, "
                        + "but fails with IllegalArgumentException.");
            }
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void setNameShouldNotAllowNull() {
//        Dog instance = new Dog();
        instance.setName(null);    }
    
    @Test(expected = IllegalArgumentException.class)
    public void setNameShouldNotAllowEmpty() {
//        Dog instance = new Dog();
        instance.setName("");
    }
    
    @Test
    public void setNameShouldAllowNormalStrings() {
        String[] namesToTest = {"fido", "1234", "b", "averyveryverylongname"};
//        Dog instance = new Dog();
        for(int i=0; i < namesToTest.length; i++) {
            try {
                instance.setName(namesToTest[i]);
                
            } catch(IllegalArgumentException iae) {
                fail("Name is legal, "
                        + "but fails with IllegalArgumentException");
            }
        }
    }
}
