package parcial1.guibasicas;

import javax.swing.*;

public class BarraProgresoFor extends JFrame {

 static JFrame       ventana;
 static JProgressBar barra;
 static JPanel       panel;

 public static void main (String args[]) {

     ventana = new JFrame("Ejemplo de Barra de Progreso");
     panel   = new JPanel();
     barra   = new JProgressBar();

     barra.setValue(0);
     barra.setStringPainted(true);

     panel.add(barra);

     ventana.add(panel);
     ventana.setBounds(500, 400, 500, 200);
     ventana.setVisible(true);


     int i = 0;
     try {
         while (i <= 100) {
             Thread.sleep(800);
             i += 10;
             barra.setValue(i);
         }
     }
     catch (Exception e) {
         System.err.println( e.getMessage() );
     }
}

}