package testUser;
import org.junit.jupiter.api.Test;

import User.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentTest {

    @Test
    public void testSetMyPreferRegion1() {
        Student student = new Student("testUser", "testPassword");
        student.setMyPreferRegion(1);
        System.out.println(student.getPreferRegion());
        assertEquals("USA", student.getPreferRegion());
    }
    @Test
    public void testSetMyPreferRegion2() {
        Student student = new Student("testUser", "testPassword");
        student.setMyPreferRegion(2);
        assertEquals("UK", student.getPreferRegion());
    }
    @Test
    public void testSetMyPreferRegion3() {
        Student student = new Student("testUser", "testPassword");
        student.setMyPreferRegion(3);
        assertEquals("Europe", student.getPreferRegion());
    }
    @Test
    public void testSetMyPreferRegion4() {
        Student student = new Student("testUser", "testPassword");
        student.setMyPreferRegion(4);
        assertEquals("Japan", student.getPreferRegion());
    }
    @Test
    public void testSetMyPreferRegion5() {
        Student student = new Student("testUser", "testPassword");
        student.setMyPreferRegion(5);
        assertEquals("Hong Kong & Singapore", student.getPreferRegion());
    }
    @Test
    public void testSetMyPreferRegion6() {
        Student student = new Student("testUser", "testPassword");
        student.setMyPreferRegion(6);
        assertEquals("China Mainland", student.getPreferRegion());
    }
    @Test
    public void testSetMyPreferTuitionFee() {
        Student student = new Student("testUser", "testPassword");
        student.setMyPreferTuitionFee(20000);
        assertEquals(20000, student.getPreferTuitionFee());
    }

    @Test
    public void testSetMyHomeSchoolRank() {
        Student student = new Student("testUser", "testPassword");
        student.setMyHomeSchoolRank(4);
        assertEquals(4, student.getHomeSchoolRank());
    }

   

    @Test
    public void testSetMyApplicationType() {
    	//not done due to lack of function implementation;
    }
}