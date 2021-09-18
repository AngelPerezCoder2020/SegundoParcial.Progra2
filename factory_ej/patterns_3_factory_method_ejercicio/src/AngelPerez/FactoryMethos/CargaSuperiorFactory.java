package AngelPerez.FactoryMethos;
import org.formacion.factorymethod.Lavadora;
import org.formacion.factorymethod.LavadoraCargaSuperior;

public class CargaSuperiorFactory extends AbstractFactory{
	@Override
	public Lavadora getLavadora() {
		lavadora = new LavadoraCargaSuperior();
		return lavadora;
	}
}