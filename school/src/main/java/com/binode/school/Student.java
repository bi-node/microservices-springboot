package com.binode.school;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private long id;
    private String firstname;
    private String lastname;
    private String email;
}
