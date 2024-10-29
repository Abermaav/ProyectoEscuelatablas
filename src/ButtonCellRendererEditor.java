import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ButtonCellRendererEditor extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener {
    private final JButton renderButton;
    private final JButton editButton;
    private String text;
    private int filaActual;
    private final JTextArea porciones;
    private final Portada portada;




    public ButtonCellRendererEditor(JTextArea porciones, Portada portada) {
        this.porciones = porciones;
        this.portada = portada;
        renderButton = new JButton();
        editButton = new JButton();
        editButton.setFocusPainted(false);
        editButton.addActionListener(this);
    }


    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        if (value == null) {
            renderButton.setText("");
        } else {
            renderButton.setText(value.toString());
        }
        renderButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return renderButton;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        if (value == null) {
            editButton.setText("");
        } else {
            editButton.setText(value.toString());
        }
        text = value != null ? value.toString() : "";
        filaActual = row;
        editButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return editButton;
    }

    @Override
    public Object getCellEditorValue() {
        return text;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        double imc = portada.getIMC();
        Dietas dietas = new Dietas(imc);
        Random random = new Random();
        int dietarandom = random.nextInt(3);
        if (imc == 0.00) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese los datos solicitados para calcular su IMC y obtener su dieta");
        } else {
            if (filaActual == 0) {
                String[] desayuno = dietas.getDesayuno();
                String dieta = desayuno[dietarandom];
                porciones.setText(dieta);
            }
            if (filaActual == 1) {
                String[] colacion = dietas.getColacion();
                String dieta = colacion[dietarandom];
                porciones.setText(dieta);
            }
            if (filaActual == 2) {
                String[] comida = dietas.getComida();
                String dieta = comida[dietarandom];
                porciones.setText(dieta);
            }
            if (filaActual == 3) {
                String[] merienda = dietas.getMerienda();
                String dieta = merienda[dietarandom];
                porciones.setText(dieta);
            }
            if (filaActual == 4) {
                String[] cena = dietas.getCena();
                String dieta = cena[dietarandom];
                porciones.setText(dieta);
            }
        }
            fireEditingStopped();
        }
}