package escuchareventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.*;

/** 
 * Creación de una ventana y un botón
 * ActionListener en el botón
 * 
 */
public class VentanaBotonActionListener extends JFrame
                                        implements ActionListener{
    private JPanel pnlContenido;

    public static void main(String[] args) {
        VentanaBotonActionListener winVentana = new VentanaBotonActionListener();
        winVentana.setVisible(true);
    }


    public VentanaBotonActionListener() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        JButton btnAceptar = new JButton("Aceptar");

        pnlContenido = new JPanel();
        pnlContenido.setBorder(new EmptyBorder(5,5,5,5));
        pnlContenido.setLayout(null);
        pnlContenido.add(btnAceptar);
        setContentPane(pnlContenido);

        btnAceptar.setBounds(180,178,97,30);
        btnAceptar.addActionListener(this);
    }


    public void actionPerformed(ActionEvent e) {
        System.out.println("Click en botón aceptar");
    }
}
