package com.acme.groovyspringboot;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BarService {

	public void bar() {
		log.info("bar...");
	}

}
