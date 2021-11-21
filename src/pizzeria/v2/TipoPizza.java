
package pizzeria.v2;

public class TipoPizza {

private String [] nombre;
private float precio; 

     public TipoPizza(){
     this.precio=0;
       this.nombre= new String[4];
       this.nombre=new String[]{"Parrilla","Molde","Piedra"};
     
     }

    public String [] getNombre() {
        return nombre;
    }

    public void setNombre(String [] nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "TipoPizza{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }


}
