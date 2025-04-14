package mensagens;

public class Email implements CanalEnvio {
	@Override
	public void enviar(String texto) {
		System.out.println("Enviando por Email: " + texto);
	}

}
