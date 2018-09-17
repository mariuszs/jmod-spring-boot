package com.acme.groovyspringboot

import groovy.transform.CompileStatic

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@CompileStatic
class GroovySpringBootApplication {

	static void main(String[] args) {
		SpringApplication.run GroovySpringBootApplication, args
	}
}
