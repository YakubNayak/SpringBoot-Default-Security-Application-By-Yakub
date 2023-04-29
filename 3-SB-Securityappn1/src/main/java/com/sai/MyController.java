package com.sai;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/home")
	public String homePage()
	{
		return "<h1>Welcome To Spring Security Application</h1>";
	}
}
