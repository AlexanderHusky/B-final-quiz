package com.example.demo.controller;

import com.example.demo.exception.TraineeAleadyExistException;
import com.example.demo.exception.TraineeNotExistException;
import com.example.demo.model.Trainee;
import com.example.demo.service.TraineeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
@Validated
@CrossOrigin("http://localhost:1234")
public class TraineeController {

    private final TraineeService traineeService;


    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @GetMapping("/trainee")
    public ResponseEntity<ArrayList<Trainee>> getTrainees() {
        return new ResponseEntity(traineeService.getAllTrainees(), HttpStatus.OK);
    }

    @PostMapping("/trainee")
    public ResponseEntity addNewTrainees(@RequestBody @Valid Trainee trainee) throws TraineeAleadyExistException {
        traineeService.addNewTrainee(trainee);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/trainee/{trainee_id}")
    public ResponseEntity deleteTraineeById(@PathVariable long trainee_id) throws TraineeNotExistException {
        traineeService.deleteTraineeById(trainee_id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
