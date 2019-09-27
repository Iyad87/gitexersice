package com.mobiquityinc.model;

import java.util.List;

public class Item {
    int index;
    double weight;
    int cost;


    public Item(int index, double weight, int cost) {
        this.index = index;
        this.weight = weight;
        this.cost = cost;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}



