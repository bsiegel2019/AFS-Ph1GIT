package com.drones.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.drones.model.Drone;

@Service("droneService")
public class DroneServiceImpl implements DroneService {

	private static final AtomicLong counter = new AtomicLong();

	private static List<Drone> drones;
	
	static {
		drones = populateDummyDrones();
	}

	public List<Drone> findAllDrones() {
		return drones;
	}

	public void addDrone(Drone drone) {
		drone.setDroneId(counter.incrementAndGet());
		drones.add(drone);
	}

	private static List<Drone> populateDummyDrones() {
		List<Drone> drones = new ArrayList<Drone>();
		drones.add(new Drone(counter.incrementAndGet(), "Owner1", "Super Sportster", "Sport", "60 in", "crashed, not fixable",
				"future feature"));
		drones.add(new Drone(counter.incrementAndGet(), "Bernard", "Clound Bound", "Glider", "4 meter", "repaired", "future feature"));
		drones.add(new Drone(counter.incrementAndGet(), "None", "Lawn Dart", "Rotorcraft", "4x12 in", "Flying ballistically",
				"future feature"));
		return drones;
	}

	public Drone findDroneById(Long id) {
		for (Drone drone : drones) {
			if (drone.getDroneId() == id) {
				return drone;
			}
		}
		return null;
	}

	public void deleteDroneById(Long id) {

		for (Iterator<Drone> iterator = drones.iterator(); iterator.hasNext();) {
			Drone drone = iterator.next();
			if (drone.getDroneId() == id) {
				iterator.remove();
			}
		}
	}

}
