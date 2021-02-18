package com.github;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages = { "com.github" })
@PropertySource("classpath:application.properties")
public class AppConfig {

	private JdbcTemplate jdbcTemplateDS1;
	private JdbcTemplate jdbcTemplateDS2;

	@Autowired
	public AppConfig(@Autowired DatasourceConfig datasourceConfiguration) {
		jdbcTemplateDS1 = new JdbcTemplate(datasourceConfiguration.dataSource1());
		jdbcTemplateDS2 = new JdbcTemplate(datasourceConfiguration.dataSource2());
	}

	public JdbcTemplate getJdbcTemplateDS1() {
		return this.jdbcTemplateDS1;
	}

	public JdbcTemplate getJdbcTemplateDS2() {
		return this.jdbcTemplateDS2;
	}
}
