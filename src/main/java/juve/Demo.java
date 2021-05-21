package juve;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	@GetMapping("/demo/Portada")
	public String Index()
	{
		
		return"Portada";
		
	}
}
