package exercicio_while;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("Digite dois números:");
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			if(x == y) break;
			
			if(x < y) {
				
				System.out.println("CRESCENTE!");
			}
			else {
				System.out.println("DECRESCENTE");
			}
			
			System.out.println("Digite outros dois números:");
		}
		
		scanner.close();
		System.out.println("Programa encerrado!");

	}

}
