import java.util.ArrayList;
import java.util.List;

public class CentroNotificaciones {
    private static CentroNotificaciones instancia;
    private final List<Observador> observadores;

    private CentroNotificaciones() {
        this.observadores = new ArrayList<>();
    }

    public static CentroNotificaciones getInstance() {
        if (instancia == null) {
            instancia = new CentroNotificaciones();
        }
        return instancia;
    }

    public void suscribir(Observador observador) {
        observadores.add(observador);
    }

    public void desuscribir(Observador observador) {
        observadores.remove(observador);
    }

    public void notificar(Tarea tarea) {
        for (Observador observador : observadores) {
            observador.actualizar(tarea);
        }
    }
}
