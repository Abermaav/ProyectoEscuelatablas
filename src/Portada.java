import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Portada extends JFrame implements ActionListener  {
    Border bordo1 = BorderFactory.createLineBorder(new Color(186, 186, 186), 1);
    Border bordo2 = BorderFactory.createLineBorder(new Color(139, 154, 177), 2);
    Border bordo3 = BorderFactory.createLineBorder(new Color(0, 0, 0), 2);

    private   double IMC;
    private JPanel p2;
    private JPanel p3;
    private JButton mostrarIMC, salir;
    private JTable tabla1, tabla2;
    public JTextArea porciones;
    private JTextField nombre, edad, peso, altura;
    private JLabel etiNombre, etiEdad, etiPeso, etiAltura, etiIMC, img1, img2;
    Portada(){
        setSize(1150, 800);
        getContentPane().setBackground(new java.awt.Color(214, 221, 255));
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        ImageIcon icono1 = new ImageIcon("src/iemece.png");
        Image imagen1 = icono1.getImage().getScaledInstance(480, 320, Image.SCALE_SMOOTH);
        ImageIcon IMCicon = new ImageIcon(imagen1);


        JPanel p1 = new JPanel();
        p1.setBounds(10,10,500, 400);
        p1.setLayout(null);
        add(p1);
        p2= new JPanel();
        p2.setBounds(10, 420, 500, 340);
        p2.setLayout(null);
        add(p2);
        p3= new JPanel();
        p3.setBounds(520, 10, 620, 750);
        p3.setLayout(null);
        add(p3);

        etiNombre = new JLabel("Inserte nombre:");
        p1.add(etiNombre);
       etiNombre.setBounds(30,1,100,50);

       etiEdad = new JLabel("Inserte edad:");
        etiEdad.setBounds(300,1,100,50);
        p1.add(etiEdad);

        etiPeso = new JLabel("Inserte peso (Kg) :");
        etiPeso.setBounds(30,65,130,50);
        p1.add(etiPeso);

        etiAltura = new JLabel("Inserte altura (Mts) :");
        etiAltura.setBounds(300,65,130,50);
        p1.add(etiAltura);


        nombre = new JTextField();
        nombre.setBounds(25, 40, 250, 30);
        nombre.setBorder(bordo1);
        p1.add(nombre);

        edad = new JTextField();
        edad.setBounds(295, 40, 85, 30);
        edad.setBorder(bordo1);
        p1.add(edad);

        peso = new JTextField();
        peso.setBounds(25, 100, 88, 30);
        p1.add(peso);

        altura = new JTextField();
        altura.setBounds(295, 100, 95, 30);
        p1.add(altura);

        mostrarIMC = new JButton("Mostrar IMC");
        mostrarIMC.setBounds(30,140,150,50);
        p1.add(mostrarIMC);
        mostrarIMC.addActionListener(this);

        img1 = new JLabel();
        img1.setBounds(10, 1, 490, 340);
        img1.setIcon(IMCicon);
        p2.add(img1);

        img2 = new JLabel();
        img2.setBounds(200, 140, 290, 240);
        p1.add(img2);

        etiIMC = new JLabel("IMC:");
        etiIMC.setBounds(30, 200, 150, 50);
        etiIMC.setBorder(bordo2);
        etiIMC.setBackground(new Color(255, 255, 255));
        etiIMC.setOpaque(true);
        p1.add(etiIMC);

        salir = new JButton("<html><font color='red'>Salir</font></html>");
        salir.setBounds(30, 280, 150, 50);
        salir.addActionListener(this);
        p1.add(salir);

        porciones = new JTextArea();
        porciones.setBounds(10, 370, 600,300);
        porciones.setBorder(bordo2);
        porciones.setEditable(false);
        p3.add(porciones);

        DefaultTableModel modelo = new DefaultTableModel(5, 7) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return true;
            }
        };
        tabla1 = new JTable(modelo);
        tabla1.setBounds(10, 30, 600, 300);
        tabla1.setRowHeight(60);
        modelo.setValueAt("<html><div style='text-align: center;'>Desayuno<br><br> 7:00-9:00</div></html>", 0, 0);
        modelo.setValueAt("<html><div style='text-align: center;'>Colacion<br><br> 10:00-11:00</div></html>", 1, 0);
        modelo.setValueAt("<html><div style='text-align: center;'>Comida<br><br> 13:00-15:00</div></html>", 2, 0);
        modelo.setValueAt("<html><div style='text-align: center;'>Merienda<br><br> 16:00-17:00</div></html>", 3, 0);
        modelo.setValueAt("<html><div style='text-align: center;'>Cena<br><br> 19:00-20:00</div></html>", 4, 0);

        modelo.setValueAt("<html><div style='text-align: center;'>Desayuno<br><br> 7:00-9:00</div></html>", 0, 1);
        modelo.setValueAt("<html><div style='text-align: center;'>Colacion<br><br> 10:00-11:00</div></html>", 1, 1);
        modelo.setValueAt("<html><div style='text-align: center;'>Comida<br><br> 13:00-15:00</div></html>", 2, 1);
        modelo.setValueAt("<html><div style='text-align: center;'>Merienda<br><br> 16:00-17:00</div></html>", 3, 1);
        modelo.setValueAt("<html><div style='text-align: center;'>Cena<br><br> 19:00-20:00</div></html>", 4, 1);

        modelo.setValueAt("<html><div style='text-align: center;'>Desayuno<br><br> 7:00-9:00</div></html>", 0, 2);
        modelo.setValueAt("<html><div style='text-align: center;'>Colacion<br><br> 10:00-11:00</div></html>", 1, 2);
        modelo.setValueAt("<html><div style='text-align: center;'>Comida<br><br> 13:00-15:00</div></html>", 2, 2);
        modelo.setValueAt("<html><div style='text-align: center;'>Merienda<br><br> 16:00-17:00</div></html>", 3, 2);
        modelo.setValueAt("<html><div style='text-align: center;'>Cena<br><br> 19:00-20:00</div></html>", 4, 2);

        modelo.setValueAt("<html><div style='text-align: center;'>Desayuno<br><br> 7:00-9:00</div></html>", 0, 3);
        modelo.setValueAt("<html><div style='text-align: center;'>Colacion<br><br> 10:00-11:00</div></html>", 1, 3);
        modelo.setValueAt("<html><div style='text-align: center;'>Comida<br><br> 13:00-15:00</div></html>", 2, 3);
        modelo.setValueAt("<html><div style='text-align: center;'>Merienda<br><br> 16:00-17:00</div></html>", 3, 3);
        modelo.setValueAt("<html><div style='text-align: center;'>Cena<br><br> 19:00-20:00</div></html>", 4, 3);

        modelo.setValueAt("<html><div style='text-align: center;'>Desayuno<br><br> 7:00-9:00</div></html>", 0, 4);
        modelo.setValueAt("<html><div style='text-align: center;'>Colacion<br><br> 10:00-11:00</div></html>", 1, 4);
        modelo.setValueAt("<html><div style='text-align: center;'>Comida<br><br> 13:00-15:00</div></html>", 2, 4);
        modelo.setValueAt("<html><div style='text-align: center;'>Merienda<br><br> 16:00-17:00</div></html>", 3, 4);
        modelo.setValueAt("<html><div style='text-align: center;'>Cena<br><br> 19:00-20:00</div></html>", 4, 4);

        modelo.setValueAt("<html><div style='text-align: center;'>Desayuno<br><br> 7:00-9:00</div></html>", 0, 5);
        modelo.setValueAt("<html><div style='text-align: center;'>Colacion<br><br> 10:00-11:00</div></html>", 1, 5);
        modelo.setValueAt("<html><div style='text-align: center;'>Comida<br><br> 13:00-15:00</div></html>", 2, 5);
        modelo.setValueAt("<html><div style='text-align: center;'>Merienda<br><br> 16:00-17:00</div></html>", 3, 5);
        modelo.setValueAt("<html><div style='text-align: center;'>Cena<br><br> 19:00-20:00</div></html>", 4, 5);

        modelo.setValueAt("<html><div style='text-align: center;'>Desayuno<br><br> 7:00-9:00</div></html>", 0, 6);
        modelo.setValueAt("<html><div style='text-align: center;'>Colacion<br><br> 10:00-11:00</div></html>", 1, 6);
        modelo.setValueAt("<html><div style='text-align: center;'>Comida<br><br> 13:00-15:00</div></html>", 2, 6);
        modelo.setValueAt("<html><div style='text-align: center;'>Merienda<br><br> 16:00-17:00</div></html>", 3, 6);
        modelo.setValueAt("<html><div style='text-align: center;'>Cena<br><br> 19:00-20:00</div></html>", 4, 6);

        ButtonCellRendererEditor buttonRendererEditor = new ButtonCellRendererEditor(porciones, this);
        tabla1.setDefaultRenderer(Object.class, buttonRendererEditor);
        tabla1.setDefaultEditor(Object.class, buttonRendererEditor);
        tabla1.setBorder(bordo3);
        p3.add(tabla1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == mostrarIMC) {
        if(nombre.getText().equals("") && edad.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Por favor ingrese todos los datos solicitados");
        }
        else {
                double peso1 = Double.parseDouble(peso.getText());
                double altura1 = Double.parseDouble(altura.getText());
                IMC = peso1 / (altura1 * altura1);
                String IMC2 = String.format("%.3f",IMC );
                etiIMC.setText("IMC: " + IMC2);
                if (IMC <= 18.5) {
                    ImageIcon icono2 = new ImageIcon("src/esqueleto.png");
                    Image imagen2 = icono2.getImage().getScaledInstance(290, 240, Image.SCALE_SMOOTH);
                    ImageIcon calaca = new ImageIcon(imagen2);
                    img2.setIcon(calaca);

                }

                if (IMC >= 25.0) {
                    ImageIcon icono2 = new ImageIcon("src/calabaza.png");
                    Image imagen2 = icono2.getImage().getScaledInstance(290, 240, Image.SCALE_SMOOTH);
                    ImageIcon calabaza = new ImageIcon(imagen2);
                    img2.setIcon(calabaza);

                }

                if (IMC >= 18.5 && IMC <= 25.0) {
                    ImageIcon icono2 = new ImageIcon("src/fantasma.png");
                    Image imagen2 = icono2.getImage().getScaledInstance(290, 240, Image.SCALE_SMOOTH);
                    ImageIcon fantasma = new ImageIcon(imagen2);
                    img2.setIcon(fantasma);
                }
        }
        }
        if (evento.getSource() == salir) {
            dispose();
        }
    }
    public double getIMC() {
        return IMC;
    }
}

