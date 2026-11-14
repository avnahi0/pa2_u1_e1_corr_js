package correccion.interceptores;

import correccion.Pedido;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor 
@MedirTiempo 
public class MedirTiempoInterceptor {

    @AroundInvoke 
    public Object Interceptar(InvocationContext context) throws Exception{

        Long inicio = System.currentTimeMillis();

        Object resultado = context.proceed();

        Long fin = System.currentTimeMillis() - inicio;

        Object[] valores = context.getParameters();
        Pedido pedido = (Pedido) valores[0];

         System.out.println("Duración: " + pedido.getCodigo() + " | MS: " + fin);

        return resultado;
    }

}
