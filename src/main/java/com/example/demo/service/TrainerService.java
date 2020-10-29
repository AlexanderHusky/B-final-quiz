package com.example.demo.service;

import com.example.demo.dao.DataProvider;
import com.example.demo.exception.UserAleadyExistException;
import com.example.demo.exception.UserNotExistException;
import com.example.demo.model.Trainee;
import com.example.demo.model.Trainer;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.ArrayList;

@Service
public class TrainerService {

    public ArrayList<Trainer> getAllTrainers() {
        return DataProvider.trainers;
    }

    public void addNewTrainer(Trainer trainer) throws UserAleadyExistException {
        for (Trainer trainer1 : DataProvider.trainers) {
            if(trainer1.getName().equals(trainer.getName())){
                throw new UserAleadyExistException("讲师已存在");
            }
        }
        DataProvider.trainers.add(trainer);
    }

    public void deleteTrainerById(long trainer_id) throws UserNotExistException {
        Trainer find_trainer = null;
        for (Trainer ner : DataProvider.trainers) {
            if(ner.getId() == trainer_id) {
                find_trainer = ner;
            }
        }
        if(find_trainer == null) {
            throw new UserNotExistException("学员不存在");
        }else {
            DataProvider.trainees.remove(find_trainer);
        }
    }

}
