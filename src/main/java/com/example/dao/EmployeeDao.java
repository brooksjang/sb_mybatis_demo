package com.example.dao;

import com.example.pojo.EmployeeVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {
    List<EmployeeVO> getAll();

}
