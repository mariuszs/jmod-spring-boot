package com.acme.groovyspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FooController {

	private final BarService barService;

	public FooController(BarService barService) {
		this.barService = barService;
	}

	@GetMapping("/foo")
	public void foo() {
		barService.bar();
	}
}
