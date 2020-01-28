package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

	public int findNumberOfNullMarks(Student data[]) {
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null && data[i].getMarks()==null)
				count++;

		}
		return count;
	}

	public int findNumberOfNullNames(Student data[]) {
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]!=null && data[i].getName()==null)
				count++;
		}
		return count;

	}

	public int findNumberOfNullobjects(Student data[]) {
		int count=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]==null)
				count++;
		}
		return count;	
	}
}
