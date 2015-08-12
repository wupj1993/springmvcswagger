/*
 * Copyright (c) 2015 / 8 / 12 3 :2 :31
 * BY:wupeiji
 * QQ:757671834
 *
 */

package w.p.j.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import w.p.j.daomain.BaseResult;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidRequestException extends RuntimeException {
    public InvalidRequestException(String message) {
        super(message);
    }

}
