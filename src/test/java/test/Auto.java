package test;

public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos() {
		int cantidad = 0;
		for(int i = 0; i < asientos.length;i++) {
			if (asientos[i] instanceof Asiento) {
				cantidad++;
			}
		}
		return cantidad;
	}
	
	String verificarIntegridad() {
        for(int i = 0; i<asientos.length; i++){
            if(asientos[i] instanceof Asiento){
                if (asientos[i].registro != registro){
                    return "Las piezas no son originales";
	            }
            }
        }
        if (motor.registro != registro){
            return "las piezas no son originales";
        }
        return "Auto original";
    }