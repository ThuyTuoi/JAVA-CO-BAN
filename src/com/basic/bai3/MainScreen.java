package com.basic.bai3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainScreen {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	String msg=" ";
	List<Student> student=new ArrayList<Student>();
	float totalGrade=0;
	while(true) {
		Student	st=new Student(null,null,null,null,0);
		System.out.println("Nhập thông tin học sinh: ");
		 st.NhapthongtinHS(sc);
		student.add(st);
		System.out.println("Do you want to continue (Y/N)");
		msg=sc.nextLine().trim();
		if(msg.equalsIgnoreCase("N")) break;		
	}
	int N=student.size();
	for(int i=0;i<N;i++) {		
		System.out.println("Student "+(i+1)+": ");
		System.out.println(" FullName: "+student.get(i).getfullName());
		System.out.println(" Address: "+student.get(i).getaddress());
		System.out.println(" DOB: "+student.get(i).getdob());
		System.out.println(" Gender: "+student.get(i).getgender());
		System.out.println(" FinalGrade: "+student.get(i).getfinalGrade());
	}
	for(int i=0;i<N;i++) {
		float t=student.get(i).getfinalGrade();
		String n=student.get(i).getfullName();
		if(t < 4.0){System.out.println("Học sinh "+n+" học lực kém");
		}else if(t>= 4.0 && t< 5) {System.out.println("Học sinh "+n+" học lực yếu");
		}else if(t>=5 && t < 5.5) {System.out.println("Học sinh "+n+" học lực trung bình yếu");
		}else if(t>=5.5 && t < 6.5) {System.out.println("Học sinh "+n+" học lực trung bình");
		}else if(t>=6.5 && t < 7.0) {System.out.println("Học sinh "+n+" học lực trung bình khá");
		}else if(t>=7.0 && t < 8.0) {System.out.println("Học sinh "+n+" học lực khá");
		}else if(t>=8.0 && t  < 8.5) {System.out.println("Học sinh "+n+" học lực khá giỏi");
		}else if(t>=8.5 && t <= 10)  {System.out.println("Học sinh "+n+" học lực giỏi");
		}
	}
	for(int i=0;i<N;i++) {
		float t=student.get(i).getfinalGrade();
		totalGrade+=t;
	}
	float Avg=(totalGrade/N);
	System.out.println("Điểm tổng kết trung bình của HS là: "+Avg);
 }
}

