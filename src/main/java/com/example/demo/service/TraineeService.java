package com.example.demo.service;

import com.example.demo.dao.DataProvider;
import com.example.demo.exception.TraineeAleadyExistException;
import com.example.demo.exception.TraineeNotExistException;
import com.example.demo.model.Trainee;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.ArrayList;

@Service
public class TraineeService {

    public ArrayList<Trainee> getAllTrainees() {
        return DataProvider.trainees;
    }

    public void addNewTrainee(Trainee trainee) throws TraineeAleadyExistException {
        for (Trainee nee : DataProvider.trainees) {
            if(nee.getName().equals(trainee.getName())) {
                throw new TraineeAleadyExistException("学员已存在，请检查后再输入");
            }
        }
        DataProvider.trainees.add(trainee);
    }

    public void deleteTraineeById(long trainee_id) throws TraineeNotExistException {
        Trainee find_trainee = null;
        for (Trainee nee : DataProvider.trainees) {
            if(nee.getId() == trainee_id) {
                find_trainee = nee;
            }
        }
        if(find_trainee == null) {
            throw new TraineeNotExistException("学员不存在");
        }else {
            DataProvider.trainees.remove(find_trainee);
        }

    }
}
