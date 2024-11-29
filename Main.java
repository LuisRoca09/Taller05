import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorTareasFacade gestor = new GestorTareasFacade();

       
        Tarea tarea1 = gestor.crearTarea("simple", "Comprar leche");
        Tarea tarea2 = gestor.crearTarea("compleja", "Planificar proyecto");

    
        gestor.configurarNotificaciones(new NotificacionCorreo());

        
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(tarea1);
        tareas.add(tarea2);

        
        gestor.visualizarTareas(new VistaLista(), tareas);
    }
}
