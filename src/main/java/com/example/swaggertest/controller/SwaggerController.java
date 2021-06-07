package com.example.swaggertest.controller;

import com.example.swaggertest.api.admin.ManagerTeacherControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.Position;
import javax.xml.transform.Result;

@RestController
@RequestMapping("/swaggerTest")
public class SwaggerController implements ManagerTeacherControllerApi {

    @Override
    public Result updateProblemById(Problem p) {
        return null;
    }

    @Override
    public Result deleteProblemById(Integer id) {
        return null;
    }

    @Override
    public Result addPosition(Position position) {
        return null;
    }

    @Override
    @PostMapping("/deletePosition")
    public Result deletePosition(Integer id){
        return null;
    }

    @Override
    public Result deleteCompany(Integer id) {
        return null;
    }
}
