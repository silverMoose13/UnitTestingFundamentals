package unittesting.example1;

/**
 *
 * @author agnas
 */
public class Person {

    private String personId;

    public String getPersonId() {
        return personId;
    }

    //this needed to be validated in order to pass the unit test
    public void setPersonId(String personId) {
        if (personId == null || personId.isEmpty()) {
            throw new IllegalArgumentException();
        }
        if (personId.length() != 9) {
            throw new IllegalArgumentException();
        }
//        if (personId.length() == 9) {
//            personId.split("-");
//            if (personId.length() != 2) {
//                throw new IllegalArgumentException();
//            }
//        }

        this.personId = personId;
    }

}
