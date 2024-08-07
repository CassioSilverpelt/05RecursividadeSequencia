package view;
import javax.swing.JOptionPane;

import controller.SequenciaController;

public class SequenciaPrincipal {
	public static void main (String[] args) {
		SequenciaController sequencia = new SequenciaController();
		float n;
		n = Float.parseFloat(JOptionPane.showInputDialog("Insira um número: "));
		System.out.println(sequencia.sequencia(n));
	}
}
