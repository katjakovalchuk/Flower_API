package ua.edu.ucu.apps.lab.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers() {
        return flowerRepository.findAll();
    }

    public void add(Flower flower) {
        flowerRepository.save(flower);
    }
}
// List.of(new Flower(FlowerColor.RED,
// (double) price,
// (double) sepalLength,
// FlowerType.ROSE))