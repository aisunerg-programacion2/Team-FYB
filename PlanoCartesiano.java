import java.util.Scanner;

public class PlanoCartesianoM {

   
    public static void main(String[] args) {
        
       Scanner leer=new Scanner(System.in);
       
		int R=1, con=1;
		float P1, P2;
		float X[]= new float[2];
		float XX[]= new float[2];
		float Y[]= new float[2];
		float YY[]= new float[2];
		float m[]=new float[2]; 
		float b[]= new float[2];
		
		while(R==1){
  		
			System.out.println("¡Bienvenido!");  		
			System.out.println("La formula de una recta es la siguiente:\n y=mx+b\n");	
				//Aqui se ingresan los datos de las formulas "m" y "b"
			for(int j=0 ; j<=1; j++) {
				System.out.println("Porfavor ingresa los datos de la recta nmro "+con+"Â°");
				System.out.println("Valor de m");
				m[j]=leer.nextFloat();
				System.out.println("Valor de b");
				b[j]=leer.nextFloat();
				System.out.println("Ahora se determinaran los puntos para conformar la recta");
				if(con==1){
					//Aqui se determinan los puntos dandole valor  Y mediante la formula y X
					for(int i=0 ; i<=1; i++){
						System.out.print("Ingrese el valor de X:  ");
  	    					X[i]=leer.nextFloat();
  	    					Y[i]=(m[j]*X[i])+b[j];
  	    					if(i==1) {
  	    						System.out.println("Pnto1 ("+X[0]+","+Y[0]+") Pnto2 ("+X[1]+","+Y[1]+")\n");
  	    					}
					}
				}else{
					for(int i=0 ; i<=1; i++){
  	  	    			System.out.println("Ingrese el valor de X:  ");
  	  	    			XX[i]=leer.nextFloat();
  	  	    			YY[i]=(m[j]*X[i])+b[j];
  	  	    		if(i==1) {
  						System.out.println("Pnto3 ("+XX[0]+","+YY[0]+") Pnto4 ("+XX[1]+","+YY[1]+")\n");
  					}
					}  	    		
				}
				
				con++;
			}
			con=con-2;
			
			
                        Rectas calculo = new Rectas();
                        
                       P1 = calculo.Pendiente1(Y, X);
                       P2 = calculo.Pendiente2(YY, XX);
			//Metodo Cambio se encarga de cambiar los signos, simulando el despeje.
                       calculo.Cambio(m, b);
			//Determina mediante las pendientes y valores de las formulas la posicion relativa de las rectas
                       calculo.Resultado(m, b, P1, P2);
                        
			System.out.println("Desea calcular otras rectas? 1=Si");
			R=leer.nextInt();
					
		
		}
		System.out.println("¡Hasta luego!");
      
      
	 }
}
