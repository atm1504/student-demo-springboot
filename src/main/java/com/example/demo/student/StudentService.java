package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public List<Student> getStudents() {
        List<Student> arr = new ArrayList<Student>();
        arr.add(new Student(1L, "Atm", "atm@at.com", LocalDate.of(2000, Month.JANUARY, 4), 21));
        arr.add(new Student(1L, "Ana", "ana@at.com", LocalDate.of(2000, Month.MARCH, 2), 21));
        return arr;
    }
}
