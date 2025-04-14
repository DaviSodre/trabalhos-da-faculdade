package mensagens;

public abstract class Mensagem {
	protected CanalEnvio canal;
	
	public Mensagem(CanalEnvio canal) {
		this.canal = canal;
	}
	
	public abstract void enviarMensagem(String texto);

}
