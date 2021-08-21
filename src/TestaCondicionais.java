
public class TestaCondicionais {

	public static void main(String[] args) {

		System.out.println("Testando condicionais");

		int idade = 18;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você é de maior!");
			System.out.println("Seja bem vindo!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não é de maior, mas pode entrar " + "pois está acompanhado!");
			} else {
				System.out.println("Infelizmente você não pode entrar!");
			}
		}
	}
}
