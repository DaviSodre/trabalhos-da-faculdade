package mensagens;

public class SMS implements CanalEnvio {
	@Override
	public void enviar(String texto) {
		System.out.println("Enviando por SMS: " + texto);
	}

}
