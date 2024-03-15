package com.example.demo;

import com.example.demo.model.CarModel;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Getter
@Service
public class CarService2 {
    private final List<CarModel> carList2;

    public CarService2() {
        CarModel car1 = new CarModel("Toyota", "Blue");
        CarModel car2 = new CarModel("Mazda", "Yellow");
        CarModel car3 = new CarModel("Renault", "Green");

        carList2 = new ArrayList<>();
        carList2.add(car1);
        carList2.add(car2);
        carList2.add(car3);
    }

}
