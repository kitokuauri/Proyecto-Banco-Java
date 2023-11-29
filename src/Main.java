import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gestores gestores = new Gestores();
		List<Gestores> listaGestores = new ArrayList<Gestores>();
		
		Clientes clientes = new Clientes();
		List<Clientes> listaClientes = new ArrayList<Clientes>();
		
		Mensajes mensajes = new Mensajes();
		List<Mensajes> listaMensajes = new ArrayList<Mensajes>();
		
		Transferencias transferencias = new Transferencias();
		List<Transferencias> listaTransferencias = new ArrayList<Transferencias>();
		
		Usuario usuario = new Usuario();
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
		
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
               listaGestores.add(gestores.insertarGestor());
               System.out.println("Gestor añadido correctamente");
                break;
            case 2: // Insercion varios gestores
            	for(int i=0;i<4;i++) {
                    listaGestores.add(gestores.insertarGestorAleatorio());
                	}
            	System.out.println("Gestores aleatorios añadidos correctamente");
                break;
            case 3: // Obtencion 1 gestor
            	System.out.println("Indice:");
            	int idBuscado = sc.nextInt();
            	if(idBuscado >= 0 && idBuscado < listaGestores.size()) {
            		Gestores gestorEscogido = listaGestores.get(idBuscado);
            		System.out.println(gestorEscogido.mostrarInfo());
            	}
            	else {
            		System.out.println("El gestor escogido no existe.");
            	}
                break;
            case 4: // Obtencion todos los gestores
                for(Gestores todosGestores:listaGestores) {
                	System.out.println(todosGestores.mostrarInfo());
                }
                break;
            case 5: // Actualizacion 1 gestor
            	System.out.println("Indice:");
            	idBuscado = sc.nextInt();
            	if(idBuscado >= 0 && idBuscado < listaGestores.size()) {
            		Gestores gestorEscogido02 = listaGestores.get(idBuscado);
            		System.out.println("Nombre:");
            		String nombre = sc.next();
            		gestorEscogido02.setNombre(nombre);
            		System.out.println("Apellido:");
            		String apellido= sc.next();
            		gestorEscogido02.setApellido(apellido);
            		System.out.println("Edad:");
            		int edad= sc.nextInt();
            		gestorEscogido02.setEdad(edad);
            		System.out.println("Email:");
            		String email= sc.next();
            		gestorEscogido02.setEmail(email);
            		System.out.println("Gestor actualizado correctamente.");
            	}
            	else {
            		System.out.println("El gestor escogido no existe.");
            	}
                break;
            case 6: // Eliminación 1 gestor
            	System.out.println("Indice:");
            	idBuscado = sc.nextInt();
            	if(idBuscado >= 0 && idBuscado < listaGestores.size()) {
            		Gestores gestorEscogido03 = listaGestores.get(idBuscado);
            		listaGestores.remove(gestorEscogido03);
                    System.out.println("Gestor eliminado correctamente.");
            	}
            	else {
            		System.out.println("El gestor escogido no existe.");
            	}
                break;
            case 7: // Insercion 1 cliente
            	listaClientes.add(clientes.insertarCliente());
                System.out.println("Cliente añadido correctamente");
                break;
            case 8: // Obtencion 1 cliente
            	System.out.println("Indice:");
            	idBuscado = sc.nextInt();
            	if(idBuscado >= 0 && idBuscado < listaClientes.size()) {
            		Clientes clienteEscogido = listaClientes.get(idBuscado);
            		System.out.println(clienteEscogido.mostrarInfo());
            	}
            	else {
            		System.out.println("El cliente escogido no existe.");
            	}
            	break;
            case 9: // Obtencion todos los clientes
            	  for(Clientes todosClientes:listaClientes) {
                  	System.out.println(todosClientes.mostrarInfo());
                  }
            	break;
            case 10: // Actualizacion 1 Cliente
            	System.out.println("Indice:");
            	idBuscado = sc.nextInt();
            	if(idBuscado >= 0 && idBuscado < listaClientes.size()) {
            		Clientes clienteEscogido02 = listaClientes.get(idBuscado);
            		System.out.println("Nombre:");
            		String nombreC = sc.next();
            		clienteEscogido02.setNombre(nombreC);
            		System.out.println("Apellido:");
            		String apellidoC= sc.next();
            		clienteEscogido02.setApellido(apellidoC);
            		System.out.println("Edad:");
            		int edadC= sc.nextInt();
            		clienteEscogido02.setEdad(edadC);
            		System.out.println("Email:");
            		String emailC= sc.next();
            		clienteEscogido02.setEmail(emailC);
            		System.out.println("Cliente actualizado correctamente.");
            	}
            	else {
            		System.out.println("El cliente escogido no existe.");
            	}
            	break;
            case 11: // Eliminación 1 Cliente
            	System.out.println("Indice:");
            	idBuscado = sc.nextInt();
            	if(idBuscado >= 0 && idBuscado < listaClientes.size()) {
            		Clientes clienteEscogido03 = listaClientes.get(idBuscado);
            		listaClientes.remove(clienteEscogido03);
                    System.out.println("Cliente eliminado correctamente.");
            	}
            	else {
            		System.out.println("El cliente escogido no existe.");
            	}
            	break;
            case 12: // Obtencion 1 mensaje
            	System.out.println("Indice:");
            	idBuscado = sc.nextInt();
            	if(idBuscado >= 0 && idBuscado < listaMensajes.size()) {
            		Mensajes mensajeEscogido = listaMensajes.get(idBuscado);
            		System.out.println(mensajeEscogido.mostrarInfo());
            	}
            	else {
            		System.out.println("El mensaje escogido no existe.");
            	}
            	break;
            case 13: // Obtencion todos los mensajes
            	for(Mensajes todosMensajes:listaMensajes) {
                	System.out.println(todosMensajes.mostrarInfo());
                }
            	break;
            case 14: // Envio 1 mensaje
                listaMensajes.add(mensajes.enviarMensaje());
                System.out.println("Mensaje enviado correctamente");
                break;
            case 15: // Obtencion 1 transferencia
            	System.out.println("Indice:");
            	idBuscado = sc.nextInt();
            	if(idBuscado >= 0 && idBuscado < listaTransferencias.size()) {
            		Transferencias transferenciaEscogida = listaTransferencias.get(idBuscado);
            		System.out.println(transferenciaEscogida.mostrarInfo());
            	}
            	else {
            		System.out.println("La transferencia escogida no existe.");
            	}
            	break;
            case 16: // Obtencion todas las transferencias
            	for(Transferencias todasTransferencias:listaTransferencias) {
                	System.out.println(todasTransferencias.mostrarInfo());
                }
            	break;
            case 17: // Envio 1 transferencia
            	listaTransferencias.add(transferencias.enviarTransferencia());
                System.out.println("Transferencia enviada correctamente");
            	break;
            case 18: // Login y Registro
            	System.out.println("¿Tiene cuenta en este banco? Y/N");
            	String respuesta = sc.next();
//            	LOGIN
            	if(respuesta.equals("y") || respuesta.equals("Y")){
            		System.out.println("Usuario:");
                	String nombre = sc.next();
                	System.out.println("Contraseña:");
                	String contraseña = sc.next();
                	
                	boolean presente = false;
                	
                	for(Usuario user : listaUsuarios) {
                		if((user.getNombre().equals(nombre)) && (user.getContraseña().equals(contraseña)) ) {
                			presente=true;
                			break;
                		}
                	}
                	if(presente) {
                		System.out.println("¡Inicio de sesión exitoso!");
                		System.out.println("Bienvenido " + nombre + ".");
                	} else {
                		System.out.println("Nombre de usuario o contraseña incorrectos.");
                	}
//              REGISTRO
            	} else if(respuesta.equals("n") || respuesta.equals("N")) {
            		listaUsuarios.add(usuario.registro());
	            	System.out.println("Registro realizado con exito.");
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
