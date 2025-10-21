package ua.edu.ucu.apps2025.lab7.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps2025.lab7.flower.Flower;
import ua.edu.ucu.apps2025.lab7.flower.FlowerColor;
import ua.edu.ucu.apps2025.lab7.flower.FlowerType;

@RestController
public class FlowerController {

    @GetMapping("/flower")
    public List<Flower> getFlowers() {
        return List.of(
            new Flower(FlowerColor.RED, 100, 10, FlowerType.TULIP)
        );
    }
}
