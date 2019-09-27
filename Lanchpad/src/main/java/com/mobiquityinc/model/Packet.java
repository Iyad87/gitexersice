package com.mobiquityinc.model;

import java.util.ArrayList;
import java.util.List;

public class Packet {
    public int capacity;
    public List<Item> items;

    public Packet() {

    }

    public Packet(int capacity, List<Item> items) {
        this.capacity = capacity;
        this.items = items;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<Item> getItems() {
        if(items == null) {
            items = new ArrayList<> (  );
        }
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}



