package agendacontactos;

/**
 *
 * @author Miller Gallego
 */
public class Agenda {

    private Contactos[] contacto;

    public Agenda() {
        this.contacto = new Contactos[10];
    }

    public Agenda(int cantidad) {
        this.contacto = new Contactos[cantidad];
    }

    public void agregarcontacto(Contactos c) {

        boolean encontrado = false;
        for (int i = 0; i < contacto.length && !encontrado; i++) {
            if (contacto[i] != null) {

                if (c.getNumeroTelefono() == contacto[i].getNumeroTelefono() || c.getCorreoElectronico().equals(contacto[i].getCorreoElectronico())) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("Este contacto ya esta en al lista");
                    System.out.println("-------------------------------------------------");
                    break;

                } else if (contacto[i] != null) {
                } else {
                    contacto[i] = c;
                    encontrado = true;

                    if (encontrado) {
                        System.out.println("-------------------------------------------------");
                        System.out.println("El contacto se agrego correctamente");
                        System.out.println("-------------------------------------------------");
                    } else {
                        System.out.println("-------------------------------------------------");
                        System.out.println("El contacto no se pudo agregar");
                        System.out.println("-------------------------------------------------");
                    }

                }
            } else {

                contacto[i] = c;
                encontrado = true;

                if (encontrado) {
                    System.out.println("-------------------------------------------------");
                    System.out.println("El contacto se agrego correctamente");
                    System.out.println("-------------------------------------------------");
                } else {
                    System.out.println("-------------------------------------------------");
                    System.out.println("El contacto no se pudo agregar");
                    System.out.println("-------------------------------------------------");
                }
            }

        }

    }

    public void modificarContacto(long telefono, String email, String nombre, float saldo) {

        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] != null) {
                if (telefono == contacto[i].getNumeroTelefono()) {

                    contacto[i].setNombreCompleto(nombre);
                    contacto[i].setCorreoElectronico(email);
                    contacto[i].setSaldoDolares(saldo);
                    System.out.println("El contacto fue actualizado correcatmente");
                    break;

                } else if (email.equals(contacto[i].getCorreoElectronico())) {
                    contacto[i].setNombreCompleto(nombre);
                    contacto[i].setNumeroTelefono(telefono);
                    contacto[i].setSaldoDolares(saldo);
                    System.out.println("El contacto fue actualizado correcatmente");
                    break;

                } else {
                    System.out.println("Este contacto no se encuentra en la agenda");
                    break;
                }

            } else {
                System.out.println("Este contacto no se encuentra en la agenda");
                break;
            }
        }
    }

    public void eliminarContactoTelefono(long telefono) {
        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] != null) {
                if (telefono == contacto[i].getNumeroTelefono()) {
                    contacto[i] = null;
                    System.out.println("El contacto fue eliminado con exito");
                    break;
                } else {
                    System.out.println("Este contacto no se encuentra en la agenda");
                    break;
                }
            } else {
                System.out.println("Este contacto no se encuentra en la agenda");
                break;
            }
        }

    }

    public void eliminarContactoEmail(String email) {
        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] != null) {
                if (email.equals(contacto[i].getCorreoElectronico())) {
                    contacto[i] = null;
                    System.out.println("El contacto fue eliminado con exito");
                    break;
                } else {
                    System.out.println("Este contacto no se encuentra en la agenda");
                    break;
                }
            } else {
                System.out.println("Este contacto no se encuentra en la agenda");
                break;
            }
        }

    }

    public void consultarContacto() {

        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] != null) {

                System.out.println("-------------------------------------------------");
                System.out.println("telefono: " + contacto[i].getNumeroTelefono());
                System.out.println("nombre: " + contacto[i].getNombreCompleto());
                System.out.println("email: " + contacto[i].getCorreoElectronico());
                System.out.println("saldo: " + contacto[i].getSaldoDolares());
                System.out.println("-------------------------------------------------");

            } else if (contacto[0] == null) {
                System.out.println("-------------------------------------------------");
                System.out.println("No hay ningun contacto en la agenda");
                System.out.println("-------------------------------------------------");
                break;
            }
        }

    }

    public void consultarContactoTelefono(long telefono) {

        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] != null) {
                if (telefono == contacto[i].getNumeroTelefono()) {

                    System.out.println("telefono: " + contacto[i].getNumeroTelefono());
                    System.out.println("telefono: " + contacto[i].getNombreCompleto());
                    System.out.println("telefono: " + contacto[i].getCorreoElectronico());
                    System.out.println("telefono: " + contacto[i].getSaldoDolares());

                } else {

                    System.out.println("Este contacto no se encuentra en la agenda");

                }

            } else {

                System.out.println("Este contacto no se encuentra en la agenda");

                break;
            }
        }

    }

    public void consultarContactoEmail(String email) {

        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] != null) {
                if (email.equals(contacto[i].getCorreoElectronico())) {

                    System.out.println("telefono: " + contacto[i].getCorreoElectronico());
                    System.out.println("telefono: " + contacto[i].getNombreCompleto());
                    System.out.println("telefono: " + contacto[i].getNumeroTelefono());
                    System.out.println("telefono: " + contacto[i].getSaldoDolares());

                } else {

                    System.out.println("Este contacto no se encuentra en la agenda");

                }

            } else {

                System.out.println("Este contacto no se encuentra en la agenda");

                break;
            }
        }

    }

    public void consignarDinero(long telefono, float valorConsignar) {

        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] != null) {
                if (telefono == contacto[i].getNumeroTelefono()) {
                    contacto[i].setSaldoDolares(valorConsignar + contacto[i].getSaldoDolares());

                    break;
                } else {

                    System.out.println("Este contacto no se encuentra en la agenda");

                    break;
                }

            } else {

                System.out.println("Este contacto no se encuentra en la agenda");

                break;
            }
        }

    }

    public void transferirDinero(long telefono1, long telefono2, float valorTransaccion) {

        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] != null) {
                if (telefono1 == contacto[i].getNumeroTelefono()) {
                    if (contacto[i].getSaldoDolares() >= valorTransaccion) {

                        for (int j = 0; j < contacto.length; j++) {
                            if (contacto[j] != null) {
                                if (telefono2 == contacto[j].getNumeroTelefono()) {

                                    contacto[i].setSaldoDolares(contacto[i].getSaldoDolares() - valorTransaccion);
                                    contacto[j].setSaldoDolares(contacto[j].getSaldoDolares() + valorTransaccion);
                                    System.out.println("-------------------------------------------------");
                                    System.out.println("el dinero a sido transferido con exito");
                                    System.out.println("-------------------------------------------------");
                                    break;
                                }

                            } else {

                                System.out.println("El telefono 2 no se encuentra en la lista");
                                break;
                            }
                        }

                    } else {
                        System.out.println("el saldo del telefono 1 es insuficiente");

                    }
                } else {
                    System.out.println("El telefono 1 no se encuentra en la lista");

                }
                break;

            } else {
                System.out.println("El telefono 1 no se encuentra en la lista");

            }
        }
    }

    public void consultarSaldo(long telefono) {
        for (int i = 0; i < contacto.length; i++) {
            if (contacto[i] != null) {
                if (telefono == contacto[i].getNumeroTelefono()) {
                    System.out.println("su saldo es de: " + contacto[i].getSaldoDolares());;

                    break;
                } else {

                    System.out.println("Este contacto no se encuentra en la agenda");

                    break;
                }

            } else {

                System.out.println("Este contacto no se encuentra en la agenda");

                break;
            }
        }
    }
}
