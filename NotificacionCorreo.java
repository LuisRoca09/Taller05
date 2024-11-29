public class NotificacionCorreo implements Observador {
    @Override
    public void actualizar(Tarea tarea) {
        System.out.println("Enviando notificación por correo: " + tarea.toString());
    }
}

    