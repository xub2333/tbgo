package tbgojar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tbgo")
@EnableAutoConfiguration
public class controller {
	@GetMapping("login")
	public String show() {
		return "show login";
	}
	
	public static void main(String[] args) {
		//runnnn17
		SpringApplication.run(controller.class, args);
	}
}
