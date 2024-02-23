package com.ahamed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")  //Used for create object of very instance
public class Alien {
	
	private int aid;
	private String anmae;
	private String tech;
	@Autowired
	private Laptop laptop;
	
	
	public Alien() {
		System.out.println("Object created...");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAnmae() {
		return anmae;
	}
	public void setAnmae(String anmae) {
		this.anmae = anmae;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", anmae=" + anmae + ", tech=" + tech + "]";
	}
	
	public void complie() {
		System.out.println("compling");
		laptop.toString();
	}

}
