package exercicio_while;

import java.util.Scanner;

public class SenhaFixa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int senha;
		System.out.print("Digite a senha: ");
		senha = scanner.nextInt();
		
		while(senha != 2002) {
			System.out.print("Senha inválida! Digite a senha: ");
			senha = scanner.nextInt();
		}
		System.out.println("Acesso permitido!");
		
		scanner.close();

	}

}
