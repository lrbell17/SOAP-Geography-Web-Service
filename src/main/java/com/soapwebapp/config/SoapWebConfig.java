package com.soapwebapp.config;


import javax.servlet.Servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class SoapWebConfig extends WsConfigurerAdapter {

	@Bean
	public ServletRegistrationBean<Servlet> messageDispacherServlet(ApplicationContext context) {
		
		MessageDispatcherServlet servlet = new MessageDispatcherServlet();
		servlet.setApplicationContext(context);
		servlet.setTransformWsdlLocations(true);
		
		return new ServletRegistrationBean<Servlet>(servlet, "/soapWS/*");
	}
	
	@Bean
	public XsdSchema userSchema() {
		return new SimpleXsdSchema(new ClassPathResource("schema.xsd"));
	}
	
	@Bean
	public DefaultWsdl11Definition defaultWsdl11Definition(XsdSchema userSchema) {
		
		DefaultWsdl11Definition definition = new DefaultWsdl11Definition();
		definition.setSchema(userSchema);
		definition.setLocationUri("/soapWS");
		definition.setPortTypeName("StateServicePort");
		definition.setTargetNamespace("http://soapwebapp.com/soap-web-app"); // same as endpoint
		
		return definition;
	}
	
}
