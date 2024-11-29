import java.util.Date;

public abstract class Tarea {
    protected String nombre;
    protected String prioridad;
    protected Date fechaVencimiento;
    protected String estado;

    public abstract void mostrarDetalles();
}
