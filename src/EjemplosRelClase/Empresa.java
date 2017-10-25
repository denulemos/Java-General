/*
 * Ejemplo de ASOCIACION
 */
package EjemplosRelClase;

/**
 *
 * @author alumno
 */
public class Empresa {
    public int NIGJ;
    public String RazonSocial;
    
    public Proveedor[] MiProveedor;
    
   public Empresa(){
       MiProveedor = new Proveedor [100];
   }
}

//A nivel programacion, la asociacion y la composicion son casi iguales
