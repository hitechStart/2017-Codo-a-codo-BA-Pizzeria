
package pizzeria.v2;

public class VariedadPizza {
    
    private String ingredientes;
    private String nombre [];
    
    public VariedadPizza(){
    
        this.ingredientes="";
        
        this.nombre= new String[3];
        this.nombre=new String[]{"Muzzarrella","Anchoas","Fugazza"};
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String[] getNombre() {
        return nombre;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }    
}
