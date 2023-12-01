
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mensajes extends Envio implements Interfaz {
	
	List<Mensajes> listaMensajes = new ArrayList<Mensajes>();
	
//	constructor
	public Mensajes(String remitente, String destinatario, String fecha, String mensaje) {
		super(idM++, remitente, destinatario, fecha);
		this.mensaje=mensaje;
	}
	
	public Mensajes() {};

//	atributos
	private String mensaje;
	private static int idM = 0;

//	métodos
	Scanner sc = new Scanner(System.in);


	public void enviarMensaje() {
		System.out.println("Remitente:");
		String remitente = sc.next();
		
		System.out.println("Destinatario:");
		String destinatario= sc.next();
		
		System.out.println("Fecha:");
		String fecha= sc.next();
		
		System.out.println("Mensaje:");
		String mensaje= sc.next();
		
		Mensajes nuevoMensaje = new Mensajes(remitente, destinatario, fecha, mensaje);
		
		listaMensajes.add(nuevoMensaje);
        System.out.println("Mensaje enviado correctamente");
	}
	
	public void obtener() {
		System.out.println("Indice:");
    	idBuscado = sc.nextInt();
    	if(idBuscado >= 0 && idBuscado < listaMensajes.size()) {
    		Mensajes mensajeEscogido = listaMensajes.get(idBuscado);
    		System.out.println(mensajeEscogido.mostrarInfo());
    	}
    	else {
    		System.out.println("El mensaje escogido no existe.");
    	}
	}
	
	public void obtenerTodos() {
		if(listaMensajes.isEmpty()) {
    		System.out.println("No existe ningún mensaje.");
    	} else {
        	for(Mensajes todosMensajes:listaMensajes) {
            	System.out.println(todosMensajes.mostrarInfo());
            }
    	}
	}
	
	public String mostrarInfo() {
		return String.format("Id: %d - Remitente: %s, destinatario: %s,fecha:  %s, mensaje: %s.", this.id, this.remitente, this.destinatario, this.fecha, this.mensaje);
	}

	@Override
	public void insertar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		
	}


	
}
