package controlador;

import dominio.InformeConsola;
import dominio.InformeGraficos;
import dominio.InformeTabla;
import factory.GenerarDatosFactory;
import factory.GestionFactory;
import factory.InformeFactory;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import modelo.Dato;
import modelo.GenerarDatos;
import patronObserver.Gestion;
import patronObserver.Informe;

public class Controlador {

    private Gestion<Dato> dataSource;
    private GenerarDatos generarDatos;
    private Informe<Dato> informeConsola;
    private Informe<Dato> informeGraficos;
    private Informe<Dato> informeTabla;

    public Controlador() {
        dataSource = GestionFactory.crearGestion();
        generarDatos = GenerarDatosFactory.crearGenerarDatos();
        informeConsola = InformeFactory.crearInformeConsola(dataSource);
        informeGraficos = InformeFactory.crearInformeGraficos(dataSource);
        informeTabla = InformeFactory.crearInformeTabla(dataSource);
    }

    public void iniciar() throws InterruptedException {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                List<Dato> datos = generarDatos.generarDatos();
                System.out.println("\nNuevos datos: " + datos.size());
                dataSource.setData(datos);
            }
        }, 0, 5000); 
    }
}
