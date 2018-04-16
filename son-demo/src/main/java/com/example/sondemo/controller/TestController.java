package com.example.sondemo.controller;

import com.example.sondemo.entity.BigCar;
import com.example.sondemo.entity.BookDO;
import com.example.sondemo.entity.LittleCar;
import com.example.sondemo.service.BooksService;
import com.example.sondemo.service.CarsService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private CarsService carsService;
    @Autowired
    private BooksService booksService;
    //汽车：鉴别器
    @GetMapping(value = "api/CarService/LittleCars")
    @ApiOperation(value = "小汽车",notes = "鉴别器")
    public LittleCar getLittleCar(){
        return carsService.selectCarsL();
    }
    @GetMapping(value = "api/CarService/BigCars")
    @ApiOperation(value = "大汽车",notes = "鉴别器")
    public BigCar getBigCar(){
        return carsService.selectCarsB();
    }
    //书和作者：一对多
    @GetMapping(value = "api/CarService/Books/{bid}")
    @ApiOperation(value = "作者和书名",notes = "一对多、缓存")
    public BookDO getBookDO(@PathVariable("bid") int  bid){
        return booksService.selectBooks(bid);
    }
}
