package com.task.uitl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

/**
 * @author Student_Zeng
 * @project Core_Java
 * @data 2024/6/2
 */

public class SessionUtil {
    public static SqlSession getSession(){
        try {
            return new SqlSessionFactoryBuilder().build(Resources.
                    getResourceAsStream("sqlMapConfig.xml")).openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
