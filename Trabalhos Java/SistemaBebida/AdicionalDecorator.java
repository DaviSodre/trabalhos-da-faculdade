package ProjetoBebida;

public abstract class AdicionalDecorator implements Bebida {
	protected Bebida bebida;
	
	public AdicionalDecorator(Bebida bebida) {
		this.bebida = bebida;
	}
	
	public abstract String getDescricao();
	

}
