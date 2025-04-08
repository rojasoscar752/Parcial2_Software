package presentador;

import javax.swing.JOptionPane;

public class IoManager {
	public int readMenu() {
		String menu="------Sistema de Registro y Analisis de Sueños Lucidos------\n"+ 
				"1. Registrar paciente \n"+
				"2. Registrar sueño \n"+
				"3. Seleccionar enfoque terapeutico a utilizar\n"+
				"4. Generar informe del sueño analizado\n"+
				"5. Clonar sueño \n"+	
				"6. Salir\n" ;
		return this.readGraphicInt(menu);
	}
	public void showGraphicMessage(String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	public void showGraphicErrorMessage(String message) {
		JOptionPane.showMessageDialog(null, message,"",JOptionPane.ERROR_MESSAGE);
	}
	public boolean readGraphicBoolean(String message) {
		return Boolean.parseBoolean(this.readGraphicString(message));
	}
	public int readGraphicInt(String message) {
		return Integer.parseInt(this.readGraphicString(message));
	}
	public String readGraphicString(String message) {
		return JOptionPane.showInputDialog(message);
	}
	public double readGraphicDouble(String message) {
		return Double.parseDouble(this.readGraphicString(message));
	}
	public byte readGraphicByte(String message) {
		return Byte.parseByte(this.readGraphicString(message));
	}
	public float readGraphicFloat(String message) {
		return Float.parseFloat(this.readGraphicString(message));
	}
	public short readGraphicShort(String message) {
		return Short.parseShort(this.readGraphicString(message));
	}
}
