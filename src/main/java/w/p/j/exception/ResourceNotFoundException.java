/*
 * Copyright (c) 2015 / 8 / 12 3 :2 :31
 * BY:wupeiji
 * QQ:757671834
 *
 */

package w.p.j.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
        System.out.println("NOT_FOUND");

    }
}
