/*
 * Ejemplo de relacion entre clases, relacion de multiplcidad y agregacion.
 */
package EjemplosRelClase;

/**
 *
 * @author Denisse Lemos
 */
public class Computadora {
    public String NSerie;
    public DiscoRigido[] disco; //Atributo de la clase, al poder tener muchos (*) lo hago arreglo con corchetes
    public Ram memoria; //al ser uno solo no es arreglo
    public Video[] video; //al poder tener 2, se hace arreglo
    
    public Computadora() //Mismo nombre de clase pero sin valor de retorno, CONSTRUCTOR
    {
        disco = new DiscoRigido[20]; 
        memoria = new Ram(); //con parentesis creo directo al objeto
        video = new Video [2];
        
    }
    
}
