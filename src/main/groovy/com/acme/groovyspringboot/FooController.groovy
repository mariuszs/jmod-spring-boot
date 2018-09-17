package com.acme.groovyspringboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FooController {

	private final BarService barService

	FooController(BarService barService) {
		this.barService = barService
	}

	@GetMapping("/foo")
	void foo() {
		barService.bar()
	}
}
