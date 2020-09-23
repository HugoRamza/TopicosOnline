package escuchareventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.*;

/** 
 * Creación de una ventana y un botón
 * MouseListener en el botón
 * 
 */
public class VentanaBotonMouseListener extends JFrame
                                       implements MouseListener{
    private JPanel pnlContenido;

    public static void main(String[] args) {
        VentanaBotonMouseListener win_Ventana = new VentanaBotonMouseListener();
        win_Ventana.setVisible(true);
    }


    public VentanaBotonMouseListener() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        JButton btnAceptar = new JButton("Aceptar");

        pnlContenido = new JPanel();
        pnlContenido.setBorder(new EmptyBorder(5,5,5,5));
        pnlContenido.setLayout(null);
        pnlContenido.add(btnAceptar);
        setContentPane(pnlContenido);

        btnAceptar.setBounds(180,178,97,30);
        btnAceptar.addMouseListener(this);
    }


    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }
}
