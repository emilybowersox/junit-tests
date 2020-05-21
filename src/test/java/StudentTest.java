import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class StudentTest {

    @Test
    public void testCreateStudent(){
        Student emily = new Student(1L, "emily");
        Student kara = null;
        assertNull(kara);
        assertNotNull(emily);
    }

    @Test
    public void testStudentFields(){
        Student emily = new Student(1L, "emily");
        assertSame(1L, emily.getId());
        assertSame("emily", emily.getName());
        assertSame(0, emily.getGrades().size());
    }


    @Test
    public void testAddGrade(){
        Student emily = new Student(1L, "emily");
        emily.addGrade(100);
        assertSame(100, emily.getGrades().get(0));
        emily.addGrade(80);
        assertSame(80, emily.getGrades().get(1));
    }

    @Test
    public void testAverageGrade(){
        Student emily = new Student(1L, "emily");
        emily.addGrade(100);
        emily.addGrade(80);
        assertEquals(90, emily.getGradeAverage(), 0);
    }



//    //id should be a long number used to represent a "unique user" in our application.
////name is a String that holds the name of the student.
////grades is an ArrayList that contains a list of Integer numbers.
//

//    Student emily;
//    Student kara;
//
//    @Before
//    public void setUp(){
//        this.id = 0;
//        this.name = "";
//        this.grades = new ArrayList<>();
//        emily = new Student(1, "Emily B");
//        emily.addGrade(100);
//    }
//
//    @Test
//    public void testIfIdWorks(){
//        Student emily
//    }
//
//    @Test
//    public void testIfReturnsGrades(){
//        grades.add(100);
//        grades.add(87);
//        grades.add(73);
//
//        assertTrue(grades.contains(100));
//        assertFalse(grades.contains(27));
//    }
//
//    @Test
//    public void testIfContainsName(){
//        name = "Emily";
//        assertEquals("Emily", name);
//        assertNotEquals("kara", name);
//    }
//
//
////    The Student class should have a constructor that sets both the name and id property,
////    it initializes the grades property as an empty ArrayList.
////    The Student class should have the following methods:
////    // returns the student's id
////    public long getId();
////    // returns the student's name
////    public String getName();
////    // adds the given grade to the grades list
////    public void addGrade(int grade);
////    // returns the average of the students grades
////    public double getGradeAverage();
}
