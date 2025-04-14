package mensagens;

public class MensagemSimples extends Mensagem {
	public MensagemSimples(CanalEnvio canal) {
		super(canal);
	}
	
	@Override
	public void enviarMensagem(String texto) {
		canal.enviar("Mensagem Simples: " + texto);
	}

}
