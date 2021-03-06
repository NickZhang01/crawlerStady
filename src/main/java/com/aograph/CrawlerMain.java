package com.aograph;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = HibernateJpaAutoConfiguration.class)
@EnableScheduling
@ComponentScan(basePackages={"com.aograph"})
public class CrawlerMain {

	public static void main(String[] args) {
		SpringApplication.run(CrawlerMain.class, args);
	}
}
