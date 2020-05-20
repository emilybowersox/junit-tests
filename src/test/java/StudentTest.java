import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class StudentTest {

    //id should be a long number used to represent a "unique user" in our application.
//name is a String that holds the name of the student.
//grades is an ArrayList that contains a list of Integer numbers.

    public long id;
    public String name;
    public ArrayList<Integer> grades;

    @Before
    public void setUp(){
        this.id = 0;
        this.name = "";
        this.grades = new ArrayList<>();
    }

    @Test
    public void testIfReturnsGrades(){
        grades.add(100);
        grades.add(87);
        grades.add(73);

//        assertEquals(100, grades.get(0));
        assertTrue(grades.contains(100));
        assertFalse(grades.contains(27));
    }





//    The Student class should have a constructor that sets both the name and id property, it initializes the grades property as an empty ArrayList.
//    The Student class should have the following methods:
//    // returns the student's id
//    public long getId();
//    // returns the student's name
//    public String getName();
//    // adds the given grade to the grades list
//    public void addGrade(int grade);
//    // returns the average of the students grades
//    public double getGradeAverage();
}
