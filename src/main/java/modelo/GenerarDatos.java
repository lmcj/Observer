package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerarDatos {

    public List<Dato> generarDatos() {
        Random random = new Random();
        int cantidadDatos = random.nextInt(50);
        List<Dato> datos = new ArrayList<>();
        for (int i = 0; i < cantidadDatos; i++) {
            Dato dato = new Dato();
            int sensor = random.nextInt(4);
            switch (sensor) {
                case 0 -> dato.setSensor("PlantaEntradaNorte-TipoUno");
                case 1 -> dato.setSensor("PlantaEntradaNorte-TipoDos");
                case 2 -> dato.setSensor("PlantaEntradaNorte-TipoTres");
                case 3 -> dato.setSensor("PlantaEntradaNorte-TipoCuatro");
            }
            dato.setCO2(random.nextDouble());
            dato.setNO2(random.nextDouble());
            dato.setOpacimetro(random.nextDouble() * 10);
            datos.add(dato);
        }
        return datos;
    }
}
