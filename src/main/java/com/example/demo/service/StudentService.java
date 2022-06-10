package com.example.demo.service;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L,
                        "Nebi",
                        "nebsar@gmail.com",
                        LocalDate.of(1979, Month.APRIL, 4),
                        43),
                new Student(2L,
                        "Elif",
                        "sarikayaelif1412@gmail.com",
                        LocalDate.of(1980, Month.DECEMBER, 14),
                        42));
    }
}
