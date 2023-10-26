package Vistas;

//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import javax.swing.JFrame;
//import modelo.Dato;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.data.category.DefaultCategoryDataset;
//
//public class GraficaSensores extends JFrame {
//
//    public void Graficar(List<Dato> datos) {
//        Map<String, Integer> sensorCountMap = new HashMap<>();
//
//        for (Dato dato : datos) {
//            String sensorTipo = dato.getSensor();
//            sensorCountMap.put(sensorTipo, sensorCountMap.getOrDefault(sensorTipo, 0) + 1);
//        }
//
//        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
//
//        for (Map.Entry<String, Integer> entry : sensorCountMap.entrySet()) {
//            dataset.addValue(entry.getValue(), entry.getKey(), "");
//        }
//
//        JFreeChart barChart = ChartFactory.createBarChart(
//                "Datos enviados por Sensores",
//                "Sensores",
//                "Cantidad",
//                dataset,
//                PlotOrientation.VERTICAL,
//                true, true, false);
//
//        ChartPanel chartPanel = new ChartPanel(barChart);
//        setContentPane(chartPanel);
//
//        pack();
//        setVisible(true);
//
//        setSize(500, 500);
//        setLocation(100, 100);
//    }
//}
//import java.awt.GridLayout;
//import java.util.List;
//import javax.swing.*;
//import modelo.Dato;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PlotOrientation;
//import org.jfree.chart.plot.CategoryPlot;
//import org.jfree.chart.axis.NumberAxis;
//import org.jfree.data.category.DefaultCategoryDataset;
//
//public class GraficaSensores extends JFrame {
//
//    public void Graficar(List<Dato> datos) {
//        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
//        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();
//
//        for (Dato dato : datos) {
//            String sensorTipo = dato.getSensor();
//            dataset1.addValue(1, sensorTipo, "Cantidad");
//
//            dataset2.addValue(dato.getCO2(), sensorTipo, "CO2");
//            dataset2.addValue(dato.getNO2(), sensorTipo, "NO2");
//        }
//
//        JFreeChart barChart1 = ChartFactory.createBarChart(
//                "Datos de Sensores",
//                "Sensores",
//                "Cantidad",
//                dataset1,
//                PlotOrientation.VERTICAL,
//                true, true, false);
//
//        JFreeChart barChart2 = ChartFactory.createBarChart(
//                "CO2 y NO2 por Sensor",
//                "Sensores",
//                "Valor",
//                dataset2,
//                PlotOrientation.VERTICAL,
//                true, true, false);
//
//        CategoryPlot plot1 = barChart1.getCategoryPlot();
//        NumberAxis yAxis1 = (NumberAxis) plot1.getRangeAxis();
//        yAxis1.setRange(0, 10); // Establece el límite máximo en el eje Y de la primera gráfica
//
//        ChartPanel chartPanel1 = new ChartPanel(barChart1);
//        ChartPanel chartPanel2 = new ChartPanel(barChart2);
//
//        JPanel panel = new JPanel();
//        panel.setLayout(new GridLayout(1, 2));
//        panel.add(chartPanel1);
//        panel.add(chartPanel2);
//
//        setContentPane(panel);
//
//        pack();
//        setVisible(true);
//
//        setSize(1000, 500);
//        setLocation(100, 100);
//    }
//}
import java.awt.GridLayout;
import java.util.List;
import javax.swing.*;
import modelo.Dato;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficaSensores extends JFrame {

    public void Graficar(List<Dato> datos) {
        DefaultCategoryDataset dataset1 = new DefaultCategoryDataset();
        DefaultCategoryDataset dataset2 = new DefaultCategoryDataset();

        java.util.HashMap<String, Integer> sensorCountMap = new java.util.HashMap<>();

        for (Dato dato : datos) {
            String sensorTipo = dato.getSensor();
            sensorCountMap.put(sensorTipo, sensorCountMap.getOrDefault(sensorTipo, 0) + 1);

            dataset2.addValue(dato.getCO2(), sensorTipo, "CO2");
            dataset2.addValue(dato.getNO2(), sensorTipo, "NO2");
        }

        for (String sensorTipo : sensorCountMap.keySet()) {
            dataset1.addValue(sensorCountMap.get(sensorTipo), sensorTipo, "Cantidad Total");
        }

        JFreeChart barChart1 = ChartFactory.createBarChart(
                "Cantidad Total de Datos por Sensores",
                "Sensores",
                "Cantidad Total",
                dataset1,
                PlotOrientation.VERTICAL,
                true, true, false);

        JFreeChart barChart2 = ChartFactory.createBarChart(
                "CO2 y NO2 por Sensor",
                "Sensores",
                "Valor",
                dataset2,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel1 = new ChartPanel(barChart1);
        ChartPanel chartPanel2 = new ChartPanel(barChart2);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(chartPanel1);
        panel.add(chartPanel2);

        setContentPane(panel);

        pack();
        setVisible(true);

        setSize(1000, 500);
        setLocation(100, 100);
    }
}

