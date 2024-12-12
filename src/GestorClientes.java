import java.util.ArrayList;

public class GestorClientes {
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    Vista vista = new Vista();
    public void aniadirCliente(){
        Cliente cliente = new Cliente();
        listaClientes.add(cliente);
    }
    public void listarClientes(){
        for (Cliente cliente : listaClientes) {
            vista.mostrarMensaje(cliente.toString());
        }
    }
    public void eliminarCliente(Cliente cliente){
        for (Cliente ClientePuntero : listaClientes) {
            if (cliente.equals(ClientePuntero)){
                listaClientes.remove(ClientePuntero);
            }
        }
    }
    public void eliminarClientePorID(int idCliente) {
		
		for(Cliente c : listaClientes) {
			if(c.getId() == idCliente) listaClientes.remove(c);
		}
	}
}
