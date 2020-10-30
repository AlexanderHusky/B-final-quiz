package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//TODO GTB-知识点: * 了解下异常处理
@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "用户已存在，请检查后再添加")
public class UserAleadyExistException extends Exception{
    UserAleadyExistException(){}
    public UserAleadyExistException(String s){
        super(s);
    }
}
