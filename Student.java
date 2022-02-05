package org.student;

import org.college.College;
import org.department.Department;

public class Student {
	public void studentName() {
		System.out.println("Student name is Saravanan");
	}

	public void studentDept() {
		System.out.println("My department is CSE");
	}

	public void studentId() {
		System.out.println("Student ID is 0710");
	}

	public static void main(String[] args) {
		College coll = new College();
		Department dept = new Department();
		Student stud = new Student();

		coll.collegeName();
		coll.collegeCode();
		coll.collegeRank();
		dept.deptName();
		stud.studentName();
		stud.studentId();
		stud.studentDept();

	}

}
