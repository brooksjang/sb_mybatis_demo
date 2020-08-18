package com.example.controller;

import com.example.pojo.EmployeeVO;
import com.example.service.IEmployeeSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeSV employeeSV;

    @RequestMapping("/getAll")
    @ResponseBody
    public List<EmployeeVO> getAll() {
        try{
            return employeeSV.getAll();
        }catch (Exception e){
            throw new RuntimeException("程序出错");
        }
    }

    /**
     * 这是一段测试代码
     * @return
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello world!";
    }


}
