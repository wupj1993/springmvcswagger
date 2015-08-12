/*
 * Copyright (c) 2015 / 8 / 12 3 :35 :25
 * BY:wupeiji
 * QQ:757671834
 *
 */

package w.p.j.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * -------------------------------------
 * Created by wupeji on 2015-08-12 15:35
 * ----------------------------------------
 **/
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {
        super(message);
    }
}
