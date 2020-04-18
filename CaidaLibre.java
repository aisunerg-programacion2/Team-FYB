import javax.swing.JOptionPane;

public class CaidaLibre {

    
    public static void main(String[] args) {
        
       int resp;
       float v0; //Velocidad inicial
      
       
	do{ 
               JOptionPane.showMessageDialog(null, "       Bienvenido al programa de Caida Libre\n"
       		+ "\n El programa le generara la distancia a la que se encuentra "
       		+ "\n un objeto del suelo durante cada segundo de vuelo\"");
       
       
            //Solicitud de la velocidad inicial utilizando tratamiento de excepciones
            do{
		try{
                    v0 = Float.parseFloat(JOptionPane.showInputDialog("Digite la velocidad con la que fue lanzado el objeto\n"
                        + "Expresada en metros sobre segundo"));
		}catch(NumberFormatException error){
                    JOptionPane.showMessageDialog(null, "Valor invalido", "Mensaje de Error", 0);
                    continue;
		}
		if(v0>0)break;
                    else
			JOptionPane.showMessageDialog(null, "debe ser mayor a 0", "Mensaje de Error", 0);	
            }while(true);
	
            
            //Creacion del objeto de la clase LanzamientoArriba
            LanzamientoArriba pelota = new LanzamientoArriba();
            
            //Llamado de los metodos de la clase
            float tmax = pelota.TiempoMaximo(v0);
            float hmax = pelota.AlturaMaxima(v0, tmax);
            float tv = pelota.TiempoVuelo(tmax);
            pelota.Datos(hmax, tmax, tv);
            pelota.Altura(v0, tv);
              
            resp = JOptionPane.showConfirmDialog(null, "¿Deseas ejecutar de nuevo?", "Alerta!", JOptionPane.YES_NO_OPTION);
           
       
       }while(resp==0);
        
            JOptionPane.showMessageDialog(null, "Ejecucion Finalizada", "Caida Libre", 1);
    }
    
}
