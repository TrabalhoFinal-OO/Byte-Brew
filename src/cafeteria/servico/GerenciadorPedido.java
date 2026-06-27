package cafeteria.servico;

import cafeteria.modelo.Pedido;

public class GerenciadorPedido {

	public void processarfechamento(Pedido pedido) {
		
		if(pedido != null) {
			pedido.finalizarPedido();
			System.out.println("O pedido foi processado e finalizado.");
		}
	}
}
