package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/students", produces = MediaType.APPLICATION_JSON_VALUE)
public class GroupingController {

    @PostMapping("/grouping")
    public ResponseEntity<List<Student>> groupingStudents(@RequestBody ArrayList<Student> studentList) {

        Collections.shuffle(studentList);
        return ResponseEntity.ok().body(studentList);
    }
}
