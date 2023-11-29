import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Gestores gestores = new Gestores();
		List<Gestores> listaGestores = new ArrayList<Gestores>();
		
		for(int i=0;i<6;i++) {
            listaGestores.add(gestores.insertarGestorAleatorio());
		}
		
		int idBuscado = sc.nextInt();
    	Gestores gestorEscogido = listaGestores.get(idBuscado);
    	boolean foundObtenido = Arrays.asList(listaGestores).contains(gestorEscogido);
    	
    	System.out.println(!foundObtenido);
	}

}
