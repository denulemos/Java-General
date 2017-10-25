package ejercicioslemos;

import java.util.Scanner;


public class Empleado {
    
    //Declaro aquí variables que necesito para todos los métodos
    private int[] HTra;
    private int htra;
    
    //Este es el método que hace todo y resuelve el problema, desde el main solo se llama a este.
    public void Empleado()
    {
        HTra = new int[2];
        double pextra = 0.0, ph = 0.0;
        
        //Nunca utilicen un número fijo en un for o while
        for(int i = 0; i < HTra.length; i++)
        {
            CUno();
            HTra[i] = htra;
        }

        for(int i = 0; i < HTra.length; i++)
        {
            if(HTra[i] < 160)
            {
                ph = ph + 1;
            }
            else
            {
                if(HTra[i] > 160)
                {
                    pextra = pextra + 1;
                }
            }
        }
        
        ph = 100.0 * (ph / HTra.length);
        pextra = 100.0 * (pextra / HTra.length);

        System.out.println("\n\nEl porcentaje de empleados que cobraron el presentismo es: " + ph+ "%");
        System.out.println("\nEl porcentaje de empleados hizo horas extras: " + pextra+"%");
    }
    
    
    //Este metodo hace todo el cálculo para un solo empleado
    public void CUno()
    {
        //Definición de variables de Entrada OJO no definir de nuevo lo que esta arriba
        int hextrfind;
        String cate;

        //Definición de variables de Salida
        double suebru, suebas, pextra, ph, jub, os, ley, pre = 0.0;
        
        //Definición de variables de Trabajo si existen
        int hora = 0;
        
        //Ingreso de los datos con validaciones

        Scanner ver = new Scanner(System.in);
        System.out.print("Ingese la categoria del empleado: ");
        
        cate=ver.next();
        
        System.out.print("Ingese el total de las horas trabajadas: ");
        
        while(!ver.hasNextInt())
            {
                System.out.println("Error de dato."
                    + "\nIntente de nuevo");
            ver.next();
            }
        htra=ver.nextInt();
        
        System.out.print("Ingrese el total de las horas extras del finde semana: ");
        
        while(!ver.hasNextInt())
            {
                System.out.println("Error de dato."
                    + "\nIntente de nuevo");
            ver.next();
            }
        hextrfind=ver.nextInt();

        //Proceso central, logica que resuelve el problema
        
        if(cate.equalsIgnoreCase("a"))
        {//catergoriga A
            suebas=15000.0;
        } 
        else
        {
            if(cate.equalsIgnoreCase("b"))
            {//Categoria B
                suebas=10000.0;
            }
            else
            {//Categoria inexistente
                suebas=0.0;
            }
        }
        
        if(htra<160)
        {
            hextrfind=0;
            suebru=suebas;
        }
        else
        {
            pre=suebas*(10.0/100.0);
            suebru=suebas+pre;
        }
        
        hora=htra-160;
        suebru = suebru + (hora-hextrfind) * 1.5 * (suebas/160.0);
        suebru = suebru + hextrfind * 2.0 * (suebas/160.0);
        
        jub=suebru*(11.0/100.0);
        os=suebru*(3.0/100.0);
        ley=suebru*(3.0/100.0);
        
        
        //Salidas, lo que el sistem debe mostrar al usuario.
        
        /* Hechas las partes de entrada y salida, colocamos valores fijos a las salidas
        para probar que todo funciona antes de programar lo central de la aplicación
        suebas = 900;
        suebru = 1000;
        pre = 100;
        jub = 110;
        os = 30;
        ley = 30;
        */
        System.out.println("\n\n-----------------------Recibo de Haberes-------------------------\n");
        System.out.println("\n\nSueldo Basico:--------------------------------- $"+suebas);
        System.out.println("\n\nSueldo Bruto:--------------------------------- $"+suebru);
        System.out.println("\nPresentismo : \t\t\t\t 10%---$ "+pre);
        System.out.println("\nDescuento por Jubilación :\t\t11%---$ " + jub);
        System.out.println("\nDescuento por Aportes :\t\t\t03%---$ " + os);
        System.out.println("\nDescuento por Ley 19032 :\t\t03%---$ " + ley);
        System.out.println("\nSueldo Neto:----------------------------------$ " + (suebru-jub-os-ley));
        System.out.print("\n\n--------------------------Observacíon---------------------------\n");
        System.out.println("----------------------------------------------------------------");
    }
    
}


