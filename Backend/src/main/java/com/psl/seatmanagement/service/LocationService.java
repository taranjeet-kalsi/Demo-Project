package com.psl.seatmanagement.service;

import com.psl.seatmanagement.model.Location;
import com.psl.seatmanagement.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Arrays;
import java.util.List;

@Service
public class LocationService {
@Autowired
    LocationRepository locationRepository;
    public void addLocation(@RequestBody Location location){
        locationRepository.save(location);
    }
    public List<Location> getAllLocations(){
        return (List<Location>) locationRepository.findAll();
    }
}
