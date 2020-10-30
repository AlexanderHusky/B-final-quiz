package com.example.demo.service;

import com.example.demo.dao.DataProvider;
import com.example.demo.exception.UserAleadyExistException;
import com.example.demo.exception.UserNotExistException;
import com.example.demo.model.Trainee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TraineeService {

    public ArrayList<Trainee> getAllTrainees() {
        return DataProvider.trainees;
    }

    public void addNewTrainee(Trainee trainee) throws UserAleadyExistException {
        //TODO GTB-工程实践: - TraineeService.java:19 命名不够表意，不要进行不表意的缩写
        for (Trainee nee : DataProvider.trainees) {
            //TODO GTB-工程实践: - TraineeService.java:21 这种写法可能抛NPE
            if(nee.getName().equals(trainee.getName())) {
                throw new UserAleadyExistException("学员已存在，请检查后再输入");
            }
        }
        DataProvider.trainees.add(trainee);
    }

    public void deleteTraineeById(long trainee_id) throws UserNotExistException {
        Trainee find_trainee = null;
        for (Trainee nee : DataProvider.trainees) {
            //TODO GTB-工程实践: - TraineeService.java:30 尽量使用 equals()
            if(nee.getId() == trainee_id) {
                find_trainee = nee;
            }
        }
        if(find_trainee == null) {
            throw new UserNotExistException("学员不存在");
        }else {
            DataProvider.trainees.remove(find_trainee);
        }
    }
}
