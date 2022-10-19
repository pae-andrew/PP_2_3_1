package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarsService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

	@Autowired
	private CarsService carsService;

	@GetMapping(value = "/cars")
	public String printCars(ModelMap model, @RequestParam("count") int count) {
		List<Car> cars = carsService.getCars(count);
		model.addAttribute("cars", cars);
		return "cars";
	}
	
}