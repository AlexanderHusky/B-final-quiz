package com.example.demo.dao;

import com.example.demo.model.Trainee;
import com.example.demo.model.Trainer;

import java.util.ArrayList;

public class DataProvider {

    public static ArrayList<Trainee> trainees = new ArrayList<>();
    public static ArrayList<Trainer> trainers = new ArrayList<>();

    static {
        trainees.add(new Trainee(1, "学员1"));
        trainees.add(new Trainee(2, "学员2"));
        trainees.add(new Trainee(3, "学员3"));
        trainees.add(new Trainee(4, "学员4"));
        trainees.add(new Trainee(5, "学员5"));
        trainees.add(new Trainee(6, "学员6"));
        trainees.add(new Trainee(7, "学员7"));
        trainees.add(new Trainee(8, "学员8"));
        trainees.add(new Trainee(9, "学员9"));
        trainees.add(new Trainee(10, "学员10"));
        trainees.add(new Trainee(11, "学员11"));
        trainees.add(new Trainee(12, "学员12"));
        trainees.add(new Trainee(13, "学员13"));
        trainees.add(new Trainee(14, "学员14"));
        trainees.add(new Trainee(15, "学员15"));

        trainers.add(new Trainer(1, "讲师1"));
        trainers.add(new Trainer(2, "讲师2"));
        trainers.add(new Trainer(3, "讲师3"));
        trainers.add(new Trainer(4, "讲师4"));
        trainers.add(new Trainer(5, "讲师5"));
        trainers.add(new Trainer(6, "讲师6"));
        trainers.add(new Trainer(7, "讲师7"));
        trainers.add(new Trainer(8, "讲师8"));
        trainers.add(new Trainer(9, "讲师9"));
    }
}
