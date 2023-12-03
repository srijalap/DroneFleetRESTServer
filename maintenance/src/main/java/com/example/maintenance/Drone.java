package com.example.maintenance;

public class Drone {
    private String id;
    private String name;
    private int capacity;




    // Constructor
    public Drone(String id, String name, int capacity ) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;


    }

    // Getters and setters for all properties

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }



}

