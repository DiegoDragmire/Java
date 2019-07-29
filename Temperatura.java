package MyPrograms;

import javax.swing.JOptionPane;

/**
 * Esse programa converte temperatuas
 * 
 * @author Diego Nascimento <diego.dragmire@gmail.com>
 *
 */

public class Temperatura {

	public static void main(String[] args) {

		double temperatura = 0.0, fahrenheit = 0.0, celcius = 0.0;
		int opc, pergunta;
		String opcao, temp;
		final double AJUSTE = 32.0, FATOR = 5 / 9.0, FATOR2 = 1.8;
		
		do {
			opcao = JOptionPane.showInputDialog(
					"Você quer fazer qual tipo de conversão? 1- Fahrenheit para Celcius 2- Celcius para Farenheit. ");
			opc = Integer.parseInt(opcao);

			if (opc == 1) {
				JOptionPane.showMessageDialog(null, "Você escolheu converter de Fahrenheit para Celcius.");
				temp = JOptionPane.showInputDialog("Digite a temperatura em graus Fahrenheit.");
				temperatura = Double.parseDouble(temp);

				celcius = (temperatura - AJUSTE) * FATOR;

				JOptionPane.showMessageDialog(null, "Graus Celcius: " + celcius);

			} else if (opc == 2) {
				JOptionPane.showMessageDialog(null, "Você escolheu converter de Celcius para Fahrenheit.");
				temp = JOptionPane.showInputDialog("Digite a temperatura em graus Celcius.");
				temperatura = Double.parseDouble(temp);

				fahrenheit = (temperatura * FATOR2) + AJUSTE;
				JOptionPane.showMessageDialog(null, "Graus Fahrenheit: " + fahrenheit);
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}

			pergunta = JOptionPane.showConfirmDialog(null, "Deseja continuar usando este programa?", "Pergunta",
					JOptionPane.YES_NO_OPTION);

		} while (pergunta == JOptionPane.YES_OPTION);
	}

}
