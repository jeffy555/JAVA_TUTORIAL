package Serializable;

import java.io.*;
import java.util.*;
public class Student implements Serializable {
	
	private String name;
	private double GPA;
	
	
	public Student(String name, double GPA)
	{
		this.name = name;
		this.GPA = GPA;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGPA() {
		return GPA;
	}
	public void setGPA(double gPA) {
		GPA = gPA;
	}

}
