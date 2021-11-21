
package pizzeria.v2;

import java.util.Scanner;


public class Pizza {
    
 private float precio;
 private String nombre;

    public Pizza(){
        this.precio=0;
        this.nombre="";
    }
    
    public Pizza(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Pizza{" + "precio=" + precio + ", nombre=" + nombre + '}';
    }
    
    public String getVariedadPizza(VariedadPizza v){
    
        int i,eleccion;
        Scanner entrada = new Scanner (System.in); 
          
        String []lista=v.getNombre();
        
        for(i=0;i<3;i++){
            System.out.println(i+1+"-"+lista[i]);
        }
        
        System.out.print("\n\n\t\tAguardando elecion: ");
        
        eleccion = Integer.parseInt(entrada.nextLine());
        
        return lista[eleccion-1];
    
    }
    
    public String getTipoPizza(TipoPizza t){
        
        int i,eleccion;
        Scanner entrada = new Scanner (System.in); 
          
        String []lista=t.getNombre();
        
        for(i=0;i<3;i++){
            System.out.println(i+1+"-"+lista[i]);
        }
        
        System.out.print("\n\n\t\tAguardando elecion: ");
        
        eleccion = Integer.parseInt(entrada.nextLine());
        
        return  lista[eleccion-1];
    }
    
    public int getTamañoPizza(TamañoPizza tb){
    
        int i;
        Scanner entrada = new Scanner (System.in); 
          
        String []lista=tb.getCantPorciones();
        
        for(i=0;i<8;i++){
            if(i!=7){
            System.out.print(lista[i]+"-");
            }else
            {
                System.out.print(lista[i]);
            }
        }
        
        System.out.print("\n\n\t\tAguardando elecion: ");
        
        int eleccion = Integer.parseInt(entrada.nextLine());
        
        return  eleccion;
    }
    
   
  
    
}
