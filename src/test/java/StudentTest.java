import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student test = new Student(1, "test");

    @Test
    public void testIfIdWorks() {
        assertEquals(1, test.getId());
        assertNotEquals(2, test.getId());
    }

    @Test
    public void testIfNameWorks() {
        assertEquals("test", test.getName());
        assertNotEquals("test1", test.getName());
    }

    @Test


}
