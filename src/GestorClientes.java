import java.util.ArrayList;

public class GestorClientes {
    ArrayList<Cliente> listaClientes = new ArrayList<>();
    Vista vista = new Vista();
    private void aniadirCliente(){
        Cliente cliente = new Cliente();
        listaClientes.add(cliente);
    }
    private void listarClientes(){
        for (Cliente cliente : listaClientes) {
            vista.mostrarMensaje(cliente.toString());
        }
    }
    private void eliminarCliente(Cliente cliente){
        for (Cliente ClientePuntero : listaClientes) {
            if (cliente.equals(ClientePuntero)){
                listaClientes.remove(ClientePuntero);
            }
        }
    }
}
