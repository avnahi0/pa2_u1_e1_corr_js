package correccion.extensiones;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class DescuentoTerceraEdad implements Descuento{

    @Override
    public double calcularDescuento(double precio) {

        return precio * 0.8;
    }

}
