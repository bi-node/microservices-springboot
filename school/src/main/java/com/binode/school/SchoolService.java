package com.binode.school;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolService {
    SchoolRepository schoolRepository;

    public List<School> getAllSchool() {
        return schoolRepository.findAll();
    }

    public void saveSchool(School school) {
        schoolRepository.save(school);
    }
}
