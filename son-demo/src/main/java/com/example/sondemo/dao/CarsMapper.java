package com.example.sondemo.dao;

import com.example.sondemo.entity.BigCar;
import com.example.sondemo.entity.Cars;
import com.example.sondemo.entity.LittleCar;

public interface CarsMapper {
    LittleCar selectCarLByPrimaryKey();
    BigCar selectCarBByPrimaryKey();

}