import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Portada extends JFrame {
    Border bordo = BorderFactory.createLineBorder(Color.BLACK, 2);

    private JButton guardar, salir, dieta;
    private JPanel p1, p2, p3;
    private JLabel titulo, nombre, edad, peso, altura, imc, resultado, t1, t2, t3;

    Portada(){
        setSize(1000, 800);
        getContentPane().setBackground(new java.awt.Color(214, 221, 255));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setVisible(true);

        p1 = new JPanel();
        p1.setBounds(10,10,500, 400);
        add(p1);
        p2= new JPanel();
        p2.setBounds(10, 420, 500, 340);
        add(p2);
        p3= new JPanel();
        p3.setBounds(520, 10, 470, 750);
        add(p3);



    }
}


