/*
 * Hay que construir una pieza de 4 paredes y un techo. Un Albañil nos cobra
 *cada pared 50$ por hora, y para el techo necesito a 3 personas que nos
 * cobran, cada una, 70$ la hora. Y se presentan el 6/4 a trabajar a las 8:00
 * a ) Si las paredes tardan 40 horas en construirse, cual es el costo total?
 * b) Si las paredes se terminan el dia 7/4 a las 10:00, (8 horas por dia),
 * cual es el costo de la mano de obra?
 * c) Si el dia 7/4 a las 8:00 hay 2 paredes terminadas y a las otras 2 les
 * faltan 8 horas para terminarse, cual es el costo?
 */
package ejercicioslemos;

/**
 * @author denulemos
 */

public class MiEjer10 {
    public void MiEjer(){
        System.out.println(" Hay que construir una pieza de 4 paredes y un techo"
                + " Un albañil nos cobra cada pared 50$ la hora y para el"
                + " techo necesito a 3 personas que nos cobran, cada una, "
                + " 70$ la hora. Y se presentan el 6/4 a trabajar a las 8:00"
                + " a) Si las paredes tardan 40 horas en construirse, cual es"
                + " el costo total?"
                + " b) Si las paredes se terminan el dia 7/4 a las 10:00 que"
                + " serian 8 horas por dia, cual es el costo de la mano de obra?"
                + " c) Si el dia 7/4 a las 8:00 hay 2 paredes terminadas y a "
                + " las otras 2 les faltan 8 horas para terminarse, cual es"
                + " el costo? ");
        //Proceso y defincion
        float a = 40*50;
        float a2 = 70*3*40;
        float at = a+a2;
        float b = 8+2*50;
        float c = 8 * 50;
        float c2 = 8*50+c;
        //Salida
        System.out.println("Las paredes y el techo en a) salen= " + at );
        System.out.println("las paredes en el caso B salen = " + b);
        System.out.println("Las paredes en C salen = " + c2);
               
    }
    
}
