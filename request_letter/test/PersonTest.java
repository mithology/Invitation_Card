import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class PersonTest {
//    @Test
//    public void test_represents_gives_guest_with_country_name_name_and_Age() throws Exception {
//        Person person = new Person(new Name("Vivek","Haridas"), "Male", "21", new Address("Koramangala","Bangalore", "India"));
//        assertTrue(Person.represent())
//    }

    @Test
    public void test_isAbleToConsumeAlcohol_returns_true_if_the_Person_age_is_greater_than_20() throws Exception {
        Person person = new Person(new Name("Vivek","Haridas"), "Male", "21", new Address("Koramangala","Bangalore", "India"));
        assertTrue(person.isAbleToConsumeAlcohol(20));
    }

    @Test
    public void test_a_Person_is_not_able_for_consuming_alcohol_if_his_age_is_18() throws Exception {
        Person person = new Person(new Name("Vivek","kumar"), "Male", "18", new Address("Koramangala","Bangalore", "India"));
        assertFalse(person.isAbleToConsumeAlcohol(20));
    }
}
