public class TareaSimple extends Tarea {
    private String descripcionCorta;

    public TareaSimple(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Tarea Simple: " + descripcionCorta);
    }
}

