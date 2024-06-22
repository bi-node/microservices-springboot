package com.binode.school;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {
    private long id;
    private String name;
    private String email;
    private List<Student> students;
}
