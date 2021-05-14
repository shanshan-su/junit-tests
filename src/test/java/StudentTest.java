import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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
    public void testIfGradesIsInitialized() {
        assertNotNull(test.getGrades());
    }

    @Test
    public void testIfGradeCanBeAdded() {
        assertEquals(0, test.getGrades().size());

        test.addGrade(90);
        assertEquals(1, test.getGrades().size());
        assertNotEquals(2, test.getGrades().size());
        assertSame(90, test.getGrades().get(0));
        assertNotSame(99, test.getGrades().get(0));

        test.addGrade(99);
        assertEquals(2, test.getGrades().size());
        assertNotEquals(1, test.getGrades().size());
        assertSame(99, test.getGrades().get(1));
        assertNotSame(90, test.getGrades().get(1));
    }

}
