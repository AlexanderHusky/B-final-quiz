package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "用户已存在，请检查后再添加")
public class UserAleadyExistException extends Exception{
    UserAleadyExistException(){}
    public UserAleadyExistException(String s){
        super(s);
    }
}
