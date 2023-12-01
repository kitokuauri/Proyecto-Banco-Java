
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transferencias extends Envio implements Interfaz{
	
	List<Transferencias> listaTransferencias = new ArrayList<Transferencias>();
	
//	constructor
	public Transferencias(String remitente, String destinatario, String fecha, double cantidad) {
		super(idT++, remitente, destinatario, fecha);
		this.cantidad=cantidad;
	}
	
	public Transferencias() {};

//	atributos
	private double cantidad;
	private static int idT = 0;

//	métodos
	Scanner sc = new Scanner(System.in);


	public void enviarTransferencia() {
		System.out.println("Remitente:");
		remitente = sc.next();
		
		System.out.println("Destinatario:");
		destinatario= sc.next();
		
		System.out.println("Fecha:");
		fecha= sc.next();
		
		System.out.println("Cantidad:");
		cantidad= sc.nextDouble();
		
		Transferencias transferencia = new Transferencias(remitente, destinatario, fecha, cantidad);	
		
		listaTransferencias.add(transferencia);
        System.out.println("Transferencia enviada correctamente");
	}
	
	public void obtener() {
		System.out.println("Indice:");
    	idBuscado = sc.nextInt();
    	if(idBuscado >= 0 && idBuscado < listaTransferencias.size()) {
    		Transferencias transferenciaEscogida = listaTransferencias.get(idBuscado);
    		System.out.println(transferenciaEscogida.mostrarInfo());
    	}
    	else {
    		System.out.println("La transferencia escogida no existe.");
    	}
	}
	
	public void obtenerTodos() {
		if(listaTransferencias.isEmpty()) {
    	} else {
        	for(Transferencias todasTransferencias:listaTransferencias) {
            	System.out.println(todasTransferencias.mostrarInfo());
            }
    	}
	}
	
	public String mostrarInfo() {
		return String.format("Id: %d - Remitente: %s, destinatario: %s,fecha:  %s, cantidad: %f%n€.", this.id, this.remitente, this.destinatario, this.fecha, this.cantidad);
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
