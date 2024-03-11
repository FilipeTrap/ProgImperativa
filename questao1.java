package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question01 {

	public static double afim (int a, int b){
		

		return -(double) b / a; 
		//sofri pra desciobri que podia fazer isso
	}

	public static void main(final String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(afim(a, b));
		

	}

}