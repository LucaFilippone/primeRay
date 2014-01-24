package be.luca.liferay.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TestBean {
	
	private String hello="HELLO";
	
	@PostConstruct
	public void init(){
		hello="Hello from a CDI BEAN!";
	}

	public String getHello() {
		return hello;
	}

	public void setHello(String hello) {
		this.hello = hello;
	}
	
	

}
