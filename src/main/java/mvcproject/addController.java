package mvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class addController {
	@RequestMapping("/add")
	public String add() {
		System.out.println("inside controller..");
		//jhgasj
		//shdfgfsdjgfj
		return "display.jsp";
		//shgsfgd
	}
}
