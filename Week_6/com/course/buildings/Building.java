package com.course.buildings;

import java.util.*;

public class Building{
	double sqf;
	double story;
	
	public double getsqf(){
		return sqf;
	}
	public double getstory(){
		return story;
	}
	
	public void setsqf(double sqf){
		this.sqf = sqf;
	}
	public void setstory(double story){
		this.story = story;
	}
}
