/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittesting.example1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author agnas
 */
public class PersonTest {

    private Person person;

    private String[] validPersonId = {
        "100-A1001", "100-A1002", "100-A1003", "100-A1004"
    };

    public PersonTest() {
    }

    //this is an example of a fixture
    //the purpose of this is so that you don't need to create an object
    //for every single method. By doing this, it autogenerates it invisibly for
    //every method
    @Before
    public void setUp() {
        person = new Person();
    }

    @After
    public void tearDown() {
    }

    //this is the syntax if you are expecting an exception (expected is lower case)
    //test methods never get arguments (parameters)
    @Test(expected = IllegalArgumentException.class)
    public void testSetPersonIdShouldNotBeNull() {
        person.setPersonId(null);
    }

    //write another method for something that can go wrong for setter
    @Test(expected = IllegalArgumentException.class)
    public void testSetPersonIdShouldNotBeEmpty() {
        person.setPersonId("");
    }

    //then create what can go well
    
    //this method tests a bank of valid personId values. Loops through the array
    @Test
    public void testSetPersonIdShouldHaveALengthOf9() {
        for (int index = 0; index < validPersonId.length; index++) {
            person.setPersonId(validPersonId[index]);
        }
    }

//  try to get this one to work later. Need to still write validation for this
//  in the person setPersonId() method
  
//    @Test
//    public void testSetPersonIdShouldContainALengthOfTwoAfterSplittingAHyphenOut() {
//        for (int index = 0; index < validPersonId.length; index++) {
//            person.setPersonId(validPersonId[index]);
//
//            String splitNoHyphenPersonId = person.getPersonId().split("-").toString();
//            splitNoHyphenPersonId.length();
//        }
//
//    }
}
