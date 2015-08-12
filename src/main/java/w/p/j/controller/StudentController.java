/*
 * Copyright (c) 2015 - 7 - 20
 * -7 :47:35
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import w.p.j.daomain.BaseResult;
import w.p.j.daomain.Student;
import w.p.j.service.impl.StudentServiceImpl;

import javax.annotation.Resource;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/20.19:47
 * ****************************************************
 */
@Api(basePath = "/student", value = "Student", description = "学生信息")
@RestController
@RequestMapping("/student")
public class StudentController extends BaseController {
    //    private static final Log LOGGER = LogFactory.getLog(StudentController.class);
    @Resource
    private StudentServiceImpl studentService;

    /**
     * 新增加学生信息
     *
     * @param studentInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    @ApiOperation(value = "新增学生信息", notes = "增加学生信息", httpMethod = "POST", response = BaseResult.class)
    public BaseResult addStudent(@ApiParam(required = true, name = "studentInfo", value = "学生实体类")
                                 @RequestBody Student studentInfo
    ) {
        LOGGER.debug("过来的学生信息:" + studentInfo.toString());
        System.out.println("输出过来的学生信息:" + studentInfo.toString());
        if (studentInfo == null) {
            return super.buildFailedResultInfo(HttpStatus.OK,"student can't be null");
        }
        boolean isSuccess = studentService.addStudent(studentInfo);
        return buildSuccessResultInfo(isSuccess);
    }

    @ResponseBody
    @RequestMapping(value = "/student/{id}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ApiOperation(value = "获取学生信息", httpMethod = "GET", notes = "根据学生id获取学生的信息")
    public BaseResult getStudentById(@ApiParam(required = true, name = "id", value = "student id Integer")
                                     @PathVariable(value = "id") int id) {
        LOGGER.debug("过来的学生ID:" + id);

        Student student = studentService.getStudentById(id);
        return buildSuccessResultInfo(student);
    }

    @RequestMapping(value = "/student", method = RequestMethod.PUT)
    @ApiOperation(value = "更新学生信息", httpMethod = "PUT", notes = "用来更新学生的信息")
    public
    @ResponseBody
    BaseResult updateStudent(
            @ApiParam(required = true, name = "Student", value = "学生实体类")
            @RequestBody Student student
    ) {
        LOGGER.info("传过来的学生信息" + student);
        /**
         * 模拟更新数据
         */
        student.setName("老吴");
        return buildSuccessResultInfo(student);
    }

    @RequestMapping(value = "/student/{id}", method=RequestMethod.DELETE)
    @ApiOperation(value = "根据学生id删除学生信息", httpMethod = "DELETE", notes = "根据学生的id进行删除学生信息")
    public
    @ResponseBody
    BaseResult deleteStudent(
            @ApiParam(required = true, value = "根据学生id删除学生信息", name = "id")
            @PathVariable("id")int id) {
        LOGGER.debug("学生的信息" + id);
        return buildSuccessResultInfo("success");
    }
}
