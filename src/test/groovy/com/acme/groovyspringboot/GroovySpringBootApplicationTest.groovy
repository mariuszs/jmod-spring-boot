package com.acme.groovyspringboot

import org.junit.Test
import spock.lang.Specification

import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class GroovySpringBootApplicationTest extends Specification {

	def 'should loads context'() {
		expect:
			true
	}

}
