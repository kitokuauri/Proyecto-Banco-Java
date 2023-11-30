import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gestores gestores = new Gestores();
		Clientes clientes = new Clientes();
		Mensajes mensajes = new Mensajes();
		Transferencias transferencias = new Transferencias();
		Usuario usuario = new Usuario();
		
		Scanner sc = new Scanner(System.in);
		
		int numero = 1;
		
		while(numero != 0) {
			
			System.out.println("~~ MENÚ ~~");
			System.out.println("1. Inserción de un gestor.");
			System.out.println("2. Inserción masiva de gestores con datos aleatorios.");
			System.out.println("3. Obtención de un gestor.");
			System.out.println("4. Obtención de todos los gestores.");
			System.out.println("5. Actualización de un gestor.");
			System.out.println("6. Eliminación de un gestor.");
			System.out.println("7. Inserción de un cliente.");
			System.out.println("8. Obtención de un cliente.");
			System.out.println("9. Obtención de todos los clientes.");
			System.out.println("10. Actualización de un cliente.");
			System.out.println("11. Eliminación de un cliente.");
			System.out.println("12. Obtención de un mensaje.");
			System.out.println("13. Obtención de todos los mensajes.");
			System.out.println("14. Envío de un mensaje.");
			System.out.println("15. Obtención de una transferencia.");
			System.out.println("16. Obtención de todas las trasferencias");
			System.out.println("17. Envío de una transferencia.");
			System.out.println("18. Login y registro.");
			System.out.println("0. Finalizar");
			System.out.println("~ ~ ~ ~ ~ ~");
			
		numero = sc.nextInt();
            
            switch (numero){
            case 1: // Insercion 1 gestor
            	gestores.insertarGestor();
                break;
            case 2: // Insercion varios gestores
            	gestores.insertarVariosGestoresAl();
                break;
            case 3: // Obtencion 1 gestor
            	gestores.obtenerGestor();
                break;
            case 4: // Obtencion todos los gestores
            	gestores.obtenerTodosGestores();
                break;
            case 5: // Actualizacion 1 gestor
            	gestores.actualizarGestor();
                break;
            case 6: // Eliminación 1 gestor
            	gestores.eliminarGestor();
                break;
            case 7: // Insercion 1 cliente
            	clientes.insertarCliente();
                break;
            case 8: // Obtencion 1 cliente
            	clientes.obtenerCliente();
            	break;
            case 9: // Obtencion todos los clientes
            	clientes.obtenerTodosClientes();
            	break;
            case 10: // Actualizacion 1 Cliente
            	clientes.actualizarClientes();
            	break;
            case 11: // Eliminación 1 Cliente
            	clientes.eliminarCliente();
            	break;
            case 12: // Obtencion 1 mensaje
            	mensajes.obtenerMensaje();
            	break;
            case 13: // Obtencion todos los mensajes
            	mensajes.obtenerTodosMensajes();
            	break;
            case 14: // Envio 1 mensaje
            	mensajes.enviarMensaje();
                break;
            case 15: // Obtencion 1 transferencia
            	transferencias.obtenerTransferencia();
            	break;
            case 16: // Obtencion todas las transferencias
            	transferencias.obtenerTodasTransferencias();
            	break;
            case 17: // Envio 1 transferencia
            	transferencias.enviarTransferencia();
            	break;
            case 18: // Login y Registro
            	System.out.println("¿Tiene cuenta en este banco? Y/N");
            	String respuesta = sc.next();
//            	LOGIN
            	if(respuesta.equals("y") || respuesta.equals("Y")){
            		usuario.login();
//              REGISTRO
            	} else if(respuesta.equals("n") || respuesta.equals("N")) {
            		usuario.registro();
                } else {
                	System.out.println("Respuesta inválida.");
            	}
            	break;
            case 0:
            	break;
            default:
            	System.out.println("Por favor, introduce un número válido.");	
            }
       
		} sc.close();
		
		System.out.println("Programa finalizado. ¡Hasta la vista!");
		
	}
	

}
