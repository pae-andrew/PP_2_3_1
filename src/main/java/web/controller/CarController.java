package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarsServiceImpl;

import java.util.List;

@Controller
public class CarController {

	private final int CARCOUNT = 5;

	@Autowired
	private CarsServiceImpl carsService;

	@GetMapping(value = "/cars")
	public String printCars(ModelMap model,
							@RequestParam(required = false) String count) {
		List<Car> cars;
		if (count == null) {
			cars = carsService.getCars(CARCOUNT);
		}
		else {
			cars = carsService.getCars(Integer.parseInt(count));
		}
		model.addAttribute("cars", cars);
		return "cars";
	}
}