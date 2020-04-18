import javax.swing.JOptionPane;

public class Triangulo {

    public static void main(String[] args) {
        
       //Declaracion de variables 
       double p1x, p1y, p2x, p2y, p3x, p3y; //Vbles de las coordenadas x y de los 3 puntos
       int r;
       
       
       do{
            JOptionPane.showMessageDialog(null, "Bienvenido al programa de super triangulos\n"
            + "A continuacion debera ingresar las coordenadas de los puntos del triangulo en metros");
       
            //Entrada de las coordenadas de los puntos
            p1x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x del punto 1"));
            p1y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y del punto 1"));
            p2x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x del punto 2"));
            p2y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y del punto 2"));
            p3x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x del punto 3"));
            p3y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y del punto 3"));
    
            //Creacion del objeto del ClaseTriangulo
            ClasTriangulo Operaciones = new ClasTriangulo ();
            
            //Llamado de los metodos de la ClaseTriangulo
            Operaciones.Distancia(p1x, p1y, p2x, p2y, p3x, p3y); 
            double per = Operaciones.Perimetro();
            double semi = Operaciones.Semiperimetro(per);
            double area = Operaciones.Area();
            Operaciones.Mostrar(per,area);
            
            
            JOptionPane.showMessageDialog(null, "Fin del proceso");
            r = Integer.parseInt(JOptionPane.showInputDialog("¿Desea volver a ejecutar? \n"
                    + "Presiones 1 para continuar y 2 para finalizar"));

       }while(r==1);
    }
    
}
