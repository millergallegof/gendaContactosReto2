
package agendacontactos;

/**
 *
 * @author Miller Gallego
 */
public class Contactos {
    private String nombreCompleto;
    private long numeroTelefono;
    private String correoElectronico;
    private float saldoDolares;

    public Contactos() {
    }
    
    public Contactos(String nombreCompleto, long numeroTelefono, String correoElectronico, float saldoDolares) {
        this.nombreCompleto = nombreCompleto;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.saldoDolares = saldoDolares;
    }
   
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public long getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(long numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public float getSaldoDolares() {
        return saldoDolares;
    }

    public void setSaldoDolares(float saldoDolares) {
        this.saldoDolares = saldoDolares;
    }

    @Override
    public String toString() {
        return "Contactos{" + "nombreCompleto=" + nombreCompleto + ", numeroTelefono=" + numeroTelefono + ", correoElectronico=" + correoElectronico + ", saldoDolares=" + saldoDolares + '}';
    }
    

    
}
