import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class NameTest{
    @Test
    public void test_fist_name_givesFirstNameInString() throws Exception {
        Name mitthu = new Name("Mitesh", "Jha");
        assertEquals("Mitesh Jha", mitthu.informalRepresentation());
    }
    @Test
    public void test_last_name_givesLastNameInString() throws Exception {
        Name mitthu = new Name("Mitesh", "Jha");
        assertEquals("Jha, Mitesh", mitthu.formalRepresentation());
    }

    @Test
    public void test() throws Exception {

    }
}
