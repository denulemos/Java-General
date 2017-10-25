/*
 * Hacer calculadora con 2 numeros ingresados.
 */
package ejercicioslemos;

/**
 *
 * @author alumno
 */


public class DosNum{
    public double operador1;
    public double operador2;
    public double resultado;
    
    public void sumar()
    {
        resultado = operador1+operador2;
        
    }
    public void restar()
    {
        resultado=operador1-operador2;
    }
    public double multiplicar()
    {
        double retorno = 0,0;
        retorno = operador1 * operador2;
        return retorno;
       
    }
    public void dividir()
    {
        resultado=operador1/operador2;
        
    }
}
