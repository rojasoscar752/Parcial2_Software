package presentador;

import javax.swing.JOptionPane;

public class IoManager {
	public int readMenu() {
		String menu="------Sistema de Registro y Análisis de Sueños Lúcidos------\n"+ 
				"1. Registrar sueño \n"+
				"2. Aplicar analisis a sueño \n"+
				"3. Generar informe del sueño analizado\n"+
				"4. Experimentar a partir de tecnicas un sueño \n"+
				"5. Trabajar con múltiples sesiones activas\n"+
				"6. Seleccionar enfoque terapeutico a utilizar\n"+
				"7. Salir\n" ;
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
