package test;
public class Asiento {
	String color;
	int precio;
	int registro;
	
	void camabiaColor(String color) {
		if (color == "verde" || color == "amarillo" || color == "blanco" || color == "negro" || color == "rojo") {
			this.color = color;
		}
	}
}
