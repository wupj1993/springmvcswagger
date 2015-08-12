/*
 * Copyright (c) 2015 / 8 / 12 3 :2 :29
 * BY:wupeiji
 * QQ:757671834
 *
 */

package w.p.j.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import w.p.j.controller.BaseController;
import w.p.j.daomain.BaseResult;

@ControllerAdvice
public class ApiExceptionHandler extends BaseController {

    @ExceptionHandler(InvalidRequestException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public BaseResult handleInvalidRequestError(InvalidRequestException ex) {
        System.out.println("错误信息" + ex.getMessage());
        return buildFailedResultInfo(HttpStatus.BAD_REQUEST, ex.getMessage());
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public BaseResult handleResourceNotFoundError(ResourceNotFoundException ex) {
        System.out.println(ex.getMessage());
        return buildFailedResultInfo(HttpStatus.NOT_FOUND, ex.getMessage());
    }

    @ExceptionHandler(ForbiddenException.class)
    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    @ResponseBody
    public BaseResult handleRorbiddenError(ForbiddenException ex) {
        return buildFailedResultInfo(HttpStatus.FORBIDDEN, ex.getMessage());

    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public BaseResult handleUnexpectedServerError(RuntimeException ex) {
        System.out.println(ex.getMessage());

        return buildFailedResultInfo(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage());
    }
}
