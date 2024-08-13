package com.basic.bai1;

import java.util.Scanner;

public class MyMainClass {
	public static void main(String[] args) {
		String action;
		double x = 0, y=0;
		boolean condition=true;
		Scanner sc = new Scanner(System.in);
		if (condition) {
			try {
				System.out.println("Nhập số thứ nhất x =");
				x = Double.parseDouble(sc.nextLine());
			}catch (Exception e) {
				condition=false;
				System.out.println("Lỗi: giá trị x phải là 1 số");
			}
		}
		if (condition){
			try{
				System.out.println("Nhập số thứ hai y =");
				y = Double.parseDouble(sc.nextLine());
			} catch (Exception e){
				condition=false;
				System.out.println("Lỗi: giá trị y phải là 1 số");
			}
		}
		if (condition) {
			System.out.println("Nhập lệnh ACTION (CONG/TRU/NHAN/CHIA)= ");
			action = sc.nextLine().trim();
			if (action.equalsIgnoreCase("CONG")) {
				double result = CalculateUtils.tinhCong(x, y);
				System.out.println("Kết quả là: "+result);
			}else if (action.equalsIgnoreCase("TRU")) {
				double result = CalculateUtils.tinhTru(x, y);
				System.out.println("Kết quả là: "+result);
			}else if (action.equalsIgnoreCase("NHAN")) {
				double result = CalculateUtils.tinhNhan(x, y);
				System.out.println("Kết quả là: "+result);
			}else if (action.equalsIgnoreCase("CHIA")) {
				double result = CalculateUtils.tinhChia(x, y);
				System.out.println("Kết quả là: "+result);
			}else{
				System.out.println("Giá trị ACTION không hợp lệ");
			}
		}
		sc.close();
	}
}
