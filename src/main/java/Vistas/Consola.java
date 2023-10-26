package Vistas;

import javax.swing.table.DefaultTableModel;
import modelo.Dato;
import java.util.List;

public class Consola {

    private DefaultTableModel model;

    public Consola() {
        model = new DefaultTableModel();
        model.addColumn("Numero");
        model.addColumn("Sensor");
        model.addColumn("CO2");
        model.addColumn("NO2");
        model.addColumn("Opacimetro");
    }

    public void Imprimir(List<Dato> datos) {
        model.setRowCount(0); // Limpiar el modelo
        int Num = 0;
        // Llenar modelo con datos
        for (Dato data : datos) {
            Num += 1;
            model.addRow(new Object[]{Num, data.getSensor(), data.getCO2(), data.getNO2(), data.getOpacimetro()});
        }

        System.out.println("Datos:");

        // Imprimir encabezados
        System.out.printf("%-10s%-40s%-40s%-40s%-40s\n", "Numero", "Sensor", "CO2", "NO2", "Opacimetro");

        // Imprimir datos de la tabla
        for (int i = 0; i < model.getRowCount(); i++) {
            System.out.printf("%-10s%-40s%-40s%-40s%-40s\n",
                    model.getValueAt(i, 0),
                    model.getValueAt(i, 1),
                    model.getValueAt(i, 2),
                    model.getValueAt(i, 3),
                    model.getValueAt(i, 4));
        }
    }
}
