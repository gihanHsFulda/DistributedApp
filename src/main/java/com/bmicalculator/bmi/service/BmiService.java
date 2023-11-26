//author - Gihan Kaushal
//date - 2023-11-05
//Matriculation number - 1455441

package com.bmicalculator.bmi.service;

import com.bmicalculator.bmi.BmiBean;
import com.bmicalculator.bmi.repository.BmiRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BmiService {

    BmiRepository bmiRepository;

    public BmiService(BmiRepository bmiRepository) {
        this.bmiRepository = bmiRepository;
    }

    public void saveUser(BmiBean bmiBean) {
        bmiRepository.save(bmiBean);
    }

    public List<BmiBean> getAllUser() {
        return bmiRepository.findAll();
    }
}
