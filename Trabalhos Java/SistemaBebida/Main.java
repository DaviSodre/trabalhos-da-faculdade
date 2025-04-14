package ProjetoBebida;

public class Main {
	public static void main(String[] args) {
		Bebida bebida = new Cafe();
		
		bebida = new Leite(bebida);
		
		bebida = new Chocolate(bebida);
		
		System.out.println(bebida.getDescricao());
		System.out.println("Preço: R$" + bebida.getPreco());
		
	}

}
