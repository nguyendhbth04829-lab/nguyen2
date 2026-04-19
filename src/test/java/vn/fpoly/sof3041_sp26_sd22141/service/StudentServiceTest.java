package vn.fpoly.sof3041_sp26_sd22141.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import vn.fpoly.sof3041_sp26_sd22141.emtity.Student;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService studentService;
    @BeforeEach
    void setUp() {

        studentService = new StudentService();
    }

    //add Student
    @Test
    @DisplayName("Luong chinh")
    void addStudentWithValidStudent(){
        Student student = new Student(1,"John Doe",20,9.0);
        studentService.addStudent(student);

        assertEquals(1,studentService.getAllStudent().size());
        assertEquals(20,studentService.getStudentById(1).getAge());
    }

    @Test
    void addStudentWithNull(){
     Exception exception  =   assertThrows(IllegalArgumentException.class,() -> studentService.addStudent(null));
    assertEquals("Student can not be null",exception.getMessage());
    }

    @Test
    void addStudentWithInvalidAge(){
      Exception exception=  assertThrows(IllegalArgumentException.class, () -> new Student(1, "Jon ", 15,8.0));
        assertEquals("tuoi phai lon hon 18",exception.getMessage());
    }

    @Test
    void addStudentWithInvalidMark(){
    Exception exception=    assertThrows(IllegalArgumentException.class, ()-> studentService.addStudent( new Student(1, "A", 20,11.0)));
        assertEquals("diem phai tu 0 den 10",exception.getMessage());
    }

    //update student
    @Test
    void updateStudentWithValidStudent(){
        Student student = new Student(1,"A",19,9.1);
        studentService.addStudent(student);

        student.setName("C");
        student.setAge(18);
        student.setMark(9.9);

        studentService.updateStudent(student);

        assertEquals("C",studentService.getStudentById(1).getName());
        assertEquals(18,studentService.getStudentById(1).getAge());
        assertEquals(9.9,studentService.getStudentById(1).getMark());
    }

    @Test
    void updateStudentWithNull(){
        Exception exception = assertThrows(IllegalArgumentException.class,() -> studentService.addStudent(null));
        assertEquals("Student can not be null", exception.getMessage());
    }

    @Test
    void updateStudentWithInvalidAge(){
        Student student = new Student(1,"A",20,2.0);
        studentService.addStudent(student);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.updateStudent(new Student(1,"A",8,2.0)));
        assertEquals("tuoi phai lon hon 18",exception.getMessage());
    }
}