package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.capability.gtb.entrancequiz.controller.GroupingController;
import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
@SpringBootTest
class GroupingControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void shuffle_list() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Student student = new Student(2,"haha");
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
    String json = objectMapper.writeValueAsString(studentList);

        mockMvc.perform(post("/students/grouping")
                .contentType(MediaType.APPLICATION_JSON)
        .content(json))
                .andExpect(status().isOk());
    }
}