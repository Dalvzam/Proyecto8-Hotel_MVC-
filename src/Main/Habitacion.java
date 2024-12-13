package Main;
public class Habitacion {
    private int id;
    private String tipo;
    private float precioPorNoche;
    
    public Habitacion(int id, String tipo, float precioPorNoche){
        this.id = id;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getPrecioPorNoche() {
        return precioPorNoche;
    }
    public void setPrecioPorNoche(float precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }
    @Override
    public String toString() {
        return "Habitacion [id=" + id + ", tipo=" + tipo + ", precioPorNoche=" + precioPorNoche + "]";
    }
    
}
