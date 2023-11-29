import java.util.Scanner;

public class Transferencias extends Envio {
	
//	constructor
	public Transferencias(String remitente, String destinatario, String fecha, int cantidad) {
		super(idT++, remitente, destinatario, fecha);
		this.cantidad=cantidad;
	}
	
	public Transferencias() {};

//	atributos
	private int cantidad;
	private static int idT = 0;

//	métodos
	Scanner sc = new Scanner(System.in);


	public Transferencias enviarTransferencia() {
		System.out.println("Remitente:");
		String remitente = sc.next();
		
		System.out.println("Destinatario:");
		String destinatario= sc.next();
		
		System.out.println("Fecha:");
		String fecha= sc.next();
		
		System.out.println("Cantidad:");
		int cantidad= sc.nextInt();
		
		return new Transferencias(remitente, destinatario, fecha, cantidad);	
	}
	
	public String mostrarInfo() {
		return String.format("Id: %d - Remitente: %s, destinatario: %s,fecha  %s, cantidad: %d.", this.id, this.remitente, this.destinatario, this.fecha, this.cantidad);
	}

	
}
