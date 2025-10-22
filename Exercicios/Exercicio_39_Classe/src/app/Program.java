package app;

import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o numero");
		JOptionPane.showMessageDialog(null, "Você informou: " + valor);
	}

}
