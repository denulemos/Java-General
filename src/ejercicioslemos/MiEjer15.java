/*
 * Un Empleado cobra un sueldo basico de 10000 por mes de lunes a viernes, 
 * 8 horas por dia. Mostrar horas por mes y valor por hora
 */
package ejercicioslemos;

/**
 * @author Denisse Lemos
 */
public class MiEjer15 {
    public void MiEjer(){
        System.out.println("Ejercicio 15= "
                + " Un empleado cobra un sueldo basico de 10000"
                + " por mes, de lunes a viernes, 8 horas por dia."
                + " Mostrar horas por mes y valor por hora");
        //Declaracion
        float p1;
        float p2;
        //Proceso
        p1=8*5*4;
        p2=10000/p1;
        //Salida
        System.out.println("Las horas hechas por mes son =" + p1);
        System.out.println("El pago por hora es de= " + p2);
    }
}
