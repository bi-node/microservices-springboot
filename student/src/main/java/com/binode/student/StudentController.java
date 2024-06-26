package com.binode.student;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return ResponseEntity.ok(studentService.getStudents());
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Successfully added student";
    }

    @GetMapping("/schools/{school-id}")
    public ResponseEntity<List<Student>> getAllStudents(@PathVariable("school-id") Long schoolId) {
        return ResponseEntity.ok(studentService.findAllStudentsBySchool(schoolId));
    }
}
