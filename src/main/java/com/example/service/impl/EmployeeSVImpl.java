package com.example.service.impl;

import com.example.dao.EmployeeDao;
import com.example.pojo.EmployeeVO;
import com.example.service.IEmployeeSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeSVImpl implements IEmployeeSV {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<EmployeeVO> getAll() {
        return employeeDao.getAll();
    }
}
