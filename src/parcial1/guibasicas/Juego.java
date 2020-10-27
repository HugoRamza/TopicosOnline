package parcial1.guibasicas;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.*;

public class Juego extends JFrame implements ActionListener{

    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,bnuevo;

    public static void main(String[] args){
        new Juego();
    }


    Juego() {

        b1=new JButton("1");
        b2=new JButton(" ");
        b3=new JButton("8");
        b4=new JButton("5");
        b5=new JButton("4");
        b6=new JButton("6");
        b7=new JButton("2");
        b8=new JButton("3");
        b9=new JButton("7");

        b1.setFont(new Font("Arial Black", Font.BOLD, 20));
        b2.setFont(new Font("Arial Black", Font.BOLD, 20));
        b3.setFont(new Font("Arial Black", Font.BOLD, 20));
        b4.setFont(new Font("Arial Black", Font.BOLD, 20));
        b5.setFont(new Font("Arial Black", Font.BOLD, 20));
        b6.setFont(new Font("Arial Black", Font.BOLD, 20));
        b7.setFont(new Font("Arial Black", Font.BOLD, 20));
        b8.setFont(new Font("Arial Black", Font.BOLD, 20));
        b9.setFont(new Font("Arial Black", Font.BOLD, 20));

        b1.setBounds(10,30,100,100);
        b2.setBounds(110,30,100,100);
        b3.setBounds(210,30,100,100);
        b4.setBounds(10,130,100,100);
        b5.setBounds(110,130,100,100);
        b6.setBounds(210,130,100,100);
        b7.setBounds(10,230,100,100);
        b8.setBounds(110,230,100,100);
        b9.setBounds(210,230,100,100);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        add(b1);add(b2);add(b3);
        add(b4);add(b5);add(b6);
        add(b7);add(b8);add(b9);

        bnuevo=new JButton("Nuevo");
        bnuevo.setBounds(10,350,300,50);
        bnuevo.addActionListener(this);
        bnuevo.setFont(new Font("Arial Black", Font.BOLD, 20));
        add(bnuevo);

        setTitle("Rompecabezas");
        setBounds(700, 400, 340, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void actionPerformed(ActionEvent evento){

       if(evento.getSource()==bnuevo){
           JOptionPane.showMessageDialog(Juego.this,"Nuevo Juego");
       }


       if (evento.getSource()==b1) {
           String s = b1.getText();

           if (b2.getText().equals(" ")) {
                   b2.setText(s);
                   b1.setText(" ");
           } else if (b4.getText().equals(" ")) {
                   b4.setText(s);
                   b1.setText(" ");
           }


       if ( b1.equals("1") && b2.equals("2") && b3.equals("3") &&
            b4.equals("4") && b5.equals("5") && b6.equals("6") &&
            b7.equals("7") && b8.equals("8") && b9.equals("9")) {
           JOptionPane.showMessageDialog(Juego.this,"Ganaste");
       }

       }


    }

}
