import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Paciente {
	public String numeroCedula = "";
	public String nombres = "";
	public String apellidos = "";
	public String edad = "";
	public String genero = "";
	public String fechaNacimiento = "";
	public String direccionDomiciliaria = "";
	public String telefonoPaciente = "";
	public String tipoSangre = "";

	Paciente paciente;
	static ArrayList<Paciente> listaPacientes = new ArrayList();
	Scanner entrada = new Scanner(System.in);

	public Paciente() {
		super();
	}

	// METODO CREAR PACIENTE
	public void crearPaciente() {
		paciente = new Paciente();

		System.out.println("Ingrese datos del paciente: ");
		// Cedula
		System.out.print("Ingrese numero de cedula del paciente: ");
		this.numeroCedula = entrada.nextLine();
		if (validarCedula(this.numeroCedula) && esValida(this.numeroCedula)) {
			paciente.setNumeroCedula(numeroCedula);
			// Nombres
			System.out.print("Ingrese nombres del paciente: ");
			this.nombres = entrada.nextLine();
			if (validarNombresApellidos(nombres)) {
				paciente.setNombres(nombres);
				// Apellidos
				System.out.print("Ingrese apellidos del paciente: ");
				this.apellidos = entrada.nextLine();
				if (validarNombresApellidos(apellidos)) {
					paciente.setApellidos(apellidos);
					// Edad
					System.out.print("Ingrese edad del paciente: ");
					this.edad = entrada.nextLine();
					if (validarEdad(edad)) {
						paciente.setEdad(edad);
						// Genero
						System.out.print("Ingrese genero M/F del paciente: ");
						this.genero = entrada.nextLine();
						if (validarGenero(genero)) {
							paciente.setGenero(genero);
							// Fecha de nacimiento
							System.out.print("Ingrese fecha de nacimiento dd/mm/aaaa del paciente: ");
							this.fechaNacimiento = entrada.nextLine();
							if (validarFecha(fechaNacimiento)) {
								paciente.setFechaNacimiento(fechaNacimiento);
								// Direccion Domiciliaria
								System.out.print("Ingrese direccion domiciliaria del paciente: ");
								this.direccionDomiciliaria = entrada.nextLine();
								if (validarDireccion(direccionDomiciliaria)) {
									paciente.setDireccionDomiciliaria(direccionDomiciliaria);
									// Telefono
									System.out.print("Ingrese telefono del paciente del paciente: ");
									this.telefonoPaciente = entrada.nextLine();
									if (validarTelefono(telefonoPaciente)) {
										paciente.setTelefonoPaciente(telefonoPaciente);
										// Tipo de Sangre
										System.out.print("Ingrese tipo de sangre del paciente: ");
										this.tipoSangre = entrada.nextLine();
										if (validarTipoSangre(tipoSangre)) {
											paciente.setTipoSangre(tipoSangre);
											System.out.println("Paciente creado con exito");
											listaPacientes.add(paciente);
										}else {
											System.out.println("El tipo de sangre ingresado no es valido");
										}
									} else {
										System.out.println("El telefono ingresado no es valido");
									}
								} else {
									System.out.println("La direccion ingresada no es valida");
								}
							} else {
								System.out.println("La fecha de nacimiento ingresada no es valida");
							}
						} else {
							System.out.println("El genero ingresado no es valido");
						}
					} else {
						System.out.println("La edad ingresada no es valida");
					}
				} else {
					System.out.println("La apellido ingresado no es valido");
				}
			} else {
				System.out.println("El nombre ingresado no es valido");
			}
		} else {
			System.out.println("La cedula ingresada no es valida");
		}
	}

	public void consultarPaciente() {
		String informacion = " ";

		System.out.print("Ingrese cedula: ");
		String cedula = entrada.nextLine();
		if (validarCedula(this.numeroCedula) && esValida(this.numeroCedula)) {
			for (int i = 0; i < listaPacientes.size(); i++) {
				if ((listaPacientes.get(i).getNumeroCedula()).equals(cedula)) {
					informacion = listaPacientes.get(i).toString() + "\n";
				} else {
					informacion = "No se encontro el paciente";
				}
			}
			System.out.print(informacion);
		} else {
			System.out.println("La cedula ingresada no es valida"+ "\n");
		}
	}

	public void actualizarDireccionDomiciliaria() {
		String informacion = " ";

		System.out.print("Ingrese cedula: ");
		String cedula = entrada.nextLine();
		if (validarCedula(this.numeroCedula) && esValida(this.numeroCedula)) {
			System.out.print("Ingrese nueva direccion: ");
			String nuevaDireccion = entrada.nextLine();
			if (validarDireccion(nuevaDireccion)) {
				for (int i = 0; i < listaPacientes.size(); i++) {
					if ((listaPacientes.get(i).getNumeroCedula()).equals(cedula)) {
						listaPacientes.get(i).setDireccionDomiciliaria(nuevaDireccion);
						informacion = listaPacientes.get(i).toString() + "\n";
						System.out.println("Direccion actualizada con exito"+ "\n");
					} else {
						informacion = "No se encontro el paciente"+ "\n";
					}
				}
				System.out.print(informacion);
			} else {
				System.out.println("La direccion ingresada no es valido"+ "\n");
			}
		} else {
			System.out.println("La cedula ingresada no es valida"+ "\n");
		}
	}

	public void actualizarTelefonoPaciente() {
		String informacion = " ";

		System.out.print("Ingrese cedula: ");
		String cedula = entrada.nextLine();
		if (validarCedula(this.numeroCedula) && esValida(this.numeroCedula)) {
			System.out.print("Ingrese telefono: ");
			String telefono = entrada.nextLine();
			if (validarTelefono(telefono)) {
				for (int i = 0; i < listaPacientes.size(); i++) {
					if ((listaPacientes.get(i).getNumeroCedula()).equals(cedula)) {
						listaPacientes.get(i).setTelefonoPaciente(telefono);
						informacion = listaPacientes.get(i).toString() + "\n";
						System.out.println("Telefono actualizado con exito"+ "\n");
					} else {
						informacion = "No se encontro el paciente"+ "\n";
					}
				}
				System.out.print(informacion);
			} else {
				System.out.println("El telefono ingresado no es valido"+ "\n");
			}
		} else {
			System.out.println("La cedula ingresada no es valida"+ "\n");
		}
	}


	// Metodos sets and gets
	public String getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccionDomiciliaria() {
		return direccionDomiciliaria;
	}

	public void setDireccionDomiciliaria(String direccionDomiciliaria) {
		this.direccionDomiciliaria = direccionDomiciliaria;
	}

	public String getTelefonoPaciente() {
		return telefonoPaciente;
	}

	public void setTelefonoPaciente(String telefonoPaciente) {
		this.telefonoPaciente = telefonoPaciente;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Informacion: " + numeroCedula + "  " + nombres + "  " + apellidos + "  " + edad + "  " + genero + "  "
				+ fechaNacimiento + "  " + direccionDomiciliaria + "  " + telefonoPaciente + "  " + tipoSangre;
	}

	// ------------------------------------------------------------------------------------------------------------------
	// VALIDACIONES

	public static boolean validarCedula(String cedula) {
		return cedula.matches("[0-9]{10}");
	}

	public boolean esValida(String cedulaNumero) {
		int total = 0;
		int duplicado;
		String nuevaCedula[];
		nuevaCedula = cedulaNumero.split("");
		for (int i = 0; i < nuevaCedula.length - 1; i++) {
			if (i % 2 == 0) {
				duplicado = Integer.parseInt(nuevaCedula[i]) * 2;
				if (duplicado > 9) {
					duplicado -= 9;
					total += duplicado;
				} else {
					total += duplicado;
				}
			} else {
				total += Integer.parseInt(nuevaCedula[i]);
			}
		}
		int decenaSuperior = total + (10 - (total % 10));
		int digitoFinal = decenaSuperior - total, digitoVerificador = Integer.parseInt(nuevaCedula[9]);
		return digitoVerificador == digitoFinal;
	}

	public static boolean validarNombresApellidos(String nombres) {
		return nombres.matches("[A-Za-z\\s]*");
	}

	public static boolean validarEdad(String edad) {
		return edad.matches("[0-9]*");
	}

	public static boolean validarGenero(String genero) {
		return genero.matches("[M|F]");
	}

	public static boolean validarFecha(String fecha) {
		return fecha.matches("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})");
	}

	public static boolean validarDireccion(String direccion) {
		return direccion.matches("[A-Za-z\\s]*");
	}

	public static boolean validarTelefono(String telefono) {
		return telefono.matches("[0-9]{10}");
	}

	public static boolean validarTipoSangre(String sangre) {
		return sangre.matches("[A|B|AB|O]+[\\+|\\-]{1,1}");
	}

}
