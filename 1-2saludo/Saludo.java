/*
 *  ejemplo de captura con joptionpane
 */

import javax.swing.JOptionPane;

public class Saludo {

	public static void main (String args[]) {		
		String nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre");
		JOptionPane.showMessageDialog(null,"Hola "+nombre);
	}
}
