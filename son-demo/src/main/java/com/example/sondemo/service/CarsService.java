package com.example.sondemo.service;

import com.example.sondemo.dao.CarsMapper;
import com.example.sondemo.entity.BigCar;
import com.example.sondemo.entity.Cars;
import com.example.sondemo.entity.LittleCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsService {
    @Autowired
    private CarsMapper carsMapper;
    public LittleCar selectCarsL(){
        return carsMapper.selectCarLByPrimaryKey();
    }
    public BigCar selectCarsB(){
        return carsMapper.selectCarBByPrimaryKey();
    }
}
