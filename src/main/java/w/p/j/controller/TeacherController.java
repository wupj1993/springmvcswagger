/*
 * Copyright (c) 2015 - 7 - 21
 * -0 :49:19
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;
import w.p.j.daomain.BaseResult;
import w.p.j.daomain.Teacher;
import w.p.j.service.impl.TeacherServiceImpl;

import javax.annotation.Resource;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/21.12:49
 * ****************************************************
 */
@RestController
@RequestMapping(value = "/teacher")
@Api(basePath = "/teacher",value = "Teacher",description = "获取教师信息")
public class TeacherController extends BaseController {
    @Resource
    private TeacherServiceImpl teacherService;
    @RequestMapping(value = "/id/{id}/info",method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    @ApiOperation(value = "获取教师信息",httpMethod = "GET",notes = "根据教师id获取教师的信息",response = BaseResult.class,protocols = "application/json")
    public BaseResult getTeacherById(@ApiParam(name = "id",required = true,value = "Teacher by Id")@PathVariable("id")int id){
        LOGGER.debug("获取教师信息来了id："+id);
        Teacher teacher=teacherService.getTeacherInfoById(id);
        return buildSuccessResultInfo(teacher);
    }
    @RequestMapping(value = "/name/{name}/teacher",method = RequestMethod.GET,produces = "application/json; charset=utf-8")
    @ApiOperation(value = "获取教师信息",httpMethod = "GET",notes = "根据教师名字获取教师信息",response = BaseResult.class)
    public BaseResult getTeacherByName(@ApiParam(name = "name",required = true,value = "Teacher by name")@PathVariable("name")String name){
        LOGGER.debug("获取教师信息来了name："+name);
        Teacher teacher=teacherService.getTeacherInfoByName(name);
        return buildSuccessResultInfo(teacher);
    }
    @RequestMapping(value = "/addTeacher",method = RequestMethod.POST)
    @ApiOperation(value = "增加教师",httpMethod = "POST",notes = "新增教师信息")
    @ResponseBody
    public BaseResult addTeacherInfo(@RequestBody Teacher teacher){
        LOGGER.debug(teacher.toString());
        return buildSuccessResultInfo(null);
    }

}
