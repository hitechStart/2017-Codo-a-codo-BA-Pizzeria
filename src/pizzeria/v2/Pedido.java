
package pizzeria.v2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pedido {
  
    private String fechaHoraCreacion;
    private Date FechaHoraEntrega;
    private String nombreCliente;
    private int numero;
    
     public Pedido(){
     
        this.fechaHoraCreacion = "";
        this.FechaHoraEntrega = new Date();
        this.nombreCliente = "";
        this.numero = 0;
     }
    
    public Pedido(String fechaHoraCreacion, Date FechaHoraEntrega, String nombreCliente, int numero) {
        this.fechaHoraCreacion = fechaHoraCreacion;
        this.FechaHoraEntrega = FechaHoraEntrega;
        this.nombreCliente = nombreCliente;
        this.numero = numero;
    }

    public String getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(String fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public Date getFechaHoraEntrega() {
        return FechaHoraEntrega;
    }

    public void setFechaHoraEntrega(Date FechaHoraEntrega) {
        this.FechaHoraEntrega = FechaHoraEntrega;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Pedido{" + "fechaHoraCreacion=" + fechaHoraCreacion + 
                ", FechaHoraEntrega=" + FechaHoraEntrega + ", nombreCliente=" +
                nombreCliente + ", numero=" + numero + '}';
    }
    
    public boolean confirmar(){
        
        Date date = new Date();
        Scanner entrada = new Scanner (System.in); 
        
        System.out.print("\nIngrese numero de pedido: ");
        this.numero=Integer.parseInt(entrada.nextLine());
        
        System.out.print("\nIngrese el nombre del cliente: ");
        this.nombreCliente=entrada.nextLine();
        
        DateFormat fechaCompletaYFormateada = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        this.fechaHoraCreacion= fechaCompletaYFormateada.format(date);
          
        return false;
    };
    public boolean cancelar(Pizza piza){
    
        piza=null;
        
        return true;
    };
    
    public void obtenerDetallesPedido(String opcionVariedad,
            String tipo,int tam){
        
        System.out.println("\n\n\tDetalle del pedido\n\n");
        
        System.out.println("Fecha:\t"+this.fechaHoraCreacion);
        System.out.println("Numero de pedido:"+this.numero+"\t"
        +this.nombreCliente);
        System.out.println("\n\nVariedad De Pizza:\t"+opcionVariedad);
        System.out.println("Tipo de pizza:\t\t"+tipo);
        System.out.println("cantidad de porciones:\t"+tam);
    
    };
    
    public void calcularTotalPedido(){}
    public void facturar(){};
   
    
    
    
    
    
    
}
