package com.example.maintenance;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController   //controller for handling http request
@RequestMapping("/dronora/") //base URL for all endpoints defined in this class is ("/dronora/")
public class DroneController {

    private final List<Drone> droneFleet = new ArrayList<>();
    //variable (private)restricted access to the droneFleet list within the class.
    //The droneFleet is list type(variable)container to hold the list of object from Drone class,and it is initialized as an empty ArrayList.
    @GetMapping("/info")
    public String getInfo() {
        return "Hello World";
    }

    @GetMapping("/drones")
    public List<Drone> getAllDrones(){ // This method handles GET requests to ("/drones") and returns the entire droneFleet list.
        System.out.println("Drone fleet is:"+ droneFleet);
        return droneFleet;
    }

    @GetMapping("/drones/{id}") // This method handles GET requests to /drones/{id} and returns a specific drone from droneFleet based on the provided id.
    public Drone getDrone(@PathVariable String id) {
        return droneFleet.stream()
                .filter(drone -> drone.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping("/drones") // This method handles POST requests to /drones, adds a new drone to droneFleet, and returns a success message.
    public String addDrone(@RequestBody Drone drone) {
        droneFleet.add(drone); //
        return "Drone is added";
    }

    @PutMapping("/drones/{id}") // localhost:8080/drones/id to update drone
    public String updateDrone(@PathVariable String id, @RequestBody Drone updatedDrone) {
        System.out.println("ID is:" + id);
        for (int i = 0; i < droneFleet.size(); i++) {
            if (droneFleet.get(i).getId().equals(id)) {
                Drone existingDrone = droneFleet.get(i);
                existingDrone.setName(updatedDrone.getName());
                existingDrone.setCapacity(updatedDrone.getCapacity());
                return "Drone updated";
            }
        }
        return "Drone not found";
    }

    @DeleteMapping("/drones/{id}") // localhost:8080/drones/125 -- Delete one drone data -- GET
    public String deleteDrone(@PathVariable String id) {
        return droneFleet.removeIf(drone -> drone.getId().equals(id)) ?
                "Drone removed successfully" : "Drone not found";
    }
}
