package com.psl.seatmanagement.controller;

import com.psl.seatmanagement.model.Location;
import com.psl.seatmanagement.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/location")
public class LocationController {
    @Autowired
    LocationService locationService;
    @PostMapping
    public void addLocation(@RequestBody Location location){
        locationService.addLocation(location);
    }
    @GetMapping
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }
}
