package com.example.swaggertest.api.admin;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.stereotype.Service;

import javax.swing.text.Position;
import javax.xml.transform.Result;

/**
 * @author Iris
 */
@Api(value = "管理员微服务",description = "发布试题与岗位公司")
public interface ManagerTeacherControllerApi {

    @ApiOperation("修改题")
    public Result updateProblemById(Problem p);


    @ApiOperation("根据Id删除题")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value = "题id",required=true,paramType="path",dataType="Integer")
    })
    public Result deleteProblemById(Integer id);


    @ApiOperation("添加岗位")
    public Result addPosition(Position position);

    @ApiOperation("删除岗位")
    public Result deletePosition(Integer id);

    @ApiOperation("删除公司")
    public Result deleteCompany(Integer id);


}
