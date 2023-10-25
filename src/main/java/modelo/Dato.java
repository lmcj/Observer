
package modelo;

import java.util.Arrays;
import java.util.List;

public class Dato {
    private String sensor;
    private double CO2;
    private double NO2;
    private double opacimetro;

    public Dato() {
    }


    public Dato(String sensor, double CO2, double NO2, double opacimetro) {
        this.sensor = sensor;
        this.CO2 = CO2;
        this.NO2 = NO2;
        this.opacimetro = opacimetro;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public double getCO2() {
        return CO2;
    }

    public void setCO2(double CO2) {
        this.CO2 = CO2;
    }

    public double getNO2() {
        return NO2;
    }

    public void setNO2(double NO2) {
        this.NO2 = NO2;
    }

    public double getOpacimetro() {
        return opacimetro;
    }

    public void setOpacimetro(double opacimetro) {
        this.opacimetro = opacimetro;
    }


    public List<Object> toList() {
        return Arrays.asList(sensor, CO2, NO2, opacimetro);
    }
    
}
