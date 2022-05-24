import java.util.Scanner;

public class Main {

	
	
	public static void main(String args[]) {

		ListaPacientes lista = new ListaPacientes();

		lista.lista.add(new Paciente("1724831597", "ALEXIS", "VIZUETE", "22", "M", "06/01/2000", "JARDIN DEL VALLE", "0960071180", "B+"));
		lista.lista.add(new Paciente("1713074050", "ANAHI", "VASQUEZ", "21", "F", "19/01/2001", "QUICENTRO", "09600808081", "A+"));
		lista.lista.add(new Paciente("1006425311", "LEONARDO", "SALVADOR", "22", "M", "09/07/1999", "OTAVALO", "0987654321", "O+"));


		int menu = 0;

		String cedula = "";
		String nombres = "";
		String apellidos = "";
		String edad;
		String genero = "";
		String fecha = "";
		String direccion = "";
		String telefono = "";
		String tipoSangre = "";

		Scanner entrada = new Scanner (System.in);
		boolean validar, existe;


		do {
			System.out.println("--------------------------------------------------");
			System.out.println("SISTEMA CLINCA ODONTOLOGICA");
			System.out.println("--------------------------------------------------");	
			System.out.println("Menu");
			System.out.println("--------------------------------------------------");
			System.out.println("1. Crear Paciente");
			System.out.println("2. Consultar Paciente");
			System.out.println("3. Actualizar Direccion");
			System.out.println("4. Actualizar telefono");
			System.out.println("5. Imprimir lista de pacientes");
			System.out.println("6. Salir");
			System.out.println("--------------------------------------------------");
			
			System.out.print("Ingrese una opcion: ");
			menu = entrada.nextInt();
			entrada.nextLine();
			//Switch para controlar el menu
			switch(menu) {
			case 1:
				System.out.println("Ingrese datos del paciente:");
				// Cedula
				do{
					System.out.print("Ingrese numero de cedula del paciente: ");
					cedula = entrada.nextLine();
					existe = lista.existePaciente(cedula);
					validar=lista.paciente.validador.validarCedula(cedula);
					if(validar == false){
						System.out.println("La cedula ingresada es incorrecta, intente de nuevo.");
					} else if ( existe == true) {
						System.out.println("El paciente ya existe dentro del sistema, intente de nuevo.");
					}
				} while (validar == false || existe == true );
				// Nombres
				do{
					System.out.print("Ingrese nombres del paciente: ");
					nombres = entrada.nextLine();
					validar = lista.paciente.validador.validarNombresApellidos(nombres);
					if(validar == false){
						System.out.println("Los nombres ingresados son incorrectos, intente de nuevo.");
					}
				} while (validar == false);
				// Apellidos
				do{
					System.out.print("Ingrese apellidos del paciente: ");
					apellidos = entrada.nextLine();
					validar = lista.paciente.validador.validarNombresApellidos(apellidos);
					if(validar == false){
						System.out.println("Los apellidos ingresados son incorrectos, intente de nuevo.");
					}
				} while (validar == false);
				// Edad
				do{
					System.out.print("Ingrese la edad del paciente: ");
					edad = entrada.nextLine();
					validar = lista.paciente.validador.validarEdad(edad);
					if(validar == false){
						System.out.println("La edad ingresada es incorrecta, intente de nuevo.");
					}
				} while (validar == false);
				// Genero
				do{
					System.out.print("Ingrese el genero del paciente (M/F): ");
					genero = entrada.nextLine();
					validar = lista.paciente.validador.validarGenero(genero);
					if(validar == false){
						System.out.println("El genero ingresado es incorrecto, intente de nuevo.");
					}
				} while (validar == false);
				// Fecha de nacimiento
				do{
					System.out.print("Ingrese la fecha de nacimiento del paciente dd/mm/aaaa: ");
					fecha = entrada.nextLine();
					validar = lista.paciente.validador.validarFecha(fecha);
					if(validar == false){
						System.out.println("La fecha ingresada es incorrecta, intente de nuevo.");
					}
				} while (validar == false);
				// Direccion Domiciliaria
					System.out.print("Ingrese la direccion domiciliaria del paciente: ");
					direccion = entrada.nextLine();
				// Telefono
				do{
					System.out.print("Ingrese el telefono del paciente: ");
					telefono = entrada.nextLine();
					validar = lista.paciente.validador.validarTelefono(telefono);
					if(validar == false){
						System.out.println("El telefono ingresado es incorrecto, intente de nuevo.");
					}
				} while (validar == false);
				// Tipo de Sangre
				do{
					System.out.print("Ingrese el tipo de sangre del paciente: ");
					tipoSangre = entrada.nextLine();
					validar = lista.paciente.validador.validarTipoSangre(tipoSangre);
					if(validar == false){
						System.out.println("El tipo de sangre ingresado es incorrecto, intente de nuevo.");
					}
				} while (validar == false);

				//Anade paciente en la lista
				lista.lista.add(new Paciente(cedula, nombres, apellidos, edad, genero, fecha, direccion, telefono, tipoSangre));
				//imprimir la lista entera
				System.out.println(new Paciente(cedula, nombres, apellidos, edad, genero, fecha, direccion, telefono, tipoSangre).toString());

				break;

			case 2:
				//Cedula
				do{
					System.out.print("Ingrese numero de cedula del paciente: ");
					cedula = entrada.nextLine();
					validar = lista.paciente.validador.validarCedula(cedula);
					existe = lista.existePaciente(cedula);
					if(validar == false){
						System.out.println("La cedula ingresada es incorrecta, intente de nuevo.");
					} else if (existe == false) {
						System.out.println("El paciente no existe dentro del sistema, intente de nuevo.");
					}
				} while (validar == false || existe == false);

				System.out.println(lista.consultarPaciente(cedula));
				break;

			case 3:
				// Cedula
				do{
					System.out.print("Ingrese numero de cedula del paciente: ");
					cedula = entrada.nextLine();
					validar = lista.paciente.validador.validarCedula(cedula);
					existe = lista.existePaciente(cedula);

					if(validar == false){
						System.out.println("La cedula ingresada es incorrecta, intente de nuevo.");
					} else if (existe == false) {
						System.out.println("El paciente no existe dentro del sistema, intente de nuevo.");
					}
				} while (validar == false || existe == false );

				//Bucle para que el usuario ingrese una direccion
					System.out.print("Ingrese nueva direccion: ");
					direccion = entrada.nextLine();

				//Llamamos al metodo para cambiar la direccion
				System.out.println(lista.actualizarDireccion(cedula, direccion));
				break;
			case 4:
				// Cedula
				do{
					System.out.print("Ingrese numero de cedula del paciente: ");
					cedula = entrada.nextLine();
					validar = lista.paciente.validador.validarCedula(cedula);
					existe = lista.existePaciente(cedula);
					if(validar == false){
						System.out.println("La cedula ingresada es incorrecta, intente de nuevo.");
					} else if (existe == false) {
				System.out.println("El paciente no existe dentro del sistema, intente de nuevo.");
				}
				} while (validar == false || existe == false );

				//Bucle para que el usuario ingrese un telefono
				do{
					System.out.print("Ingrese el telefono del paciente: ");
					telefono = entrada.nextLine();
					validar = lista.paciente.validador.validarTelefono(telefono);
					if(validar == false){
						System.out.println("El telefono ingresado es incorrecto, intente de nuevo.");
					}
				} while (validar == false);

				System.out.println(lista.actualizarTelefono(cedula, telefono));
				break;
			case 5:
				System.out.print(lista.toString());
				break;
			case 6:
				System.out.print("Gracias por ingresar al Sistema");
				break;
			default:
				System.out.println("Opcion no valida / Vuelva a intentar");
			}
		}while(menu != 6);
		
	}
}
