package com.example.demo.controller;

import com.example.demo.exception.UserAleadyExistException;
import com.example.demo.exception.UserNotExistException;
import com.example.demo.model.Trainee;
import com.example.demo.model.Trainer;
import com.example.demo.service.TrainerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;

@RestController
public class TrainerController {

    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/trainer")
    public ResponseEntity<ArrayList<Trainee>> getTrainees() {
        return new ResponseEntity(trainerService.getAllTrainers(), HttpStatus.OK);
    }

    @PostMapping("/trainer")
    public ResponseEntity addNewTrainers(@RequestBody @Valid Trainer trainer) throws UserAleadyExistException {
        trainerService.addNewTrainer(trainer);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @DeleteMapping("/trainer/{trainer_id}")
    public ResponseEntity deleteTrainerById(@PathVariable long trainer_id) throws UserNotExistException {
        trainerService.deleteTrainerById(trainer_id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
