package com.example.myfirstspringapp.student;

import java.time.LocalDate;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        return List.of(
                new Student(1l,
                        "gagan@gagan.com",
                        "Gagan",
                        26,
                        LocalDate.of(1995,10,04))
        );
    }

}
