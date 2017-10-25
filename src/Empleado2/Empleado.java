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
    private String cate;
    private double SBasico;
    private LocalDate FIngreso;
    
    private Sueldo MiSueldo;

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public double getSBasico() {
        return SBasico;
    }

    public void setSBasico(double SBasico) {
        this.SBasico = SBasico;
    }

    public LocalDate getFIngreso() {
        return FIngreso;
    }

    public void setFIngreso(LocalDate FIngreso) {
        this.FIngreso = FIngreso;
    }

    public Sueldo getMiSueldo() {
        return MiSueldo;
    }

    public void setMiSueldo(Sueldo MiSueldo) {
        this.MiSueldo = MiSueldo;
    }
    
    public Empleado()
    {
        MiSueldo= new Sueldo();
        
    }
}
