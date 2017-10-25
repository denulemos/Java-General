/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado2;

import java.time.LocalDate;

/**
 *
 * @author alumno
 */
public class Empleado {
    private int legajo; //privado ya que son propiedades
    private String ape;
    private String nom;
    private double SBasico;
    private LocalDate FIngreso;
    
    private Sueldo MiSueldo;
    
    public Empleado()
    {
        MiSueldo= new Sueldo();
        
    }
}
