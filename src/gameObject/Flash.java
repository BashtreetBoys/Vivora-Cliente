package gameObject;

public class Flash implements Estado {

	@Override
	public void cambiarEstado(Vibora vibora) {
		vibora.setEstado(3);
	}

}
