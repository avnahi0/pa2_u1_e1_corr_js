package correccion;

import correccion.extensiones.Descuento;
import correccion.interceptores.MedirTiempo;
import correccion.interceptores.Notificacion;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PedidoService {

    @MedirTiempo
    @Notificacion
    public void procesarPedido(Pedido pedido, Descuento descuento) {

        double totalFinal = descuento.calcularDescuento(pedido.getPrecio());
        System.out.println("Pedido: " + pedido.getCodigo() + " | Total: " + totalFinal);
    }

}
