package com.ej.b6r1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ej.b6r1.bean.Greeting;

@RestController
@RequestMapping("/api")
public class B6r1Controller {

	 	@RequestMapping("/")
	    public String welcome() {
	        return "Welcome to RestTemplate Example.";
	    }
	 
	    @RequestMapping("/hello/{name}")
	    public Greeting message(@PathVariable String name) {
	 
	        Greeting  msg = new Greeting(name, "Hello " + name);
	        return msg;
	    }
}
