/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjemplosRelClase;

/**
 *
 * @author alumno
 */
public class Proveedor {
    public String CUIT;
    public String Nombre;
    
    public Empresa[] clientes; //Arreglo ya que provee muchas empresas
    
    public Proveedor(){
        clientes = new Empresa[100];
    }
           
}
