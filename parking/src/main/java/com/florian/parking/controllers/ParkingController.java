package com.florian.parking.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.florian.parking.models.Parking;
import com.florian.parking.services.ParkingService;

@RestController
public class ParkingController {
	
	@Autowired
	private ParkingService parkingService;
	
	@CrossOrigin("http://localhost:4200")
	@RequestMapping(path = "/api/parkings", method = RequestMethod.GET)
	public List<Parking> getListeParkings(){
		/*Parking parkingTest = new Parking();
		parkingTest.setNom("Parking de test");
		parkingTest.setNbPlacesTotal(300);
		parkingTest.setNbPlacesDispo(125);
		parkingTest.setStatut("FERME");
		parkingTest.setHeureMaj("20h15");
		ArrayList<Parking> liste = new ArrayList<Parking>();
		liste.add(parkingTest);*/
		
		return parkingService.getListParkings();
	}
}
