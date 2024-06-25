package com.task.mapper;


import com.task.entity.Student;

import java.util.List;

public interface StudentMapper {


    List<Student> selectList();

    Student selectId(int id);
}
