package com.binode.school.client;

import com.binode.school.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "student-service", url = "${application.config.students-url}")
public interface StudentClient {


    @GetMapping("/schools/{school-id}")
     List<Student> getStudentsBySchool(@PathVariable("school-id") Long schoolId);
}
