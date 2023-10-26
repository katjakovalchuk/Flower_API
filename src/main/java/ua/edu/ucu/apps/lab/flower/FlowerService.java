package ua.edu.ucu.apps.lab.flower;

import java.util.ArrayList;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlowerService {
    private List<Flower> listOfFlowers;
    private List<FlowerPack> listOfFlowerPacks;
    private List<FlowerBucket> listOfFlowerBuckets;

    public FlowerService() {
        listOfFlowers = new ArrayList<Flower>();
        listOfFlowerPacks = new ArrayList<FlowerPack>();
        listOfFlowerBuckets = new ArrayList<FlowerBucket>();
    }

    // private FlowerRepository flowerRepository;

    // @Autowired
    // public FlowerService(FlowerRepository flowerRepository) {
    // this.flowerRepository = flowerRepository;
    // }

    public List<Flower> getFlowers() {
        // return flowerRepository.findAll();
        // return listOfFlowers;
        double PRICE = 10;
        double SEPALLENGHT = 0.8;
        return List.of(new Flower(FlowerColor.RED,
                (double) PRICE, 
                (double) SEPALLENGHT,
                FlowerType.ROSE));
    }

    public void addFlower(Flower flower) {
        listOfFlowers.add(flower);
    }

    public void removeFlower(Flower flower) {
        listOfFlowers.remove(flower);
    }

    public void addFlowerPack(Object flowerPack) {
        listOfFlowerPacks.add((FlowerPack) flowerPack);
    }

    public void removeFlowerPack(Object flowerPack) {
        listOfFlowerPacks.remove(flowerPack);
    }

    public void addFlowerBucket(Object flowerBucket) {
        listOfFlowerBuckets.add((FlowerBucket) flowerBucket);
    }

    public void removeFlowerBucket(Object flowerBucket) {
        listOfFlowerBuckets.remove(flowerBucket);
    }

}
