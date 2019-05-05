package io.springboot.springboot.starter.topics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("/hi")
	public String greet()
	{
		return "hi";
	}

}
