package com.drones.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.drones.model.Drone;
import com.drones.service.DroneService;

@Controller
public class DroneController {

	@Autowired
	DroneService droneService;

	@RequestMapping(value = "/droneManagement", method = RequestMethod.GET)
	public ModelAndView showForm() {
		return new ModelAndView("droneManagement", "drone", droneService.findAllDrones());
	}

	@RequestMapping(value = "/droneAdd", method = RequestMethod.GET)
	public ModelAndView showForm1() {
		return new ModelAndView("droneAdd", "drone", new Drone());
	}

	@RequestMapping(value = "/droneConfirmation", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("drone") Drone drone, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}

		model.addAttribute("droneId", drone.getDroneId());
		model.addAttribute("droneOwnerName", drone.getDroneOwnerName());
		model.addAttribute("droneName", drone.getDroneName());
		model.addAttribute("droneType", drone.getDroneType());
		model.addAttribute("droneSpan", drone.getDroneSpan());
		model.addAttribute("droneStatus", drone.getDroneStatus());
		model.addAttribute("droneImage", drone.getDroneImage());
		droneService.addDrone(drone);
		return "droneConfirmation";
	}

}
