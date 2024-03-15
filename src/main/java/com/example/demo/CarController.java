package com.example.demo;

import com.example.demo.model.CarModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
//    @Autowired
    private final CarService car;
    private final CarService2 car2;

    public CarController(CarService car, CarService2 car2) {
        this.car = car;
        this.car2 = car2;
    }
//    private CarService car;
//    @Autowired
//    public void setCar(CarService car) {
//        this.car = car;
//    }
    @GetMapping
    public List<CarModel> get() {
        return car.getCarList();
    }
    @GetMapping("/car")
    public List<CarModel> getCars(){
        return car2.getCarList2();
    }
}
