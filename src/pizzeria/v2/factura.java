
package pizzeria.v2;

import java.util.Date;


public class factura {
    
    private Date fechaHoraEmision;
    private int numero;

    public factura(Date fechaHoraEmision, int numero) {
        this.fechaHoraEmision = fechaHoraEmision;
        this.numero = numero;
    }

    public Date getFechaHoraEmision() {
        return fechaHoraEmision;
    }

    public void setFechaHoraEmision(Date fechaHoraEmision) {
        this.fechaHoraEmision = fechaHoraEmision;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "factura{" + "fechaHoraEmision=" + fechaHoraEmision + ", numero=" + numero + '}';
    }
    public void buscarItemsAFacturar(){};
    public void calcularTotalFactura(){};
    
    
    
}
