package com.task.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author Student_Zeng
 * @project Core_Java
 * @data 2024/6/2
 */

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    private Integer id;
    private String name;
    private String addr;
    private Integer age;
    private String job;
    private Integer sal;
}
