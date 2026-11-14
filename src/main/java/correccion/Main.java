package correccion;
import correccion.extensiones.DescuentoNormal;
import correccion.extensiones.DescuentoTerceraEdad;
import correccion.extensiones.DescuentoVIP;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication{

    @Inject 
    private PedidoService pedidoService;

    @Inject 
    private DescuentoNormal descuentoNormal;

    @Inject
    private DescuentoTerceraEdad descuentoTerceraEdad;

    @Inject
    private DescuentoVIP descuentoVIP;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }
    @Override
    public int run(String... args) throws Exception {
        
        Pedido pedido = new Pedido("P001", "Laptop", 1000.00);
        Pedido pedido2 = new Pedido("P002", "Mouse", 1000.00);
        Pedido pedido3 = new Pedido("P003", "Teclado", 1000.00);
        pedidoService.procesarPedido(pedido, descuentoNormal);
        pedidoService.procesarPedido(pedido2, descuentoVIP);
        pedidoService.procesarPedido(pedido3, descuentoTerceraEdad);
        
        System.out.println("Código proporcionado por el docente" );
        
        return 0;
    }

}
