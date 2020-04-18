import java.util.Random;

import javax.swing.JOptionPane;

public class Simulador {
    
    //Creacion de objeto Ramdom
    Random moneda = new Random();
    
    //Atributos de la clase
    int Mon1=1, Mon2=1, Mon3=1, Mon4=1, iguales; //Las cuatro monedas y el contador de igualdad
    double  Pm = 50; //Probabilidad de que salga cara o cruz es 50 y 50
    double Probabilidad; 
      
    
    //Metodo que calcula la probabilidad de que todas las monedas salgan iguales 
    public double Probabilidad (){
        Probabilidad =  Pm / (Mon1+Mon2+Mon3+Mon4); //
        return Probabilidad;
    }
      
    //Metodo que muestra la bienvenida y la probabilidad calculada  
    public void Bienvenida (double Probabilidad){
        JOptionPane.showMessageDialog(null, "         Bienvenidooos a Simulor de lanzamiento de 4 monedas\n"
        + "La probabilidad de que las 4 monedas salgan iguales es de un "+Probabilidad+"% - 100%");
    }
      
    
    //Metodo que calcula y muestra los resultados de los lanzamientos
    public void Lanzamiento (int n){
        
       iguales=0;
       System.out.println("Los resultados de los lanzamientos son: ");
       System.out.println("\n 0 = Cara \n 1 = Sello");
            
       for (int i=1 ; i<=n ; i++){
        
            Mon1 = moneda.nextInt(2);
            Mon2 = moneda.nextInt(2);  
            Mon3 = moneda.nextInt(2);
            Mon4 = moneda.nextInt(2);
                
            System.out.println("Lanzamiento "+i+" : "+Mon1+"-"+Mon2+"-"+Mon3+"-"+Mon4);
              
            if (Mon1==Mon2 && Mon2==Mon3 && Mon3==Mon4 && Mon4==Mon1 && Mon1==Mon3 && Mon2==Mon4){
                iguales++; 
            }
        }
    }
      
    
    //Metodo que muestra cuantas veces salieron iguales las monedas
    public void Resultado (){
        
        JOptionPane.showMessageDialog(null, "Las veces que todas salieron iguales fue "+iguales);
    }
    
}
