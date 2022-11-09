package web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.User;
import web.services.UsersServiceImpl;

import java.util.List;

@Controller
public class UserController {

	private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	private final int USERCOUNT = 5;

	@Autowired
	private UsersServiceImpl usersService;

	@GetMapping(value = "/users")
	public String printUsers(ModelMap model,
							@RequestParam(required = false) String count) {
		List<User> users;
		if (count == null) {
			users = usersService.getUsers(USERCOUNT);
		}
		else {
			users = usersService.getUsers(Integer.parseInt(count));
		}
		model.addAttribute("users", users);
		return "users";
	}
}