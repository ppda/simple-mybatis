package com.mybatis.mapper;

import com.mybatis.entity.Emp;
import com.mybatis.entity.EmpDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    EmpDTO selectEmp(int id);

    int mutilUpdate(@Param("emps")List<Emp> emps);

    int updateEmp(Emp emp);
}
