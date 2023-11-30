
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clientes extends Persona {
	List<Clientes> listaClientes = new ArrayList<Clientes>();
	
//	constructor
	public Clientes(String nombre, String apellido, int edad, String email) {
		super(idC++,nombre,apellido,edad,email);
	}
	
	public Clientes() {};
	
//	atributos
	private static int idC = 0;
	
//	métodos
	Scanner sc = new Scanner(System.in);

	public void insertarCliente() {
		System.out.println("Nombre:");
		nombre = sc.next();
		
		System.out.println("Apellido:");
		apellido= sc.next();
		
		System.out.println("Edad:");
		edad= sc.nextInt();
		
		System.out.println("Email:");
		email= sc.next();
		
		Clientes cliente = new Clientes(nombre, apellido, edad, email);	
		listaClientes.add(cliente);
        System.out.println("Cliente añadido correctamente");
	}
	
	public void obtenerCliente() {
		System.out.println("Indice:");
    	idBuscado = sc.nextInt();
    	if(idBuscado >= 0 && idBuscado < listaClientes.size()) {
    		Clientes clienteEscogido = listaClientes.get(idBuscado);
    		System.out.println(clienteEscogido.mostrarInfo());
    	}
    	else {
    		System.out.println("El cliente escogido no existe.");
    	}
	}
	
	public void obtenerTodosClientes() {
		if(listaClientes.isEmpty()) {
    		System.out.println("No existe ningún cliente.");
    	} else {
    	  for(Clientes todosClientes:listaClientes) {
          	System.out.println(todosClientes.mostrarInfo());
          }
    	}
	}
	
	public String mostratInfo() {
		return String.format("Id: %d - %s %s, %d años, correo: %s.", this.id, this.nombre, this.apellido, this.edad, this.email);
	}
	
	public void actualizarClientes() {
		System.out.println("Indice:");
    	idBuscado = sc.nextInt();
    	if(idBuscado >= 0 && idBuscado < listaClientes.size()) {
    		Clientes clienteEscogido02 = listaClientes.get(idBuscado);
    		System.out.println("Nombre:");
    		nombre = sc.next();
    		clienteEscogido02.setNombre(nombre);
    		
    		System.out.println("Apellido:");
    		apellido= sc.next();
    		clienteEscogido02.setApellido(apellido);
    		
    		System.out.println("Edad:");
    		edad= sc.nextInt();
    		clienteEscogido02.setEdad(edad);
    		
    		System.out.println("Email:");
    		email= sc.next();
    		clienteEscogido02.setEmail(email);
    		
    		System.out.println("Cliente actualizado correctamente.");
    	}
    	else {
    		System.out.println("El cliente escogido no existe.");
    	}
	}
	
	public void eliminarCliente() {
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
	}

}
