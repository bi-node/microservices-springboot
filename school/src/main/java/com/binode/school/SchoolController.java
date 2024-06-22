package com.binode.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {
    private final SchoolService schoolService;

    @GetMapping()
    public ResponseEntity<List<School>> getSchool() {
        return ResponseEntity.ok(schoolService.getAllSchool());
    }

    @PostMapping
    public String addSchool(@RequestBody School school) {
        schoolService.saveSchool(school);
        return "Successfully added school";
    }
}
