import java.util.Scanner;

public class Mensajes extends Envio {
	
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


	public Mensajes enviarMensaje() {
		System.out.println("Remitente:");
		String remitente = sc.next();
		
		System.out.println("Destinatario:");
		String destinatario= sc.next();
		
		System.out.println("Fecha:");
		String fecha= sc.next();
		
		System.out.println("Mensaje:");
		String mensaje= sc.next();
		
		return new Mensajes(remitente, destinatario, fecha, mensaje);	
	}
	
	public String mostrarInfo() {
		return String.format("Id: %d - Remitente: %s, destinatario: %s,fecha  %s, mensaje: %s.", this.id, this.remitente, this.destinatario, this.fecha, this.mensaje);
	}


	
}
