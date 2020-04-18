import javax.swing.JOptionPane;

public class Proyectil {

  
    public static void main(String[] args) {
          
      int r; //Variable para continuar o detener 
      double d; //Vble para la distancia  
      double a1, a2, a3; //Vbles del alcance de los proyectiles
      
      
     do{
         
         do{ //Entrada de la distancia del blanco con tratamiento de excepciones
		try{
                    d = Double.parseDouble(JOptionPane.showInputDialog("Bienvenido al programa tiro al blanco\n"
                        + "Por favor ingrese la distancia del blanco expresada en metros"));
                    
		}catch(NumberFormatException error){
                    
                    JOptionPane.showMessageDialog(null, "Valor invalido", "Mensaje de Error", 0);
                    continue;
		}
		if(d>0)break;
                else
                    
                    JOptionPane.showMessageDialog(null, "La distancia debe ser mayor a 0", "Mensaje de Error", 0);	
	}while(true);
     
         
         //Creacion del objeto del clase Lanzamiento
         Lanzamiento proyect = new Lanzamiento();
         
         //Llamado de los metodos de la clase Lanzamiento
         a1= proyect.AlcanceProyectil1(d);
         a2= proyect.AlcanceProyectil2(d,a1);
         a3= proyect.AlcanceProyectil3(d,a1,a2);   
         proyect.ResultadoLamzam();
           
        
         r = Integer.parseInt(JOptionPane.showInputDialog("¿Desea volver a ejecutar? \n"
          + "1:Si   2:No "));
         
     }while (r==1);  
         
         
         
         
      
      

       

      
}}
