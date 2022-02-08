package agendacontactos;

import java.util.Scanner;

/**
 *
 * @author Miller Gallego
 */
public class AgendaContactos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lista de contactos Empresa XYZ");
        System.out.println("Ingrese una opcion");
        int opcion = 1;
        int opcion2 = 1;
        int opcion3 = 1, opcion4 = 1, opcion5 = 1, opcion6 = 1, opcion7 = 1;
        String nombre, apellido, email;
        long telefono;
        long telefono1;
        float saldo;
        float consignacion;

        Contactos c;
        Agenda agendaContactos = new Agenda(10);

        while (opcion != 6) {

            System.out.println("1. Agregar nuevo contacto");
            System.out.println("2. Modificar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Consultar contactos");
            System.out.println("5. Tranascciones bancarias");
            System.out.println("6. Salir del Programa");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Menu Agregar Nuevo Contacto");
                    System.out.println("Ingrese Nombre");
                    nombre = scanner.next();
                    System.out.println("Ingrese Apellido");
                    apellido = scanner.next();
                    System.out.println("Ingrese No. Telefono Contacto");
                    telefono = scanner.nextLong();
                    System.out.println("Ingrese Email");
                    email = scanner.next();
                    System.out.println("Ingrese Saldo en dolares");
                    saldo = scanner.nextFloat();
                    if (saldo < 0) {
                        System.out.println("-------------------------------------------------");
                        System.out.println("ingrese un saldo positivo");
                        System.out.println("-------------------------------------------------");
                        break;
                    } else {
                        c = new Contactos(nombre + " " + apellido, telefono, email, saldo);

                        agendaContactos.agregarcontacto(c);

                        break;
                    }

                case 2:
                    System.out.println("Menu Modificar Contacto");

                    while (opcion2 != 2) {
                        System.out.println("1. Modificar por telefono");
                        System.out.println("2. Modificar por email");
                        opcion2 = scanner.nextInt();
                        switch (opcion2) {
                            case 1:
                                System.out.println("Ingrese Numero de telefono para identificar");
                                telefono = scanner.nextLong();
                                System.out.println("Ingrese email a modificar");
                                email = scanner.next();
                                System.out.println("Ingrese nombre a modificar");
                                nombre = scanner.next();
                                System.out.println("Ingrese apellido a modificar");
                                apellido = scanner.next();
                                System.out.println("Ingrese saldo a modificar");
                                saldo = scanner.nextFloat();
                                System.out.println("-------------------------------------------------");
                                agendaContactos.modificarContacto(telefono, email, nombre + " " + apellido, saldo);
                                System.out.println("-------------------------------------------------");
                                break;
                            case 2:
                                System.out.println("Ingrese email para identificar");
                                email = scanner.next();
                                System.out.println("Ingrese Numero de telefono a modificar ");
                                telefono = scanner.nextLong();
                                System.out.println("Ingrese nombre a modificar");
                                nombre = scanner.next();
                                System.out.println("Ingrese apellido a modificar");
                                apellido = scanner.next();
                                System.out.println("Ingrese saldo a modificar");
                                saldo = scanner.nextFloat();
                                System.out.println("-------------------------------------------------");
                                agendaContactos.modificarContacto(telefono, email, nombre + " " + apellido, saldo);
                                System.out.println("-------------------------------------------------");
                                break;
                        }
                        break;
                    }

                    break;
                case 3:
                    System.out.println("Menu Eliminar Contacto");

                    while (opcion4 != 2) {
                        System.out.println("1. Eliminar por telefono");
                        System.out.println("2. Eliminar por email");
                        opcion4 = scanner.nextInt();
                        switch (opcion4) {
                            case 1:
                                System.out.println("Ingrese el No. de Telefono");
                                telefono = scanner.nextLong();
                                System.out.println("-------------------------------------------------");
                                agendaContactos.eliminarContactoTelefono(telefono);
                                System.out.println("-------------------------------------------------");
                                break;
                            case 2:
                                System.out.println("Ingrese email");
                                email = scanner.next();
                                System.out.println("-------------------------------------------------");
                                agendaContactos.eliminarContactoEmail(email);
                                System.out.println("-------------------------------------------------");
                                break;
                        }
                        break;
                    }

                    break;

                case 4:
                    System.out.println("Menu Consulta Contacto");
                    opcion5 = 0;
                    while (opcion5 != 2) {
                        System.out.println("1. Consultar Listado de contactos");
                        System.out.println("2. Consultar un contacto");
                        opcion5 = scanner.nextInt();
                        switch (opcion5) {
                            case 1:
                                System.out.println("Listado de Contactos");
                                agendaContactos.consultarContacto();
                                break;
                            case 2:
                                while (opcion6 != 2) {
                                    System.out.println("1. Consultar por telefono");
                                    System.out.println("2. Consultar por email");
                                    opcion6 = scanner.nextInt();
                                    switch (opcion6) {
                                        case 1:
                                            System.out.println("Ingrese el No. de Telefono");
                                            telefono = scanner.nextLong();
                                            System.out.println("-------------------------------------------------");
                                            agendaContactos.consultarContactoTelefono(telefono);
                                            System.out.println("-------------------------------------------------");
                                            break;
                                        case 2:
                                            System.out.println("Ingrese email");
                                            email = scanner.next();
                                            System.out.println("-------------------------------------------------");
                                            agendaContactos.consultarContactoEmail(email);
                                            System.out.println("-------------------------------------------------");
                                            break;
                                    }
                                    break;
                                }
                        }
                        break;
                    }
                    break;

                case 5:
                    System.out.println("Menu Transacciones Bancarias");
                    opcion7=0;
                    while (opcion7 != 3) {
                        System.out.println("1. Consignar dinero");
                        System.out.println("2. Hacer transacciones entre contactos");
                        System.out.println("3. Consultar Saldo");
                        opcion7 = scanner.nextInt();
                        switch (opcion7) {
                            case 1:
                                System.out.println("Ingrese el celular al que desea consignar");
                                telefono = scanner.nextLong();
                                System.out.println("Ingrese el valor que desea consignar");
                                consignacion = scanner.nextFloat();

                                if (consignacion > 0) {
                                    agendaContactos.consignarDinero(telefono, consignacion);
                                } else {
                                    System.out.println("ingrese un valor correcto");
                                }
                                break;
                            case 2:
                                System.out.println("Ingrese el telefono 1 del que desea sacar el dinero");
                                telefono = scanner.nextLong();
                                System.out.println("Ingrese el telefono 2 donde desea que llegue el dinero");
                                telefono1 = scanner.nextLong();
                                System.out.println("Ingrese el valor que desea transferir");
                                consignacion = scanner.nextFloat();

                                if (consignacion > 0) {
                                    agendaContactos.transferirDinero(telefono, telefono1, consignacion);
                                } else {
                                    System.out.println("ingrese un valor correcto");
                                }
                                break;

                            case 3:
                                System.out.println("Ingrese el telefono para consultar el saldo");
                                telefono = scanner.nextLong();

                                agendaContactos.consultarSaldo(telefono);
                                break;
                        }
                        break;
                    }
                    break;
                default:
                    System.out.println("Ingrese un numero del 1 al 6");
                    break;
            }
        }

    }

}
