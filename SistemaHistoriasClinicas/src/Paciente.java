import java.util.Scanner;

public class Paciente {
	public String numeroCedula = "";
	public String nombres = "";
	public String apellidos = "";
	public String edad;
	public String genero = "";
	public String fechaNacimiento = "";
	public String direccionDomiciliaria = "";
	public String telefonoPaciente = "";
	public String tipoSangre = "";

	ValidacionDatos validador = new ValidacionDatos();

	Scanner entrada = new Scanner(System.in);

	public Paciente() {

		super();
	}


	public Paciente(String cedula, String nombres, String apellidos, String edad, String genero, String fecha, String direccion, String telefonoPaciente, String tipoSangre) {
		this.numeroCedula = cedula;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.genero = genero;
		this.fechaNacimiento = fecha;
		this.direccionDomiciliaria = direccion;
		this.telefonoPaciente = telefonoPaciente;
		this.tipoSangre = tipoSangre;
	}

	// Metodos sets and gets
	public String getNumeroCedula() {

		return numeroCedula;
	}

	public void setDireccionDomiciliaria(String direccionDomiciliaria) {

		this.direccionDomiciliaria = direccionDomiciliaria;
	}

	public void setTelefonoPaciente(String telefonoPaciente) {

		this.telefonoPaciente = telefonoPaciente;
	}


	// Metodo toString
	@Override
	public String toString() {
		return "Informacion: " + numeroCedula + "  " + nombres + "  " + apellidos + "  " + edad + "  " + genero + "  "
				+ fechaNacimiento + "  " + direccionDomiciliaria + "  " + telefonoPaciente + "  " + tipoSangre + "\n";
	}


}
