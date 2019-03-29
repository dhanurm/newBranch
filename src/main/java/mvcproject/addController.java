package mvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addController {
	@RequestMapping("/add")
	public String add() {
		//fnsdjfsd
		System.out.println("inside controller..");
		//gdshfhgdsfh
		return "display.jsp";
		//gsdadsgak
	}
}
