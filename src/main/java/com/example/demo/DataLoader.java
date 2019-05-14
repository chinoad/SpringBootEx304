package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car = new Car(2015, "Jeep", "Grand Cherokee");
        repository.save(car);

        car = new Car(2018, "Subaru", "Forrester");
        repository.save(car);

        car = new Car(2011, "Jeep", "Wrangler");
        repository.save(car);
    }
}
