package com.example.demo;

import com.example.demo.model.CarModel;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Getter
@Service
public class CarService {
    private final List<CarModel> carList;

    public CarService() {
        CarModel car1 = new CarModel("Audi", "Red");
        CarModel car2 = new CarModel("Opel", "White");
        CarModel car3 = new CarModel("Peugeot", "Black");

        carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }

}

