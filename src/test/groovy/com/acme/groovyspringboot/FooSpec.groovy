package com.acme.groovyspringboot

import org.spockframework.spring.StubBeans
import spock.lang.Specification

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

@WebMvcTest(FooController)
@StubBeans(BarService)
class FooSpec extends Specification {

	@Autowired
	private MockMvc mvc

	def "should access foo"() {
		expect:
			this.mvc.perform(get("/foo"))
					.andExpect(status().isOk());
	}

}
