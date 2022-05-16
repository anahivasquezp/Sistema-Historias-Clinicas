import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String args[]) {
		Paciente paciente = new Paciente();
		int menu = 0;
		int opcion = 0;
		String respuesta = "";
		Scanner entrada = new Scanner (System.in);
		
		
		
		do {
			System.out.println("--------------------------------------------------");
			System.out.println("SISTEMA CLINCA INKS");

			System.out.println("--------------------------------------------------");	
			System.out.println("Menu");
			System.out.println("--------------------------------------------------");
			System.out.println("1. Crear Paciente");
			System.out.println("2. Consultar Paciente");
			System.out.println("3. Actualizar Direccion");
			System.out.println("4. Actualizar telefono");
			System.out.println("5. Salir");
			System.out.println("--------------------------------------------------");
			
			System.out.print("Ingrese una opcion: ");
			menu = entrada.nextInt();
			
			//Switch para controlar que va hacer dentro de paciente
			switch(menu) {
			case 1:
				paciente.crearPaciente();
				//paciente.anadirPaciente();
				break;
			case 2:
				paciente.consultarPaciente();
				break;
			case 3:
				paciente.actualizarDireccionDomiciliaria();
				break;
			case 4:
				paciente.actualizarTelefonoPaciente();
				break;
			case 5:
				System.out.print("Gracis por ingresar al Sistema");
				break;
			default:
				System.out.println("Opcion no valida / Vuelva a intentar");
			}
		}while(menu != 5);
		
	}
}
