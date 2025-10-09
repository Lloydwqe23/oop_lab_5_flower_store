package com.example;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<FlowerBucket> flowerBuckets = new ArrayList<>();

    public void addFlowerBucket(FlowerBucket newBucket) {
        flowerBuckets.add(newBucket);
    }
    public List<FlowerBucket> search(double somePrice) {
        List<FlowerBucket> searchedBuckets = new ArrayList<>();
        for (FlowerBucket bucket: flowerBuckets) {
            if (bucket.price() <= somePrice) {
                searchedBuckets.add(bucket);
            }
        }
        return searchedBuckets;
    }
}
