package vn.fpoly.sof3041_sp26_sd22141.service;

import vn.fpoly.sof3041_sp26_sd22141.emtity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student){
        if (student == null){
            throw new IllegalArgumentException("Student can not be null");

        }
        students.add(student);

    }

    public Student getStudentById(long id){
        for (Student student:students){
            if (student.getId() == id){
                return student;

            }
        }

        return null;
    }

    public void updateStudent(Student student){
        if (student == null){
            throw new IllegalArgumentException("student can not be null")    ;
        }

        for (int i = 0; i <students.size(); ++i){
            if (students.get(i).getId() == student.getId()){
                students.set(i,student);
                    return;
                }
            else {
                throw new IllegalArgumentException("Student with id" +student.getId() +"does not exist");
            }
        }
    }

    public boolean deleteStudent(long id){
        for (int i = 0; i <students.size();++i){
            if (students.get(i).getId() == id){
                students.remove(i);
                return true;
            }
        }
        return false;
    }

    public List<Student> getAllStudent(){

        return students;
    }

}
