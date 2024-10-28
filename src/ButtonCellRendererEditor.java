import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableCellEditor;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonCellRendererEditor extends AbstractCellEditor implements TableCellRenderer, TableCellEditor, ActionListener {
    private JButton renderButton;
    private JButton editButton;
    private String text;
    private int filaActual;
    private int ColumnaActual;


    public ButtonCellRendererEditor() {
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
        ColumnaActual = column;
        editButton.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        return editButton;
    }

    @Override
    public Object getCellEditorValue() {
        return text;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        fireEditingStopped();
        if (filaActual == 2 && ColumnaActual == 2) {
            JOptionPane.showMessageDialog(null, "Botón especial presionado!");
        } else {
            JOptionPane.showMessageDialog(null, "Botón en fila " + filaActual + ", columna " + ColumnaActual + " presionado!");
        }
    }
}