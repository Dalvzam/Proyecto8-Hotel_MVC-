import java.util.ArrayList;

public class GestorHabitaciones {
    ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
    Vista vista = new Vista();
    public void aniadirHabitacion(){
        Habitacion habitacion = new Habitacion();
        listaHabitaciones.add(habitacion);
    }
    public void listarHabitaciones(){
        for (Habitacion habitacion : listaHabitaciones) {
            vista.mostrarMensaje(habitacion.toString());
        }
    }
    public void eliminarHabitacion(Habitacion habitacion){
        for (Habitacion habitacionPuntero : listaHabitaciones) {
            if (habitacion.equals(habitacionPuntero)){
                listaHabitaciones.remove(habitacionPuntero);
            }
        }
    }
}
