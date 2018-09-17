package com.acme.groovyspringboot

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc
import org.springframework.web.context.WebApplicationContext

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class FooSpec extends ContractBaseSpec {

	@Autowired
	private WebApplicationContext context

	@Autowired
	private MockMvc mvc

	def "should access foo"() {
		expect:
			context
			this.mvc.perform(get("/foo"))
					.andExpect(status().isOk());
	}

}
