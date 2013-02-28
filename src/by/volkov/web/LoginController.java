package by.volkov.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/*
import by.testtask.entity.User;
import by.testtask.service.UserSaverImpl;
*/

@Controller
public class LoginController {
/*		
	@RequestMapping("/checklogin")
	public String login(@ModelAttribute User user, BindingResult result) throws Exception {
		UserSaverImpl.getInstance().save(user);
		return "checkuser";

		
		 // boolean isSuccessfull = loginDao.checkLogin(user); return
		 // isSuccessfull ? "forward:/checkuser" : "login";
		 
	}
*/
	@RequestMapping("/login")
	public String loginJsp(Model model) {
		return "login";
	}
/*
	@RequestMapping("/page3")
	public String showDetails(@ModelAttribute User user, BindingResult result) {

		return "page3";

	}

	@ModelAttribute("user")
	public User populateUser() {
		return new User();
	}
	*/
}