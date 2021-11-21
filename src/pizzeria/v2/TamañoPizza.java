
package pizzeria.v2;

public class TamañoPizza {
    
    private String [] cantPorciones;
  

    public TamañoPizza() {
        
      this.cantPorciones= new String[8];
       this.cantPorciones=new String[]{"1","2","3","4","5","6","7","8"};
    }

    public String [] getCantPorciones() {
        return this.cantPorciones;
    }

    public void setCantPorciones(String [] cantPorciones) {
        this.cantPorciones = cantPorciones;
    }

    @Override
    public String toString() {
        return "cantPorciones="+ cantPorciones;
    }
    
    
}
