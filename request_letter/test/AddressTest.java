import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class AddressTest {
    Address address = new Address("Gurgaon", "Haryana", "India");
    @Test
    public void test_GetCountry_gives_the_country() throws Exception {
        assertEquals("India", address.getCountry());
    }
    @Test
    public void test_GetState_gives_the_state() throws Exception {
        assertEquals("Haryana", address.getState());
    }
    @Test
    public void test_GetCity_gives_the_city() throws Exception {
        assertEquals("Gurgaon", address.getCity());
    }
}
