package com.bread.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer{
	
	// CORS����
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// ��� �������� ���� ��� ���ҽ��� �޼��� ���
		registry.addMapping("/**").allowedMethods("*");
	}

}