open module acme.modapp {
	requires java.instrument;
	requires java.validation;
	requires java.sql;

	requires slf4j.api;

	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.web;
	requires spring.webmvc;

	requires jdk.unsupported;
}