package com.github;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DatasourceConfig {
	@Autowired
	private Environment environment;

	private final String DS_1_URL = "spring.1.datasource.url";
	private final String DS_1_USER = "spring.1.datasource.username";
	private final String DS_1_DRIVER = "spring.1.datasource.driver-class-name";
	private final String DS_1_PASSWORD = "spring.1.datasource.password";

	private final String DS_2_URL = "spring.2.datasource.url";
	private final String DS_2_USER = "spring.2.datasource.username";
	private final String DS_2_DRIVER = "spring.2.datasource.driver-class-name";
	private final String DS_2_PASSWORD = "spring.2.datasource.password";

	@Bean("datasource1")
	public DataSource dataSource1() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		try {
			driverManagerDataSource.setUrl(environment.getProperty(DS_1_URL));
			driverManagerDataSource.setUsername(environment.getProperty(DS_1_USER));
			driverManagerDataSource.setPassword(environment.getProperty(DS_1_PASSWORD));
			driverManagerDataSource.setDriverClassName(environment.getProperty(DS_1_DRIVER));
		} catch (Exception e) {
			System.out.println("Error initializing datasource ");
		}
		return driverManagerDataSource;
	}

	@Bean("datasource2")
	public DataSource dataSource2() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		try {
			driverManagerDataSource.setUrl(environment.getProperty(DS_2_URL));
			driverManagerDataSource.setUsername(environment.getProperty(DS_2_USER));
			driverManagerDataSource.setPassword(environment.getProperty(DS_2_PASSWORD));
			driverManagerDataSource.setDriverClassName(environment.getProperty(DS_2_DRIVER));
		} catch (Exception e) {
			System.out.println("Error initializing datasource ");
		}
		return driverManagerDataSource;
	}
}
