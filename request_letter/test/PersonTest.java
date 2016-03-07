import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class PersonTest {
    @Test
    public void testInformally_gives_the_informally_invitation_for_male() throws Exception {
        Name name = new Name("John", "Smith");
        Address address = new Address("Bangalore", "Karnataka", "India");
        Person john = new Person(name,Gender.Male,21,address);
        assertEquals("Mr John Smith, India", john.informallyInvited());
    }
    @Test
    public void testFormally_gives_the_formally_invitation_for_male() throws Exception {
        Name name = new Name("John", "Smith");
        Address address = new Address("Bangalore", "Karnataka", "India");
        Person john = new Person(name,Gender.Male,21,address);
        assertEquals("Mr Smith, John, India", john.formallyInvited());
    }

    @Test
    public void testInFormally_gives_the_informally_invitation_for_female() throws Exception {
        Name name = new Name("Trishna", "Hinduja");
        Address address = new Address("Bangalore", "Karnataka", "India");
        Person trishna = new Person(name,Gender.Female,35,address);
        assertEquals("Ms Trishna Hinduja, India", trishna.informallyInvited());
    }
    @Test
    public void testFormally_gives_the_formally_invitation_for_female() throws Exception {
        Name name = new Name("Trishna", "Hinduja");
        Address address = new Address("Bangalore", "Karnataka", "India");
        Person john = new Person(name,Gender.Female,35,address);
        assertEquals("Ms Hinduja, Trishna, India", john.formallyInvited());
    }
}