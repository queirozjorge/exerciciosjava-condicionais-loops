
public class TestaCondicionais {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voc� � de maior!");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Voc� n�o � de maior, mas pode entrar " + "pois est� acompanhado!");
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar!");
			}
		}
	}
}
