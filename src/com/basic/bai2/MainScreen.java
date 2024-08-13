package com.basic.bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainScreen {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tongchan = 0;
		int tongle = 0;
		int count = 0;
		System.out.println("Nhập số nguyên N= ");
		try {
			int N = sc.nextInt();
			if(N<=0) {
				throw new ArithmeticException("N phải lớn hơn 0");
			}else {
				for (int i = 0; i <= N; i++) {
					if (i % 2 == 0) {
						tongchan += i;
					}else {
						tongle += i;
					}
				}
				System.out.println("Tổng các số chẳn từ 0 đến " + N + " là: " + tongchan);
				System.out.println("Tổng các số lẻ từ 0 đến " + N + " là: " + tongle);
				for (int i = 0; i <= N; i++) {
					if (i % 3 == 0 && i % 2 != 0) {
						count++;
						}
					}
					System.out.println
					("Từ 0 đến " + N + " có tất cả " + count + " số chia hết cho 3 nhưng không chia hết cho 2.");
				}
		}catch(InputMismatchException e) {
			System.out.println("Lỗi: phải nhập giá trị số");
		}
		sc.close();
	}
}
