package Main;
import java.util.ArrayList;

public class GestorHabitaciones {
    public GestorHabitaciones(){

    }
    ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
    Vista vista = new Vista();
    public void aniadirHabitacion(int id, String tipo, float precioPorNoche){
        Habitacion habitacion = new Habitacion(id,tipo,precioPorNoche);
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
