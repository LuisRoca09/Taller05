public class FabricaTareas {
    public static Tarea crearTarea(String tipo, String detalles) {
        if ("simple".equalsIgnoreCase(tipo)) {
            return new TareaSimple(detalles);
        } else if ("compleja".equalsIgnoreCase(tipo)) {
            return new TareaCompleja();
        }
        return null;
    }
}
