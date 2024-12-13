package Main;
import java.sql.Date;

public class Reserva {
    private int idReserva;
    private int IdHabitacion;
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaEntrada;
    private Date fechaSalida;
    private int total;
    
    public Reserva(int idReserva, int idHabitacion, int total) {
        this.idReserva = idReserva;
        this.IdHabitacion = idHabitacion;
        this.total = total;
    }
    public int getIdReserva() {
        return idReserva;
    }
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    public int getIdHabitacion() {
        return IdHabitacion;
    }
    public void setIdHabitacion(int idHabitacion) {
        IdHabitacion = idHabitacion;
    }
    public Habitacion getHabitacion() {
        return habitacion;
    }
    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Date getFechaEntrada() {
        return fechaEntrada;
    }
    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    public Date getFechaSalida() {
        return fechaSalida;
    }
    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    public int getTotal() {
        return total;
    }
    public void setTotal(int total) {
        this.total = total;
    }
    @Override
    public String toString() {
        return "Reserva [idReserva=" + idReserva + ", habitacion=" + habitacion + ", cliente=" + cliente
                + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", total=" + total + "]";
    }
    
}
