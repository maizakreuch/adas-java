package br.com.helloWorld;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Entrada de dados
		Scanner scan = new Scanner(System.in);
		
		
		// Declarando variáveis
		String nome = "Guilherme";
		Integer codigo = 7;
		Boolean status = false;
		int codigoSetor = 3;
		int meses = 5;
		double salario = 0.0;
		
		
		// Atribuindo valores de forma dinâmica com Entrada de dados
		System.out.print("Digite o nome do usuário: ");
		nome = scan.next();
		
		System.out.print("Digite o código do usuário: ");
		codigo = scan.nextInt();
		
		System.out.print("Digite o código do setor: ");
		codigoSetor = scan.nextInt();
		
		System.out.println("Digite o salário do usuário: ");
		salario = scan.nextDouble();
		
		
		// Saída de dados
		// Atalho: syso + Ctrl + Barra de espaço
		System.out.println("Codigo: " + codigo);
		System.out.println("Nome: " + nome);
		
		
		// Estrutura condicional IF
		if (status) {
			System.out.println("Cadastro Ativo!");
		} else {
			System.out.println("Cadastro Inativo!");
		}
		
		
		// Estutura condicional SWITCH...CASE
		switch(codigoSetor) {
			case 1: 
				System.out.println("Setor: Tecnologia");
				break;
			case 2:
				System.out.println("Setor: Compras");
				break;
			case 3:
				System.out.println("Setor: Desenvolvimento");
				break;
			default:
				System.out.println("Setor não encontrado!");
		}
		
		
		// Estrutura de repedição FOR
		System.out.println("*** Extrato de pagamento ***");
		for (int cont = 1; cont <= meses; cont++) {
			System.out.println("Mês[" + cont + "]: Salário - R$" + salario);
		}

	}

}














