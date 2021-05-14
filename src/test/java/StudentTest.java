import org.junit.Test;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testIfStudentCanBeCreated() {
        Student shan = new Student(1L, "shan");
        Student nullStudent = null;
        assertNotNull(shan);
        assertNull(nullStudent);
    }

    Student test = new Student(1L, "test");

//    @Test
//    public void testIfIdWorks() {
//        assertEquals(1L, test.getId());
//        assertNotEquals(2L, test.getId());
//    }
//
//    @Test
//    public void testIfNameWorks() {
//        assertEquals("test", test.getName());
//        assertNotEquals("test1", test.getName());
//    }
//
//    @Test
//    public void testIfGradesIsInitialized() {
//        assertNotNull(test.getGrades());
//    }

    @Test
    public void testIfFieldsAreSet() {
        Student happy = new Student(1L, "happy");
        assertEquals(1L, happy.getId());
        assertEquals("happy", happy.getName());

        Student hello = new  Student(23L, "hello");
        assertEquals(23L, hello.getId());
        assertEquals("hello", hello.getName());

    }

    @Test
    public void testIfGradeCanBeAdded() {
        assertEquals(0, test.getGrades().size());
        test.addGrade(-14);
        assertEquals(0, test.getGrades().size());
        assertNotEquals(1, test.getGrades().size());

        test.addGrade(125);
        assertEquals(0, test.getGrades().size());
        assertNotEquals(1, test.getGrades().size());

        test.addGrade(90);
        assertEquals(1, test.getGrades().size());
        assertNotEquals(2, test.getGrades().size());


        test.addGrade(99);
        assertEquals(2, test.getGrades().size());
        assertNotEquals(1, test.getGrades().size());

    }

    @Test
    public void testIfGetGradeWorks() {
        test.addGrade(90);
        test.addGrade(99);
        assertSame(90, test.getGrades().get(0));
        assertSame(99, test.getGrades().get(1));

        assertNotSame(99, test.getGrades().get(0));
        assertNotSame(90, test.getGrades().get(1));
    }

    @Test
    public void testIfGetGradeAverageWorks() {
        assertEquals(NaN, test.getGradeAverage(), 0);
        test.addGrade(90);
        test.addGrade(99);
        assertEquals(94.5, test.getGradeAverage(), 0);
        test.addGrade(95);
        assertEquals(94.6666667, test.getGradeAverage(), 0.1);
        test.addGrade(88);
        assertEquals(93, test.getGradeAverage(), 0);
    }

    @Test
    public void testIfUpdateGradeWorks() {
        test.addGrade(90);
        test.addGrade(99);
        test.addGrade(95);
        test.addGrade(88);

        test.updateGrade(0, 92);
        assertSame(92, test.getGrades().get(0));
        assertNotSame(90, test.getGrades().get(0));

        test.updateGrade(3, 86);
        assertSame(86, test.getGrades().get(3));
        assertNotSame(88, test.getGrades().get(3));
    }

    @Test
    public void testIfDeleteGradeWorks() {
        test.addGrade(90);
        test.addGrade(99);
        test.addGrade(95);
        test.addGrade(88);

        test.deleteGrade(90);
        assertEquals(-1, test.getGrades().indexOf(90));
        assertEquals(3, test.getGrades().size());
        assertNotEquals(4, test.getGrades().size());

        test.deleteGrade(95);
        assertEquals(-1, test.getGrades().indexOf(95));
        assertNotEquals(2, test.getGrades().indexOf(95));
        assertEquals(2, test.getGrades().size());
        assertNotEquals(3, test.getGrades().size());
    }

}
