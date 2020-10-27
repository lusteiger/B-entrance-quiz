package controller;

import dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Controller
public class GroupingController {
    @CrossOrigin
    @PostMapping("/grouping")
    public List<Student> groupingStudents(@RequestBody ArrayList<Student> studentList) {
        Collections.shuffle(studentList);

        return studentList;
    }
}
