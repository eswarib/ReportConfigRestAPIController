package com.example.reportConfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ReportConfigApplication  {
//	public class ReportConfigApplication  extends SpringBootServletInitializer {

	//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(ReportConfigApplication.class);
//	}
	public static void main(String[] args) {
		try {
		SpringApplication.run(ReportConfigApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World from Tomcat";
	}
}
