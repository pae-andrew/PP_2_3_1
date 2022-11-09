package web.controller;

import com.mysql.cj.log.Slf4JLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.services.CarsServiceImpl;

import java.util.List;

@Controller
public class CarController {

	Logger LOGGER = LoggerFactory.getLogger(CarController.class);

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
		LOGGER.info(cars.toString());
		return "cars";
	}

}