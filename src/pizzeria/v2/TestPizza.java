
package pizzeria.v2;

import java.util.Scanner;

public class TestPizza {

 
    public static void main(String[] args) {
   
        Pizza piza= new Pizza();
        VariedadPizza v =new VariedadPizza();
        TipoPizza t=new TipoPizza();
        TamañoPizza tp=new TamañoPizza();
        Pedido pe=new Pedido();
        
        String opcionVariedad="",tipo="";
        int tam=0;
                
        boolean menu=true;
        
        System.out.println("Bienvenido al sistema de elaboracion de pizzas "
                + "Pizeria Carlos\n");
        
        while(menu){
       System.out.println("\tElija una opcion del menu\n");
        
        Scanner entrada = new Scanner (System.in); 
        
       int opcion = 1; 
      
       switch(opcion)
       {
           case 1:
               System.out.println("1-variedades de pizza\n");
               
             opcionVariedad= piza.getVariedadPizza(v);
               
              opcion=2;

               
           case 2:
               
             System.out.println("\n2-Tipo de pizza\n");  
             
               tipo=piza.getTipoPizza(t);
             
           opcion=3;
       
       case 3:
       
       System.out.println("\n3-cantidad de porciones de pizza\n");
      
       tam=piza.getTamañoPizza(tp);
       
       break;
    }
       
        System.out.println("\n\n\t1-Confirmar\t\t2-cancelar");
        
      int operacion = Integer.parseInt(entrada.nextLine());
      
       if(operacion==1){
           
          menu=pe.confirmar();
       }else{
           menu=pe.cancelar(piza);
       }
        
        } 
        
        System.out.println("Pedido numero :"+pe.getNumero()+"Fecha: "+pe.getFechaHoraCreacion());
        System.out.println("\n\nNombre del cliente: "+pe.getNombreCliente());
        
        System.out.println("\n\tDetalles del pedido");
        pe.obtenerDetallesPedido(opcionVariedad,tipo,tam);
    }
    
}
