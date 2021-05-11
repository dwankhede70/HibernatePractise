package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Actor {
	@Id
private String name;
private String movie;
private String industry;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMovie() {
	return movie;
}
public void setMovie(String movie) {
	this.movie = movie;
}
public String getIndustry() {
	return industry;
}
public void setIndustry(String industry) {
	this.industry = industry;
}
@Override
public String toString() {
	return "Actor [name=" + name + ", movie=" + movie + ", industry=" + industry + "]";
}
	
}
