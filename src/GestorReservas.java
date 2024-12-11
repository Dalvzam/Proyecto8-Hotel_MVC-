import java.util.ArrayList;

public class GestorReservas {
    ArrayList<Reserva> listaReservas = new ArrayList<>();
    Vista vista = new Vista();
    GestorClientes cliente = new GestorClientes();

    public void aniadirReserva(){
        Reserva reserva = new Reserva();
        listaReservas.add(reserva);
    }
    public void listarClientes(){
        for (Reserva reserva : listaReservas) {
            vista.mostrarMensaje(reserva.toString());
        }
    }
    public void buscarReservasClienteOHabitacion(){
        int respuesta = vista.leerEntero("Introduce 1 si quieres buscar por Clientes, 2 si es por Habitacion");
        switch(respuesta){
            case 1 -> busquedaPorCliente(vista.leerTexto("Introduce el nombre del cliente buscado: "));
            case 2 -> busquedaPorHabitacion();
            default -> vista.mostrarMensaje("Opción no válida");
        }

    }
    public void busquedaPorCliente(String nombreClienteBuscado){
        for (Cliente clientePuntero : cliente.listaClientes) {
            if (clientePuntero.getNombre().equals(nombreClienteBuscado)){
                for (Reserva reserva : listaReservas) {
                    if (clientePuntero.equals(reserva.getCliente())){
                        vista.mostrarMensaje(reserva.toString());
                    }else{
                        vista.mostrarMensaje("El cliente "+nombreClienteBuscado+" no tiene ninguna reserva");
                    }
                }
            }else{
                vista.mostrarMensaje("El cliente "+nombreClienteBuscado+" no ha sido encontrado");
            }
            
        }
    }
    public void busquedaPorHabitacion(){
        
    }
}
