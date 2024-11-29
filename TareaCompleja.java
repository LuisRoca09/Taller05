import java.util.ArrayList;
import java.util.List;

public class TareaCompleja extends Tarea {
    private List<String> subtareas;

    public TareaCompleja() {
        this.subtareas = new ArrayList<>();
    }

    public void agregarSubtarea(String subtarea) {
        subtareas.add(subtarea);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tarea Compleja con subtareas: " + subtareas);
    }
}
