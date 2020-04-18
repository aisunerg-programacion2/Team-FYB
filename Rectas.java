public class Rectas {
    
    float Pen1, Pen2;
    int A, B;
    
    
                 public float Pendiente1 (float Y[], float X[]){
			Pen1=((Y[1]-Y[0]/X[1]-X[0]));
			return Pen1;
                  }	
                 
                 
                 public float Pendiente2 (float YY[], float XX[]){
                     Pen2=((YY[1]-YY[0])/(XX[1]-XX[0]));
                     return Pen2;
                 }
              
                 
                public void Cambio ( float m[], float b[]){   
			if(m[1]==0){A=1;}else{if(m[1]>0){A=-1;}else{A=-1;}}
			if(b[0]==0){B=1;}else{if(b[0]>0){B=-1;}else{B=-1;}}
                }
                
                public void Resultado (float m[], float b[], float Pen1, float Pen2){  
                    
			if(Pen1==Pen2) {
				System.out.println("Sus rectas son Paralelas!");
			}else{
				System.out.println("Sus rectas son Secantes");
  			
				float X2=(B*b[0])+b[1];   			
				float X1=m[0]+(A*m[1]);
				float X3=X2/X1;
				float Y1=m[0]*X3+b[0];
				System.out.println("Punto de Interseccion ("+X3+","+Y1+")");
			}
                }
             
}
