public class ExercicioIRPF {

	public static void main(String[] args) {

		double salario = 6000;

		if (salario >= 1900 && salario <= 2800) {

			System.out.println("O imposto a ser pago ser� de: R$" + salario * 0.075 + ". E dedu��o de R$142.");
		} else if (salario >= 2800.01 && salario <= 3751) {

			System.out.println("O imposto a ser pago ser� de: R$" + salario * 0.15 + ". E dedu��o de R$350.");
		} else if (salario >= 3751.01 && salario <= 4664) {
			System.out.println("O imposto a ser pago ser� de: R$" + salario * 0.225 + ". E dedu��o de R$636.");

		} else {
			System.out.println("Seu sal�rio n�o est� dentro da base!");
		}
	}
}
