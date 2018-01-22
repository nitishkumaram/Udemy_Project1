package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
	
	public static void main(String args[]){
		
		// Ask how many new students we want to add
		System.out.println("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int noOfStudents = in.nextInt();
		Student[] students = new Student[noOfStudents];
		
		//create n number of students
		
		for(int n=0; n<noOfStudents; n++){
			students[n]= new Student();
			students[n].enroll();
			students[n].viewBalance();
			students[n].payTuition();
			System.out.println(students[n].showInfo());
		}
		
	}

}
