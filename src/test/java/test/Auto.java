package test;
public class Auto 
{
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for (Asiento asiento : asientos) {
			if (asiento != null) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	String verificarIntegridad() {
		for (Asiento asiento : asientos) {
			if (asiento.registro != registro) {
				return "Las piezas no son originales";
			}
		}
		if (motor.registro != this.registro) {
			return "Las piezas no son originales";
		}
		return "Auto original";
	}
	}