package lógica;

public class PedidoException extends Exception {
	private Pedido pedido;
	public PedidoException(String mensaje,Pedido pedido) {
		super(mensaje);
		this.pedido=pedido;
		// TODO Auto-generated constructor stub
	}
	public String getInfo() {
		return pedido.generarFactura();
	}
}
