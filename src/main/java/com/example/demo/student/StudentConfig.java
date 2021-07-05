package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.time.Month.JANUARY;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student atm = new Student("Atm", "atm@at.com", LocalDate.of(2000, JANUARY, 4), 21);
            Student ana = new Student(1L, "Ana", "ana@at.com", LocalDate.of(2000, MARCH, 2), 21);
            List<Student> arr = new ArrayList<Student>();
            arr.add(atm);
            arr.add(ana);
            studentRepository.saveAll(arr);
        };
    }
}
