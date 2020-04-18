import javax.swing.JOptionPane;


public class LanzamientoArriba {
        
       //Atributos de la clase    
       float hmax, tmax, tv, h; //Altura maxima, tiempo maximo, tiempo de vuelo, altura
       float g = 10; //Gravedad
       
       
       //Metodo que calcula el tiempo maximo
       public float TiempoMaximo (float v0){
          tmax = v0/g;
          return tmax;
       }
       
       //Metodo que calcula la la altura maxima
       public float AlturaMaxima (float v0, float tmax){
            hmax = (float) (-5*(Math.pow(tmax, 2))+v0*tmax);
            return hmax;
       }
       
       
       //Metodo que calcula el tiempo de vuelo
       public float TiempoVuelo (float tmax){
            tv = 2*tmax;
            return tv;
       }
       
       
       //Metodo que muestra todos los datos calculados anteriormente
        public void Datos (float hmax, float tmax, float tv){
            JOptionPane.showMessageDialog(null, "Altura Maxima:..."+hmax
            +"\nTiempo Maximo:..."+tmax
            +"\nTiempo de Vuelo:..."+tv, "Caida Libre", 1);
        }
          
        
        //Metodo que calcula y va mostrando la altura a la que se encuentra el objeto durante todo su recorrido 
        public void Altura(float v0, float tv){
            
            int con=0;
            for (double i=0; i<=tv; i+=0.5) {                
                h = (float) ((float) -5*(i*i)+(v0*i));
                System.out.println("Seg: "+i+" Altura: "+h);
                
                if(h==0){
                    con+=1;
                }
            }
            
              if(con==1) {
            	  h=(float) (-5*(Math.pow(tv, 2))+v0*tv);
            	  System.out.println("Seg: "+tv+" Altura: 0");
              }
        }
}
