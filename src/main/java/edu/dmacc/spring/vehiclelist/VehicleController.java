package edu.dmacc.spring.vehiclelist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VehicleController {
	@Autowired VehicleDao dao;
	private static final String[] make = { "Audi", "Buick", "Chrysler", "Cadillac", "Dodge", "Ford", "GMC", "Jeep", "Lexus", "Mitubishi"};

	@RequestMapping(value = "/form")
	public ModelAndView vehicles() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("vehicleForm");
		modelAndView.addObject("vehicles", new Vehicles());
		modelAndView.addObject("make", make);

		return modelAndView;
	}

	@RequestMapping(value = "/result")
	public ModelAndView processVehicles(Vehicles vehicle) {
		ModelAndView modelAndView = new ModelAndView();
		dao.insertVehicle(vehicle);
		modelAndView.setViewName("vehicleResult");
		modelAndView.addObject("v", vehicle);

		return modelAndView;
	}
	
	@RequestMapping(value = "/viewAll")
	public ModelAndView viewAll() {
		ModelAndView modelAndView = new ModelAndView();
		List<Vehicles> allVehicles = dao.getAllVehicles();
		modelAndView.setViewName("viewAllVehicles");
		modelAndView.addObject("all", allVehicles);
		return modelAndView;

	}

	@Bean
	public VehicleDao dao() {
		VehicleDao bean = new VehicleDao();
		return bean;
	}
}