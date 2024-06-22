package com.binode.school;

import com.binode.school.client.StudentClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SchoolService {

    SchoolRepository schoolRepository;
    StudentClient studentClient;


    public List<School> getAllSchool() {
        return schoolRepository.findAll();
    }

    public void saveSchool(School school) {
        schoolRepository.save(school);
    }

    public FullSchoolResponse findSchoolWithStudents(Long schoolId) {
        var school=schoolRepository.findById(schoolId).orElse(School.builder()
                        .name("NOT_FOUND")
                        .email("NOT_FOUND")
                    .build());
        var students=studentClient.getStudentsBySchool(schoolId); //find all students from student microservice;
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
