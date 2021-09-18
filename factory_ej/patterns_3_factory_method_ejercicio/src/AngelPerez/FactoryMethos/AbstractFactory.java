package AngelPerez.FactoryMethos;

import org.formacion.factorymethod.Lavadora;

public abstract class AbstractFactory {
	protected Lavadora lavadora;
	public abstract Lavadora getLavadora();
}