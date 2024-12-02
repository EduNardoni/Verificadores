package br.com.cnpj.application;

import java.util.Scanner;

import br.com.cnpj.entities.Cnpj;

public class Program {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Cnpj cnpj;
		cnpj = new Cnpj();

		System.out.print("Informe o CNPJ: ");
		cnpj.dados = s.nextLine();

		String cnpjLimpo = cnpj.cnpjLimpo();
		cnpj.insereValores(cnpjLimpo);
		cnpj.novosValores01(12);
		cnpj.soma();
		
		
		cnpj.digito01 = cnpj.digito();

		cnpj.valores[12] = cnpj.digito01;
		
		cnpj.novosValores02(13);
		cnpj.soma();

		cnpj.digito02 = cnpj.digito();

		if (cnpj.digito01 == cnpj.valores[12] && cnpj.digito02 == cnpj.valores[13]) {
			System.out.printf(
					"O digito 01 do cnpj informado é: %d.\nO segundo digito é: %d.\nO cnpj informado foi: %s\nPortanto, o CNPJ é válido!",
					cnpj.digito01, cnpj.digito02, cnpj);
		} else {
			System.out.printf(
					"O digito 01 do cnpj informado é: %d.\nO segundo digito é: %d.\nO cnpj informado foi: %s\nPortanto, o CNPJ é inválido!",
					cnpj.digito01, cnpj.digito02, cnpj);
		}

		s.close();
	}
	
}
