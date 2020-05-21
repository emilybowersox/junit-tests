import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;
//the specific Assert.assertEquals that was suggested didn't work

public class CohortTest {


@Test
    public void testAddStudent() {
    Cohort apex = new Cohort();
    Student emily = new Student (1L, "Emily");
    apex.addStudent(emily);
    assertEquals(1L, apex.getStudents().get(0).getId());
}










}
