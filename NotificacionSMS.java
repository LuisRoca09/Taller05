public class NotificacionSMS implements Observador {
    @Override
    public void actualizar(Tarea tarea) {
        System.out.println("Enviando notificación por SMS: " + tarea.toString());
    }
}
