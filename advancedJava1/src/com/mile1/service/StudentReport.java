package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

	public String findGrade(Student s) {
		int[] arr=new int[3];
		arr=s.getMarks();
		int sum=0;
		String str="";
		for(int i=0;i<arr.length;i++) {

			if(arr[i]<35) {
				str= "F";
				return str;
			}

			sum+=arr[i];
		}
		if(sum<=150)
			str="D";
		else if(sum>150 && sum<=200)
			str="C";
		else if(sum>200 && sum<=250)
			str="B";
		else
			str="A";

		return str;
	}

	public String validate(Student v) throws NullStudentException,NullNameException,NullMarksArrayException  {

		String str="";
		if(v==null)
		{
			NullStudentException nse=new NullStudentException();
			throw nse;
		}
		else {

			if(v.getName()==null) {
				NullNameException nne=new NullNameException();
				throw nne;
			}
			else if(v.getMarks()==null) {
				NullMarksArrayException nme=new NullMarksArrayException();
				throw nme;
			}
			else {
               str=findGrade(v);
			}
		}
		return str;
	}
}

