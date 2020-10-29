package com.example.demo.service;

import com.example.demo.dao.DataProvider;
import com.example.demo.model.Trainee;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GroupService {

    public static void devideGroupsAccordingToTrainers() {

        int groupNumber = calculateGroupNumeberAccordingToTrainers();
        for(int i=1; i<=groupNumber;i++) {
            DataProvider.map.put(""+i,new ArrayList<Trainee>());
        }
        System.out.println(DataProvider.map);
    }

    public static void addTraineeToGroup() {
        /*先计算出有多少n轮  轮数等于学生数量除以组数（无余数）
        * 计算出余出多少学生，余数就是从第一组已经塞进去n个学生后挨个加1*/
        int groupNumber = calculateGroupNumeberAccordingToTrainers(); // 组数
        int traineeNumber = DataProvider.trainees.size();
        int turn = traineeNumber / groupNumber;
        int turn_left = traineeNumber % groupNumber;

        /*将学生开始塞进每个组里，
        1. 先每个组塞n个
        2. 余数作为循环轮数进行循环*/
        for(int i=1;i<=groupNumber;i++){
            for(int temp=0; i<turn;temp++) {
                DataProvider.map.get(""+i).add(DataProvider.trainees.get(temp));
            }
        }
        System.out.println(DataProvider.map);
    }

    public static int calculateGroupNumeberAccordingToTrainers() {
        return DataProvider.trainers.size() / 2;
    }

    public static int calculateLeftTrainerNumberAfterDevideGroup() {
        return DataProvider.trainers.size() % 2;
    }


    public void shuffleTrainees() {

        DataProvider.traineesMock = DataProvider.trainees;
        // 洗牌模拟组的学员
        Collections.shuffle(DataProvider.traineesMock);
    }

    public void shuffleTrainers() {
        DataProvider.trainersMock = DataProvider.trainers;
        // 洗牌模拟组的讲师
        Collections.shuffle(DataProvider.trainersMock);
    }
}
