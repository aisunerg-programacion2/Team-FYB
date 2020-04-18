package proyectil;

import javax.swing.JOptionPane;


public class Lanzamiento {
    
      int i=6; //Vble del angulo de inclinacion
      double vo1=200, vo2=400, vo3=800;  //Vbles de velocidad inicial de los proyectiles
      double xmax1=0, xmax2=0, xmax3=0; //Vbles de alcance horizontal de los proyectilrd
      double voy1=0, voy2=0, voy3=0; //Vbles de velocidad en el eje y
      double vox1=0, vox2=0, vox3=0; //Vbles de velocidad en el eje x
      double tmax1=0,  tmax2=0,  tmax3=0;  //Vbles del tiempo que tarda al llegar a la altura max 
      double tv1=0, tv2=0, tv3=0; //Vbles de tiempo que tarda en el aire
      double t1=0, t2=0, t3=0; //Vbles de tiempo que tarda al llegar al blanco
      double g=9.8; //Vble de gravedad
      boolean p1=false, p2=false, p3=false; //Vbles de los proyectiles    
    
      
      
      
      
    //Metodo que calcula el alcance del primer proyectil con la variacion de angulo  
    public double AlcanceProyectil1 (double d){  
        
             do{
                 voy1= vo1*Math.sin(Math.toRadians(i)); //Formula Voy = vo*sin(°) => Voy = 200*sin(6°-90°)
                 vox1= vo1*Math.cos(Math.toRadians(i)); //Formula Vox = vo*cos(°) => Voy = 200*cos(6°-90°)
                 tmax1 = -(voy1)/-g; //Formula Tmax = -(Voy)/-9.8
                 tv1= 2*tmax1; //Formula Tv = 2*tmax
                 xmax1 = vox1*tv1; //Formula Xmax = Xo+Vox*tv
                 t1 = d/vox1; //Formula T = Xf-Xo/Vox
                 
                 if(xmax1>=d){
                     p1=true;
                     break;
                 }

                 i++;
                 
             }while(d>xmax1 && i<=90); 
              
              return xmax1;
    }   
    
    
    //Metodo que calcula el alcance del segundo proyectil con la variacion de angulo  
    public double AlcanceProyectil2 (double d, double xmax1){ 
        
            if (xmax1<d){ //Solo se realizara este proceso si el proyectil 1 no llega el blanco
                i=6;
            do{
                 voy2= vo2*Math.sin(Math.toRadians(i));//Formula Voy = vo*sin(°) => Voy = 400*sin(6°-90°)
                 vox2= vo2*Math.cos(Math.toRadians(i)); //Formula Vox = vo*cos(°) => Voy = 400*cos(6°-90°)
                 tmax2 = -(voy2)/-g; //Formula Tmax = -(Voy)/-9.8
                 tv2= 2*tmax2; //Formula Tv = 2*tmax
                 xmax2 = vox2*tv2; //Formula Xmax = Xo+Vox*tv
                 t2 = d/vox2; //Formula T = Xf-Xo/Vox
                 
                 if(xmax2>=d){
                     p2=true;
                     break;
                 }

                 i++;
                 
            
               }while(d>xmax2 && i<=90);
                   
            }
            return xmax2;
    }       
    
    
    //Metodo que calcula el alcance del tercer proyectil con la variacion de angulo  
     public double AlcanceProyectil3 (double d, double xmax1, double xmax2){
         
     
            if (xmax1<d && xmax2<d){ //Solo se realizara este proceso si los proyectiles 1 y 2 no llegan el blanco
                i=6;
            do{
                 voy3= vo3*Math.sin(Math.toRadians(i)); //Formula Voy = vo*sin(°) => Voy = 800*sin(6°-90°)
                 vox3= vo3*Math.cos(Math.toRadians(i)); //Formula Vox = vo*cos(°) => Voy = 800*cos(6°-90°)
                 tmax3 = -(voy3)/-g; //Formula Tmax = -(Voy)/-9.8
                 tv3= 2*tmax3; //Formula Tv = 2*tmax
                 xmax3 = vox3*tv3; //Formula Xmax = Xo+Vox*tv
                 t3 = d/vox3; //Formula T = Xf-Xo/Vox
                 
                 if(xmax3>=d){
                     p3=true;
                     break;
                 }

                 i++;
                 
            
              }while(d>xmax3 && i<=90);
                   
             }
            return xmax3;
     }
     
     
     
     //Metodo que muestra cual proyectil deberia ser utilizado para llegar al blanco
     public void ResultadoLamzam (){
            
            if (p1==true && p2==false && p3==false){
             
                JOptionPane.showMessageDialog(null, "El proyectil necesario para llegar al blanco es el primero, el mas economico que tiene una velocidad inicial de 200m/s ");
                JOptionPane.showMessageDialog(null, "El angulo de inclinacion de dicho proyectil para que pueda llegar al blanco debera ser "+i+"°");
                JOptionPane.showMessageDialog(null, "El tiempo que tardara en llegar al banco es de "+t1+"seg");
                
            }else if (p1==false && p2==true && p3==false){
             
                JOptionPane.showMessageDialog(null, "El proyectil necesario para llegar al blanco es el segundo, que es un poco costoso y tiene una velocidad inicial de 400m/s ");
                JOptionPane.showMessageDialog(null, "El angulo de inclinacion de dicho proyectil para que pueda llegar al blanco debera ser "+i+"°");
                JOptionPane.showMessageDialog(null, "El tiempo que tardara en llegar al banco es de "+t2+"seg");
                
            }else if (p1==false && p2==false && p3==true){
               
                JOptionPane.showMessageDialog(null, "El proyectil necesario para llegar al blanco es el tercero, el mas costoso que tiene una velocidad inicial de 800m/s ");
                JOptionPane.showMessageDialog(null, "El angulo de inclinacion de dicho proyectil para que pueda llegar al blanco debera ser "+i+"°");
                JOptionPane.showMessageDialog(null, "El tiempo que tardara en llegar al banco es de "+t3+"seg");
                
            }if (p1==false && p2==false && p3==false){
                
                JOptionPane.showMessageDialog(null, "Lo sentimos pero ningun proyectil llega a la distancia solicitada ");
                
            }
            
     }
}
