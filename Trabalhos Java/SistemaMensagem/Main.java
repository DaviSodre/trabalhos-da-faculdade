package mensagens;

public class Main {
	public static void main(String[] args) {
		CanalEnvio email = new Email();
		CanalEnvio sms = new SMS();
		
		Mensagem msg1 = new MensagemSimples(email);
		msg1.enviarMensagem("Olá, tudo bem?");
		
		Mensagem msg2 = new MensagemUrgente(sms);
		msg2.enviarMensagem("Preciso falar com você agora");
	}

}
