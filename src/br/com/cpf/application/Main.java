package br.com.cpf.application;

import java.util.Scanner;

import br.com.cpf.entities.Cpf;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Cpf cpf;
		cpf = new Cpf();

		System.out.println("Informe o seu CPF:");
		cpf.dados = s.nextLine();

		String cpfLimpo = cpf.cpfLimpo();
		cpf.insereValores(cpfLimpo);
		cpf.novosValores(9);
		cpf.soma();

		cpf.digito01 = cpf.digito();

		cpf.valores[9] = cpf.digito01;

		cpf.novosValores(10);
		cpf.soma();

		cpf.digito02 = cpf.digito();

		

		if (cpf.digito01 == cpf.valores[9] && cpf.digito02 == cpf.valores[10]) {
			System.out.printf(
					"O digito 01 do cpf informado é: %d.\nO segundo digito é: %d.\nO cpf informado foi: %s\nPortanto, o CPF é válido!",
					cpf.digito01, cpf.digito02, cpf);
		} else {
			System.out.printf(
					"O digito 01 do cpf informado é: %d.\nO segundo digito é: %d.\nO cpf informado foi: %s\nPortanto, o CPF é inválido!",
					cpf.digito01, cpf.digito02, cpf);
		}

		s.close();

	}

}
