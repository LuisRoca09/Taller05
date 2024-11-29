import java.util.List;

public class VistaLista implements EstrategiaVisualizacion {
    @Override
    public void mostrarTareas(List<Tarea> tareas) {
        System.out.println("Mostrando tareas en formato de lista:");
        for (Tarea tarea : tareas) {
            tarea.mostrarDetalles();
        }
    }
}

