package Observatorio;

import java.util.Comparator;
import java.util.Objects;

public class Observacion implements Comparable<Observacion> {

    private Double latitud;
    private String latitudHemisferio;
    private Double longitud;
    private String longitudHemisferio;
    private String mesDeObservacion;
    private Double desplazamiento;

    public Observacion(Double latitud, String latitudHemisferio, Double longitud, String longitudHemisferio,String mesDeObservacion) {
        this.latitud = latitud;
        this.latitudHemisferio = latitudHemisferio;
        this.longitud = longitud;
        this.longitudHemisferio = longitudHemisferio;
        this.mesDeObservacion = mesDeObservacion;
        this.desplazamiento= 0.0;
    }
    public String obtenerPosicion() {
        return latitud + "° " + latitudHemisferio + ", " + longitud + "° " + longitudHemisferio;
    }
    public double calculardesplazamiento(Observacion otraObservacion) {
        double deltaLat = Math.abs(this.latitud - otraObservacion.latitud);
        double deltaLong = Math.abs(this.longitud - otraObservacion.longitud);
        return Math.sqrt(deltaLat * deltaLat + deltaLong * deltaLong);
    }
    private void asignarDesplazamiento(double valor) {
        this.desplazamiento = valor;
    }

    public double getDesplazamiento() {
        return desplazamiento;
    }

    public void setMesDeObservacion(String mes) {
        this.mesDeObservacion = mes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Observacion that = (Observacion) o;
        return Objects.equals(latitud, that.latitud)
                && Objects.equals(latitudHemisferio, that.latitudHemisferio)
                && Objects.equals(longitud, that.longitud)
                && Objects.equals(longitudHemisferio, that.longitudHemisferio)
                && Objects.equals(mesDeObservacion, that.mesDeObservacion)
                && Objects.equals(desplazamiento, that.desplazamiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitud, latitudHemisferio, longitud, longitudHemisferio, mesDeObservacion, desplazamiento);
    }

    @Override
    public String toString() {
        return "observación: " + obtenerPosicion() + " en " + mesDeObservacion;
    }
    @Override
    public int compareTo(Observacion otra) {
        if (this.latitud == null && otra.latitud == null) return 0;
        if (this.latitud == null) return 1;   // los nulos al final
        if (otra.latitud == null) return -1;
        return this.latitud.compareTo(otra.latitud);

    }
    public static Comparator<Observacion> comparadorPorMes = new Comparator<Observacion>() {
        @Override
        public int compare(Observacion o1, Observacion o2) {
            return Objects.compare(o1.mesDeObservacion, o2.mesDeObservacion, String::compareTo);
        }

    };
}