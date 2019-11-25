package com.drones.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.drones.model.Drone;
import com.drones.service.DroneService;

@RestController
public class DroneRestController {

	@Autowired
	DroneService droneService; // Service which will do all data retrieval/manipulation work

	// -------------------Retrieve All Drones----------
	@RequestMapping(value = "/drones", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Drone>> listAllDrones() {
		List<Drone> drones = droneService.findAllDrones();
		if (drones.isEmpty()) {
			// You many decide to return HttpStatus.NOT_FOUND
			return new ResponseEntity<List<Drone>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Drone>>(drones, HttpStatus.OK);
	}

	// ------------------- Delete a Drone --------------
	@RequestMapping(value = "/drones/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Drone> deleteDrone(@PathVariable("id") Long id) {

		Drone drone = droneService.findDroneById(id);

		if (drone == null) {
			return new ResponseEntity<Drone>(HttpStatus.NOT_FOUND);
		}

		droneService.deleteDroneById(id);
		return new ResponseEntity<Drone>(HttpStatus.NO_CONTENT);
	}

}