package Programacion_II;

import java.util.Scanner;

public class intereses {
	
	public static void main(String[] args) {
	    
		int tiempo;
		double capital, tasa, cfinal, time, periodos, ganancia, capitalizacion;
        Scanner sx = new Scanner(System.in);
        
        System.out.print("Ingrese el valor del capital: ");
        capital = sx.nextDouble();
  	  
        System.out.print("Ingrese el valor de la tasa: %");
        tasa = sx.nextDouble();
        
        System.out.print("Ingrese el n�mero de a�os para el per�odo de capitalizaci�n: ");
        tiempo = sx.nextInt();
        
 //Aqu� se obtiene la cantidad de meses para totalizar cu�ntos trimestres obtendremos
        
        time = tiempo * 12; 
        
        
        //Formula del capital final:
        
        //cfinal = capital * (1 + tasa / 100)^tiempo
        
        cfinal = capital * Math.pow((1 + tasa / 100), time);
        
        System.out.printf("El capital final es: %.2f %n", cfinal);
                          //Hasta aqu�
	    
        periodos = time / 3;
	     
        ganancia = cfinal - capital;
        
        capitalizacion = ganancia / periodos;
        
        System.out.printf("La capitalizaci�n ser� de un monto trimestral de: %.2f %n", capitalizacion);
        System.out.println("Hasta alcanzar los " + tiempo + " a�o/s");
	}
	
	

}
