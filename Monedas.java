import javax.swing.JOptionPane;

public class Moneda {

    public static void main(String[] args) { 
        
        //Declaracion de variables
        int r, n; //Respuesta, Cantidad de lanzamientos
        
        
        do{
            //Creacion del objeto de la clase Simulador
            Simulador monedas = new Simulador();
            
            //Llamado de los metodos de la clase
            double probabilidad = monedas.Probabilidad();
            monedas.Bienvenida(probabilidad); 
            
          
            //Ingreso de la cantidad de lanzamientos con tratamiento de excepciones
            do{
		try{
                  n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de veces que seran lanzadas las monedas: "));
                  
		}catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Valor Invalido");
                    continue;
		}
		if(n>0)break;
                    else
                System.out.println ("Valor incorrecto, debe ser mayor a 0\n");	
                
            }while(true);
           
            //Llamado de los metodos de la clase
            monedas.Lanzamiento(n);
            monedas.Resultado();
            
        
        r = JOptionPane.showConfirmDialog(null, "¿Deseas volver a lanzar?", "Alerta!", JOptionPane.YES_NO_OPTION);
        
        }while(r==0);
    }
}
