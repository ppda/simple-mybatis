package com.mybatis;

import com.mybatis.entity.Emp;
import com.mybatis.entity.EmpDTO;
import com.mybatis.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class MybatisTest {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession session = sqlSessionFactory.openSession(true)) {
//            Emp e1 = (Emp) session.selectOne("com.mybatis.mapper.EmpMapper.selectEmp", 1);
//            System.out.println("e1: " + e1);
            EmpMapper mapper = session.getMapper(EmpMapper.class);
            EmpDTO emp = mapper.selectEmp(1);
            System.out.println(emp);

//            Emp e2 = new Emp();
//            e2.setId(1);
//            e2.setName("张三");
////            e2.setTitle("大学生");
//            Emp e3 = new Emp();
//            e3.setId(2);
//            e3.setName("lisi");
//            e3.setAge(32);
//            List<Emp>  emps = new ArrayList<>();
//            emps.add(e2);
//            emps.add(e3);
//            mapper.mutilUpdate(emps);

//            mapper.updateEmp(e2);
        }
    }
}
