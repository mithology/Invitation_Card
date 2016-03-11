import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class NameTest{
    @Test
    public void test_fist_name_givesFirstNameInStringForMale() throws Exception {
        Name mitthu = new Name("Mitesh", "Jha");
        assertEquals("Mitesh Jha", mitthu.informalRepresentation());
    }
    @Test
    public void test_last_name_givesLastNameInStringForMale() throws Exception {
        Name mitthu = new Name("Mitesh", "Jha");
        assertEquals("Jha, Mitesh", mitthu.formalRepresentation());
    }
    @Test
    public void test_fist_name_givesFirstNameInStringForFemale() throws Exception {
        Name mitthu = new Name("Mitesh", "Jha");
        assertEquals("Mitesh Jha", mitthu.informalRepresentation());
    }
    @Test
    public void test_last_name_givesLastNameInStringForFemale() throws Exception {
        Name mitthu = new Name("Mitesh", "Jha");
        assertEquals("Jha, Mitesh", mitthu.formalRepresentation());
    }

}
