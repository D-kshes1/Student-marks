package com.mile1.bean;
import java.util.*;

public class Student {
	private String name;
	private int marks[]=new int[3];

	public Student(){

	}

	public Student(String name,int marks[]) {
		this.name=name;
		this.marks=marks;
	}

	Scanner sc=new Scanner(System.in);

	public String getName() {
		return name;

	}

	public int[] getMarks() {
		return marks;
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setMarks(int marks[]) {
		this.marks=marks;
	}

}
