package br.com.cnpj.entities;

public class Cnpj {

	public String dados;
	public String cnpjLimpo;
	public int[] valores;
	public int[] novosValores;
	public int soma;
	public int digito01;
	public int digito02;
	
	

	public Cnpj() {

	}

	public String formataDados() {
		return dados.replaceAll("[^0-9]+", "");
	}

	public String cnpjLimpo() {
		return formataDados();
	}

	public void insereValores(String cnpjLimpo) {
		valores = new int[14];
		for (int i = 0; i < cnpjLimpo.length(); i++) {
			valores[i] = Integer.parseInt(String.valueOf(cnpjLimpo.charAt(i)));
		}
	}

	public int[] verificador01 = new int[] { 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };
	public int[] verificador02 = new int[] {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2 };

	public void novosValores01(int tamanho) {
		novosValores = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			novosValores[i] = valores[i] * verificador01[i];
		}
	}
	public void novosValores02(int tamanho) {
		novosValores = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			novosValores[i] = valores[i] * verificador02[i];
		}
	}

	public void soma() {
		soma = 0;
		for (int i = 0; i < novosValores.length; i++) {
			soma += novosValores[i];
		}
	}

	public int digito() {
		int d = 11 - (soma % 11);
		return (d >= 10) ? 0 : d;
	}

	public String toString() {
		return formataDados();
	}
	
}
