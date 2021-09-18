package org.formacion.decorator;

import java.util.List;

public class LoggerDecorator implements BaseDatos {	
	private Logger logger;
	private BaseDatos basedatos;
	
	public LoggerDecorator(Logger logger, BaseDatos basedatos) {
		this.logger=logger;
		this.basedatos = basedatos;
	}
	@Override
	public void inserta(String registro) {
		logger.add("inserta "+ registro);
		basedatos.inserta(registro);
	}

	@Override
	public List<String> registros() {
		logger.add("lectura");
		return basedatos.registros();
	}
}