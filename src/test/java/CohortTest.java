import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.lang.Double.NaN;
import static org.junit.Assert.*;

public class CohortTest {
   Cohort marco;
   Student test;
   Student lily;

    @Before
    public void setup() {
        marco = new Cohort();
        test = new Student(1L, "test");
        lily = new Student(40L, "Lily");
    }

    @Test
    public void testIfGetStudentsWorks() {
        assertNotNull(marco.getStudents());

        Cohort anotherCohort = null;
        assertNull(anotherCohort);
    }

    @Test
    public void testIfAddStudentWorks() {
        assertEquals(0, marco.getStudents().size());

        marco.addStudent(test);
        assertEquals(1, marco.getStudents().size());

        marco.addStudent(lily);
        assertEquals(2, marco.getStudents().size());

    }

    @Test
    public void testIfGetCohortAverageWorks() {
        assertEquals(NaN, marco.getCohortAverage(), 0);

        marco.addStudent(test);
        test.addGrade(54);
        test.addGrade(91);
        test.addGrade(86); // avg = 77
        marco.addStudent(lily);
        lily.addGrade(75);
        lily.addGrade(90);
        lily.addGrade(100); // avg = 88.33333333

        assertEquals(82.67, marco.getCohortAverage(), 0.1);
    }
}
