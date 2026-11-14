package correccion.interceptores;

import correccion.NotificacionMailService;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Notificacion 
@Interceptor 
public class NotificacionInterceptor {

    @Inject 
    private NotificacionMailService notificacionMailService;

    @AroundInvoke 
    public Object Interceptar(InvocationContext context) throws Exception{

        Object resultado = context.proceed();
        this.notificacionMailService.enviarNotificacion("Se ha enviado la notificación por Mail" );

        return resultado;
    }
}
