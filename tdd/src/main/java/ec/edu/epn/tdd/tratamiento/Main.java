package ec.edu.epn.tdd.tratamiento;

import java.util.Scanner;

public class Main {


    public static void main(String args[]) {

        ListaTratamientos listaMain = new ListaTratamientos();

        int menu = 0;

        String idTratamiento = "";
        String procedimientoTratamiento = "";
        String prescripcionTratamiento = "";
        String fecha = "";

        Scanner entrada = new Scanner(System.in);
        boolean validar, existe, validar2;

    do {
        System.out.println("--------------------------------------------------");
        System.out.println("SISTEMA CLINICA ODONTOLOGICA");
        System.out.println("--------------------------------------------------");
        System.out.println("Menu Tratamiento");
        System.out.println("-------------------------------------------------");
        System.out.println("1. Tratamiento Diagnostico");
        System.out.println("2. Tratamiento Periodoncia");
        System.out.println("3. Tratamiento Ortodonia");
        System.out.println("4. Tratamiento Endodoncia");
        System.out.println("5. Imprimir lista tratamientos");
        System.out.println("0. Salir");
        System.out.println("--------------------------------------------------");

        System.out.print("Ingrese una opcion: ");
        menu = entrada.nextInt();
        entrada.nextLine();
        //Switch para controlar el menu

        switch (menu) {
            case 1:
                //Diagnostico
                do {
                    System.out.println("--------------------------------------------------");
                    System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Menu Tratamiento Diagnostico");
                    System.out.println("-------------------------------------------------");
                    System.out.println("1. Registrar Tratamiento");
                    System.out.println("2. Actualizar Tratamiento");
                    System.out.println("3. Actualizar Prescripcion Tratamiento");
                    System.out.println("4. Imprimir lista de tratamientos");
                    System.out.println("5. Regresar");
                    System.out.println("--------------------------------------------------");
                    System.out.print("Ingrese una opcion: ");
                    menu = entrada.nextInt();
                    entrada.nextLine();
                    //Switch para controlar el menu
                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese datos del Tratamiento:");
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.diagnostico.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.diagnostico.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.diagnostico.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == true) {
                                    System.out.println("El diagnostico ya existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == true );

                            System.out.print("Ingrese procedimiento del tratamiento: ");
                            procedimientoTratamiento = entrada.nextLine();
                            System.out.print("Ingrese prescripcion del tratamiento: ");
                            prescripcionTratamiento = entrada.nextLine();

                            listaMain.diagnostico.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento);
                            listaMain.diagnostico.listaDiagnostico.add(new Diagnostico(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha));
                            listaMain.anadirTratamiento(idTratamiento, "Diagnostico");

                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.diagnostico.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento));
                            System.out.println(new Diagnostico(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha).toString());
                            break;

                        case 2:
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.diagnostico.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.diagnostico.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.diagnostico.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == false) {
                                    System.out.println("El diagnostico no existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == false);

                            System.out.print("Ingrese nuevo procedimiento del tratamiento: ");
                            procedimientoTratamiento = entrada.nextLine();
                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.diagnostico.actualizarTratamiento(idTratamiento, procedimientoTratamiento, fecha)); //,fecha
                            break;

                        case 3:
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.diagnostico.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.diagnostico.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.diagnostico.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == false) {
                                    System.out.println("El diagnostico no existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == false);

                            System.out.print("Ingrese nueva prescripcion del tratamiento: ");
                            prescripcionTratamiento = entrada.nextLine();
                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.diagnostico.actualizarPrescripcionTratamiento(idTratamiento, prescripcionTratamiento, fecha)); //,fecha
                            break;

                        case 4:
                            System.out.println(listaMain.listaTratamientos[0].toString());
                            break;
                        case 5:
                            System.out.print("Regresando menu principal \n");
                            break;
                        default:
                            System.out.println("Opcion no valida / Vuelva a intentar");
                    }

                } while (menu != 5);
                break;


            case 2:
                //Periodoncia
                do {
                    System.out.println("--------------------------------------------------");
                    System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Menu Tratamiento Periodoncia");
                    System.out.println("-------------------------------------------------");
                    System.out.println("1. Registrar Tratamiento");
                    System.out.println("2. Actualizar Tratamiento");
                    System.out.println("3. Actualizar Prescripcion Tratamiento");
                    System.out.println("4. Imprimir lista de tratamientos");
                    System.out.println("5. Regresar");
                    System.out.println("--------------------------------------------------");

                    System.out.print("Ingrese una opcion: ");
                    menu = entrada.nextInt();
                    entrada.nextLine();
                    //Switch para controlar el menu

                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese datos del Tratamiento:");
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.periodoncia.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.periodoncia.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.periodoncia.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == true) {
                                    System.out.println("La periodoncia ya existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == true );

                            System.out.print("Ingrese procedimiento del tratamiento: ");
                            procedimientoTratamiento = entrada.nextLine();
                            System.out.print("Ingrese prescripcion del tratamiento: ");
                            prescripcionTratamiento = entrada.nextLine();

                            listaMain.periodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento);
                            listaMain.periodoncia.listaPeriodoncia.add(new Periodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha));
                            listaMain.anadirTratamiento(idTratamiento, "Periodoncia");

                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.periodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento));
                            System.out.println(new Periodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha).toString());
                            break;
                        case 2:
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.periodoncia.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.periodoncia.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.periodoncia.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == false) {
                                    System.out.println("La periodoncia no existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == false);

                            System.out.print("Ingrese nuevo procedimiento del tratamiento: ");
                            procedimientoTratamiento = entrada.nextLine();
                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.periodoncia.actualizarTratamiento(idTratamiento, procedimientoTratamiento, fecha)); //,fecha
                            break;
                        case 3:
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.periodoncia.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.periodoncia.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.periodoncia.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == false) {
                                    System.out.println("La periodoncia no existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == false);

                            System.out.print("Ingrese nueva prescripcion del tratamiento: ");
                            prescripcionTratamiento = entrada.nextLine();
                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.periodoncia.actualizarPrescripcionTratamiento(idTratamiento, prescripcionTratamiento, fecha)); //,fecha
                            break;
                        case 4:
                            System.out.println(listaMain.listaTratamientos[1].toString());
                            break;
                        case 5:
                            System.out.print("Regresando menu principal \n");
                            break;

                        default:
                            System.out.println("Opcion no valida / Vuelva a intentar");

                    }

                }while (menu != 5);
                break;



            case 3:
                //Ortodoncia

                do {
                    System.out.println("--------------------------------------------------");
                    System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Menu Tratamiento Ortodoncia");
                    System.out.println("-------------------------------------------------");
                    System.out.println("1. Registrar Tratamiento");
                    System.out.println("2. Actualizar Tratamiento");
                    System.out.println("3. Actualizar Prescripcion Tratamiento");
                    System.out.println("4. Imprimir lista de tratamientos");
                    System.out.println("5. Regresar");
                    System.out.println("--------------------------------------------------");

                    System.out.print("Ingrese una opcion: ");
                    menu = entrada.nextInt();
                    entrada.nextLine();
                    //Switch para controlar el menu

                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese datos del Tratamiento:");
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.ortodoncia.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.ortodoncia.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.ortodoncia.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == true) {
                                    System.out.println("La Ortodoncia ya existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == true );

                            System.out.print("Ingrese procedimiento del tratamiento: ");
                            procedimientoTratamiento = entrada.nextLine();
                            System.out.print("Ingrese prescripcion del tratamiento: ");
                            prescripcionTratamiento = entrada.nextLine();

                            listaMain.ortodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento);
                            listaMain.ortodoncia.listaOrtodoncias.add(new Ortodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha));
                            listaMain.anadirTratamiento(idTratamiento, "Ortodoncia");

                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.ortodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento));
                            System.out.println(new Ortodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha).toString());
                            break;
                        case 2:
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.ortodoncia.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.ortodoncia.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.ortodoncia.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == false) {
                                    System.out.println("La Ortodoncia no existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == false);

                            System.out.print("Ingrese nuevo procedimiento del tratamiento: ");
                            procedimientoTratamiento = entrada.nextLine();
                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.ortodoncia.actualizarTratamiento(idTratamiento, procedimientoTratamiento, fecha)); //,fecha
                            break;
                        case 3:
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.ortodoncia.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.ortodoncia.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.ortodoncia.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == false) {
                                    System.out.println("La Ortodoncia no existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == false);

                            System.out.print("Ingrese nueva prescripcion del tratamiento: ");
                            prescripcionTratamiento = entrada.nextLine();
                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.ortodoncia.actualizarPrescripcionTratamiento(idTratamiento, prescripcionTratamiento, fecha)); //,fecha
                            break;
                        case 4:
                            System.out.println(listaMain.listaTratamientos[2].toString());
                            break;
                        case 5:
                            System.out.print("Regresando menu principal \n");
                            break;

                        default:
                            System.out.println("Opcion no valida / Vuelva a intentar");

                    }

                }while (menu != 5);
                break;


            case 4:
                //Endodoncia
                do {
                    System.out.println("--------------------------------------------------");
                    System.out.println("SISTEMA CLINICA ODONTOLOGICA");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Menu Tratamiento Endodoncia");
                    System.out.println("-------------------------------------------------");
                    System.out.println("1. Registrar Tratamiento");
                    System.out.println("2. Actualizar Tratamiento");
                    System.out.println("3. Actualizar Prescripcion Tratamiento");
                    System.out.println("4. Imprimir lista de tratamientos");
                    System.out.println("5. Regresar");
                    System.out.println("--------------------------------------------------");

                    System.out.print("Ingrese una opcion: ");
                    menu = entrada.nextInt();
                    entrada.nextLine();
                    //Switch para controlar el menu

                    switch (menu) {
                        case 1:
                            System.out.println("Ingrese datos del Tratamiento:");
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.endodoncia.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.endodoncia.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.endodoncia.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == true) {
                                    System.out.println("La Endodoncia ya existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == true );

                            System.out.print("Ingrese procedimiento del tratamiento: ");
                            procedimientoTratamiento = entrada.nextLine();
                            System.out.print("Ingrese prescripcion del tratamiento: ");
                            prescripcionTratamiento = entrada.nextLine();

                            listaMain.endodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento);
                            listaMain.endodoncia.listaEndodoncias.add(new Endodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha));
                            listaMain.anadirTratamiento(idTratamiento, "Endodoncia");

                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.endodoncia.registrarTratamiento(idTratamiento, procedimientoTratamiento, prescripcionTratamiento));
                            System.out.println(new Endodoncia(idTratamiento, procedimientoTratamiento, prescripcionTratamiento, fecha).toString());
                            break;
                        case 2:
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.endodoncia.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.endodoncia.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.endodoncia.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == false) {
                                    System.out.println("La Endodoncia no existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == false);

                            System.out.print("Ingrese nuevo procedimiento del tratamiento: ");
                            procedimientoTratamiento = entrada.nextLine();
                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.endodoncia.actualizarTratamiento(idTratamiento, procedimientoTratamiento, fecha)); //,fecha
                            break;
                        case 3:
                            do{
                                //ID
                                System.out.print("Ingrese id del tratamiento: ");
                                idTratamiento = entrada.nextLine();
                                validar = listaMain.endodoncia.validador.validarCedula(idTratamiento);
                                //FECHA
                                System.out.print("Ingrese fecha del tratamiento: ");
                                fecha = entrada.nextLine();
                                validar2 = listaMain.endodoncia.validador.validarFecha(fecha);
                                //EXISTE
                                existe = listaMain.endodoncia.existeTratamiento(idTratamiento, fecha);

                                if(validar == false || validar2 == false){
                                    System.out.println("ID o fecha incorrecta, intente de nuevo.....");
                                } else if ( existe == false) {
                                    System.out.println("La Endodoncia no existe dentro del sistema, intente de nuevo.");
                                }
                            } while (validar == false || validar2 == false || existe == false);

                            System.out.print("Ingrese nueva prescripcion del tratamiento: ");
                            prescripcionTratamiento = entrada.nextLine();
                            System.out.println("----------------------------------------------------");
                            System.out.println(listaMain.endodoncia.actualizarPrescripcionTratamiento(idTratamiento, prescripcionTratamiento, fecha)); //,fecha
                            break;
                        case 4:
                            System.out.println(listaMain.listaTratamientos[3].toString());
                            break;
                        case 5:
                            System.out.print("Regresando menu principal \n");
                            break;

                        default:
                            System.out.println("Opcion no valida / Vuelva a intentar");
                    }

                }while (menu != 5);
                break;

            case 5:
                System.out.println(listaMain.toString());
                break;

            case 0:
                System.out.print("****Gracias por ingresar al Sistema Papu****\n");
            break;

            default:
                System.out.println("Opcion no valida / Vuelva a intentar");
        }

    }while (menu != 0);

    }

}
