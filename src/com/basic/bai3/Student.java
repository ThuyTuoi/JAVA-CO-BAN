package com.basic.bai3;
import java.util.Scanner;

public class Student {
	private String fullName;
	private String address;
	private String dob;
	private String gender;
	private float finalGrade;
	public Student(String fullName,String address,String dob,String gender,float finalGrade) {
		this.fullName=fullName;
		this.address=address;
		this.dob=dob;
		this.gender=gender;
		this.finalGrade=finalGrade;
	}
	public String getfullName() {
		return fullName;
	}
	public void setfullName(String fullName) {
		this.fullName=fullName;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address=address;
	}
	public String getdob() {
		return dob;
	}
	public void setdob(String dob) {
		this.dob=dob;
	}
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender=gender;
	}
	public float getfinalGrade() {
		return finalGrade;
	}
	public void setfinalGrade(float finalGrade) {
		this.finalGrade=finalGrade;
	}
	public void NhapthongtinHS(Scanner scanner) {
		System.out.println("Input FullName: ");
		fullName=scanner.nextLine();
		System.out.println("Input Address: ");
		address=scanner.nextLine();
		System.out.println("Input DOB (dd/mm/yy): ");
		dob=scanner.nextLine();
		System.out.println("Input Gender: ");
		gender=scanner.nextLine();
		System.out.println("Input finalGrade: ");
		finalGrade=Float.parseFloat(scanner.nextLine());
	}
}
