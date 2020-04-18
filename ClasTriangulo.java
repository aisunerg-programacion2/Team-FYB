import javax.swing.JOptionPane;


public class ClasTriangulo {

 
    
    
    double d12, d23, d13; //Distancias entre los puntos
    double p, sp, area; //Perimetro, semiperimetro y area
      
    //Metodo que calcula la distancia entre dos puntos
    public void Distancia(double p1x, double p1y, double p2x, double p2y, double p3x, double p3y){
      //La formula utilizada es D = ((x2-x1)^2 + (y2-y1)^2)^1/2
      
      d12 = Math.sqrt(Math.pow((p2x-p1x), 2)+Math.pow((p2y-p1y), 2)); //Distancia entre el pto 1 y 2
      d23 = Math.sqrt(Math.pow((p3x-p2x), 2)+Math.pow((p3y-p2y), 2)); //Distancia entre el pto 2 y 3
      d13 = Math.sqrt(Math.pow((p3x-p1x), 2)+Math.pow((p3y-p1y), 2)); //Distancia entre el pto 1 y 3
    }
    
    //Metodo que calcula es perimetro del triangulo
    public double Perimetro (){
        //La formula utilizada es P = suma de todos sus lados
        
        p = d12+d23+d13;
        return p;
     }
     
    //Metodo que calcula el semiperimero del triangulo
    public double Semiperimetro (double p){
        //La formuna utilizada es SP = p / 2
        
         sp = p/2;
         return sp;
     }
    
    //Metodo que calcula el araa del triangulo
    public double Area (){
        //La formula utilizada es A = [sp*((sp-l1)*(sp-l2)*(sp-l3))]^1/2
        
         area = Math.sqrt(sp*((sp-d12)*(sp-d23)*(sp-d13)));
         return area;
     }
    
    
    //Metodo que determina que tipo de triangulo es y muestra todos los resultados de las operaciones
    public void Mostrar (double p, double area){
        
        if (area!=0){ //Solo si el area es diferente de 0 se forma un triangulo   
            
         if (d12==d23 && d23==d13){ //Si todos los lados son iguales se trata de un triangulo equilatero
             
             JOptionPane.showMessageDialog(null, "Las coordenadas introducidas dan como resultado un triangulo equilatero"); 
         }else{  
           if (d12==d23 || d23==d13 || d13==d12){ //Si dos de los lados son iguales se trata de un triangulo isosceles
               
               JOptionPane.showMessageDialog(null, "Las coordenadas introducidas dan como resultado un triangulo isosceles"); 
           }else{
               if(d12!=d23 && d23!=d13 && d13!=d12){ // Si todos los lados son diferentes se trata de un triangulo escaleno
                   
                   JOptionPane.showMessageDialog(null, "Las coordenadas introducidas dan como resultado un triangulo escaleno"); 
               }
           }  
         }
            JOptionPane.showMessageDialog(null, "El perimetro de este triangulo es: "+p+" m");
            JOptionPane.showMessageDialog(null, "El area de este triangulo es: "+area+" m");
            
        }else{ //Si el area es 0 no se forma un triangulo
            
            JOptionPane.showMessageDialog(null, "Las coordenadas introducidas no forman un triangulo");
        }       
      
    }
     
}
