
public class TestaEscopo {

	public static void main(String[] args) {
		System.out.println("Testando escopo!");
		
		int idade = 16;
		int quantidadePessoas = 3;
		boolean acompanhado;
		
		if (quantidadePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}
		
		if (idade >= 18 || acompanhado) {
			System.out.println("Voc� pode entrar!");
		} else {
			System.out.println("infelizmente voc� n�o pode entrar!");
		}
	}
}
