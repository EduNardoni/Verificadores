package br.com.cpf.entities;

public class Cpf {

	public String dados;
	public String cpfLimpo;
	public int[] valores;
	public int[] novosValores;
	public int soma;
	public int digito01;
	public int digito02;

	public Cpf() {

	}

	public String formataDados() {

		return dados.replaceAll("[^0-9]+", "");
	}

	public String cpfLimpo() {
		return formataDados();
	}

	public void insereValores(String cpfLimpo) {
		valores = new int[11];
		for (int i = 0; i < cpfLimpo.length(); i++) {
			valores[i] = Integer.parseInt(String.valueOf(cpfLimpo.charAt(i)));
		}
	}

	public void novosValores(int tamanho) {
		novosValores = new int[tamanho];
		for (int i = 0; i < tamanho; i++) {
			novosValores[i] = valores[i] * (tamanho + 1 - i);
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
		return (d > 9) ? 0 : d;
	}

	public String toString() {
		return formataDados();
	}
}
