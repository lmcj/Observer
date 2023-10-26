package Vistas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import modelo.Dato;
import java.util.List;

public class Tabla {

    private DefaultTableModel model;
    private JTable table;
    private JScrollPane scrollPane;
    private JFrame frame;

    public Tabla() {
        model = new DefaultTableModel();
        model.addColumn("Numero");
        model.addColumn("Sensor");
        model.addColumn("CO2");
        model.addColumn("NO2");
        model.addColumn("Opacimetro");

        table = new JTable(model);
        scrollPane = new JScrollPane(table);

        frame = new JFrame("Datos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }

    public void ImprimirTabla(List<Dato> datos) {
        model.setRowCount(0);
        int num = 0;
        for (Dato data : datos) {
            num++;
            model.addRow(new Object[]{num, data.getSensor(), data.getCO2(), data.getNO2(), data.getOpacimetro()});
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Tabla();
        });
    }
}

