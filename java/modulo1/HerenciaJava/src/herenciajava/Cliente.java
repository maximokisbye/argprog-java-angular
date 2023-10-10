package herenciajava;

import java.util.Date;

public class Cliente extends Persona {
    
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes; // variable de clase

    public Cliente(boolean vip) {       // eliminé el argumento Date porque a mi entender no tenia sentido, ahora el valor fechaRegistro lo da en el momemnto de inicializarla.
        // convocar al constructor del Padre
        // inicializar variables
        super();
        contadorClientes++;
        this.idCliente = contadorClientes;
        this.fechaRegistro = new Date();
        this.vip = vip;
        
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getContadorClientes() {
        return contadorClientes;
    }

    @Override
    public String toString() {
        super.toString();
        return "Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
}