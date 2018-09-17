package com.acme.groovyspringboot

import groovy.transform.CompileStatic

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CompileStatic
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
