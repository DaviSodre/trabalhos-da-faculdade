package SistemaPagamento;

public class Main {
	public static void main (String[] args) {
		SistemaAntigo sistemaAntigo = new SistemaAntigo();
		Pagamento pagamento = new PagamentoAdapter(sistemaAntigo);
			pagamento.pagar(100.50);
	}

}
