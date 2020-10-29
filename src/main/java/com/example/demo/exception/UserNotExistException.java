package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "该学员不存在，无法删除")
public class UserNotExistException extends Exception{
    UserNotExistException(){}
    public UserNotExistException(String s){
        super(s);
    }
}
