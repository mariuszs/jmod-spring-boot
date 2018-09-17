package com.acme.groovyspringboot

import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.spockframework.spring.SpringBean
import spock.lang.Specification

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.web.context.WebApplicationContext

@WebMvcTest
class ContractBaseSpec extends Specification {

	@Autowired
	private WebApplicationContext context

	@SpringBean
	BarService barService = Mock()

	def setup() {
		RestAssuredMockMvc.webAppContextSetup(context)
	}

}
