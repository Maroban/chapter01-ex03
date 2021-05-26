package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("근무시간: ");
		int time = sc.nextInt();

		if (time < 0) {
			System.out.println("잘못된 값입니다.");
		} else if (time > 8) {
			System.out.println("임금은 " + (80000 + (time - 8) * 12000) + "원 입니다.");
		} else {
			System.out.println("임금은 " + (time * 10000) + "원 입니다.");
		}

		sc.close();

	}

}
