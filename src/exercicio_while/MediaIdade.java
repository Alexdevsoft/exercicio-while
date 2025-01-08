package exercicio_while;

import java.util.Scanner;

public class MediaIdade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int idade;
        int somaIdades = 0;
        int contador = 0;

        System.out.println("Digite as idades:");

        while (true) {
            idade = scanner.nextInt();

            // Verifica se a idade é negativa
            if (idade < 0) {
                // Se for a primeira entrada, exibe mensagem de impossibilidade
                if (contador == 0) {
                    System.out.println("IMPOSSIVEL CALCULAR");
                } else {
                    // Se já houver entradas válidas, calcula e exibe a média
                    double media = (double) somaIdades / contador;
                    System.out.printf("MEDIA = %.2f\n", media);
                }
                break; // Sai do loop
            }

            // Soma as idades e incrementa o contador
            somaIdades += idade;
            contador++;
        }

        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
    }
		

}
