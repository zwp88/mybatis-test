package com.task.test;


import com.task.entity.Student;
import com.task.entity.Teacher;
import com.task.mapper.TeacherMapper;
import com.task.uitl.SessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Student_Zeng
 * @project Core_Java
 * @data 2024/6/2
 */

public class TestTeacher {
    public static void main(String[] args) {
        SqlSession session = SessionUtil.getSession();
        TeacherMapper mapper = session.getMapper(TeacherMapper.class);
//        List<Teacher> list = listTeacher();
//        mapper.insert(list);
//        List<Teacher> list = mapper.selectList(new Teacher().setName("张"));
//        list.forEach(System.out::println);
//        Integer integer = mapper.updateJob(new Teacher().setJob("销售经理").setAge(22));
//        System.out.println(integer > 0 ? "更改成功" : "更改失败");
//        Integer integer = mapper.deleteByAge(new Teacher().setAge(33));
//        System.out.println(integer > 0 ? "更改成功" : "更改失败");
        List<Teacher> list = mapper.selectList(new Teacher());
        System.out.println(list);
        //list.forEach(System.out::println);
        session.close();
    }
    public static List<Teacher> listTeacher(){
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher().setId(0).setName("张三").setAddr("江苏省南京市")
                .setAge(35).setJob("区域总监").setSal(20000));
        list.add(new Teacher().setId(0).setName("李四").setAddr("江苏省苏州市")
                .setAge(32).setJob("销售经理").setSal(15000));
        list.add(new Teacher().setId(0).setName("王五").setAddr("四川省成都市")
                .setAge(26).setJob("销售员").setSal(8000));
        list.add(new Teacher().setId(0).setName("赵六").setAddr("吉林省长春市")
                .setAge(27).setJob("财务").setSal(10000));
        list.add(new Teacher().setId(0).setName("刘七").setAddr("吉林省吉林市")
                .setAge(24).setJob("销售员").setSal(6000));
        list.add(new Teacher().setId(0).setName("吴八").setAddr("陕西省西安市")
                .setAge(31).setJob("销售员").setSal(7000));
        return list;
    }
}
