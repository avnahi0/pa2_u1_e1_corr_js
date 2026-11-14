package correccion;

import jakarta.inject.Singleton;

@Singleton 
public class NotificacionMailService {


    public void enviarNotificacion(String mensaje){

        System.out.println("Notificación: " + mensaje);

    }
}
