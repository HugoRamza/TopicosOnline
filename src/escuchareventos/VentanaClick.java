package escuchareventos;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/** 
 * Creación de una ventana
 * Escuchando el clic en la ventana con un MouseAdapter
 * 
 */
public class VentanaClick extends JFrame {
    private JPanel contentPane;

    public VentanaClick() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Click dentro de la ventana");
            }
        });
    }

    public static void main(String[] args) {
        VentanaClick frame = new VentanaClick();
        frame.setVisible(true);
    }
}
