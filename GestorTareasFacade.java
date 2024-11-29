import java.util.List;

public class GestorTareasFacade {
    public Tarea crearTarea(String tipo, String detalles) {
        return FabricaTareas.crearTarea(tipo, detalles);
    }

    public void visualizarTareas(EstrategiaVisualizacion estrategia, List<Tarea> tareas) {
        estrategia.mostrarTareas(tareas);
    }

    public void configurarNotificaciones(Observador observador) {
        CentroNotificaciones.getInstance().suscribir(observador);
    }
}

