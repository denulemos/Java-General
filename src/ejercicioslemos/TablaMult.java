//Hacer una tabla de multiplicacion con el numero ingresado
package ejercicioslemos;

import java.util.Scanner;
        
public class TablaMult {
    public void MiEjer(){
        Scanner entra0 = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = entra0.nextInt();
        System.out.println("Ingrese hasta donde desea la tabla");
        int cantidad = entra0.nextInt();
        int i, v;
        for (i=1;i<=cantidad;i++){
            System.out.println(num + "x" + i + "=" + num*i);
            
        }
        
        
        
    }
    
}
