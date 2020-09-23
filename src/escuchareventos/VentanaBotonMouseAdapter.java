package escuchareventos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.*;

/** 
 * Creación de una ventana y un botón
 * MouseAdapter en el botón
 * 
 */
public class VentanaBotonMouseAdapter extends JFrame {

    private JPanel pnlContenido;

    public static void main(String[] args) {
        VentanaBotonMouseAdapter winVentana = new VentanaBotonMouseAdapter();
        winVentana.setVisible(true);
    }


    public VentanaBotonMouseAdapter() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        JButton btnAceptar = new JButton("Aceptar");

        pnlContenido = new JPanel();
        pnlContenido.setBorder(new EmptyBorder(5,5,5,5));
        pnlContenido.setLayout(null);
        pnlContenido.add(btnAceptar);
        setContentPane(pnlContenido);

        btnAceptar.setBounds(180,178,97,30);
        btnAceptar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Click en botón Aceptar");
            }
        });
    }

}
