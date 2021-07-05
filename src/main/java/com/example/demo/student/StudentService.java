package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
//        List<Student> arr = new ArrayList<Student>();
//        arr.add(new Student(1L, "Atm", "atm@at.com", LocalDate.of(2000, Month.JANUARY, 4), 21));
//        arr.add(new Student(1L, "Ana", "ana@at.com", LocalDate.of(2000, Month.MARCH, 2), 21));
//        return arr;
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("Email already taken");
        }
        studentRepository.save(student);
        System.out.println(student);
    }
}
