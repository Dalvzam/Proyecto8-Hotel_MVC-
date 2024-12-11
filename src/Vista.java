import java.util.Scanner;

public class Vista {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String string){
        System.out.println(string);
    }
    public String leerTexto(String mensaje) {
        scanner.nextLine();
        System.out.print(mensaje);
        return scanner.nextLine();
    }
    public int leerEntero(String mensaje){
        scanner.nextLine();
        System.out.print(mensaje);
        return scanner.nextInt();
    }
    
}
