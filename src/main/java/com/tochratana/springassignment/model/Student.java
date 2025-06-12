package com.tochratana.springassignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Student {
    private Integer id;
    private String fullName;
    private String gender;
    private Integer score;
}
