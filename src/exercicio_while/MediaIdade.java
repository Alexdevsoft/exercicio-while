package exercicio_while;

import java.util.Scanner;

public class MediaIdade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int idade = 0;
		int somaIdade = 0;
		int contador = 0;

		System.out.println("Digite a idade:");

		while (true) {
			idade = scanner.nextInt();
			
			if(idade < 0) {
				
				if(idade == 0) {
				System.out.println("IMPOSSÍVEL CALCULAR!");
			}
				else {
					double media = (double) somaIdade / contador;
					
					System.out.printf("MÉDIA = %.2f\n", media);
				}
				break;
				
			}
			somaIdade += idade;
			contador++;
		}
	}

}
