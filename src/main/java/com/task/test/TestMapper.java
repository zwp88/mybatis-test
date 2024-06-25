package com.task.test;


import com.task.entity.Student;
import com.task.mapper.StudentMapper;
import com.task.uitl.SessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestMapper {
    public static void main(String[] args) {
        SqlSession session= SessionUtil.getSession();
        //自动生成当前接口的代理实现类
        StudentMapper mapper=session.getMapper(StudentMapper.class);
        //执行保存
        //mapper.insert(new Student(0,"李贺",22,"男"));
        //执行更新
        //mapper.update(new Student(26,"李贺",25,"男"));
        //执行查询1条数据
        //System.out.println(mapper.selectId(26));
        //执行删除
        //mapper.delete(26);
        //session.commit();
        //执行查询全部
        List<Student> list=mapper.selectList();
        list.forEach(System.out::println);
        session.close();

    }
}
