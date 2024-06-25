package com.task.mapper;

import com.task.entity.Teacher;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author Student_Zeng
 * @project Core_Java
 * @data 2024/6/2
 */

public interface TeacherMapper {

    int insert(List<Teacher> list);

    List<Teacher> selectList(Teacher teacher);

    Integer selectSal(Teacher teacher);

    Integer deleteByAge(Teacher teacher);

    @Update(" delete from teacher\n" +
            "        <trim prefix=\"where\" suffixOverrides=\"and\" suffix=\" order by age \">\n" +
            "            <if test=\"age!=0 and age!=null\">\n" +
            "                age>#{age}\n" +
            "            </if>\n" +
            "        </trim>")
    Integer updateJob(Teacher teacher);
}