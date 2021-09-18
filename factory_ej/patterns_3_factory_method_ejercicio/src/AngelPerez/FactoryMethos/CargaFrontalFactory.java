package AngelPerez.FactoryMethos;

import org.formacion.factorymethod.Lavadora;
import org.formacion.factorymethod.LavadoraCargaFrontal;

public class CargaFrontalFactory extends AbstractFactory{
	@Override
	public Lavadora getLavadora() {
		lavadora = new LavadoraCargaFrontal();
		return lavadora;
	}
}