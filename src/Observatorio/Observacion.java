package Observatorio;
public class Observacion {
    private Double latitud;
    private String latitudHemisferio;
    private Double longitud;
    private String longitudHemisferio;
    private String mesDeObservacion;
    private Double desplazamiento;

    public Observacion(Double latitud, String latitudHemisferio, Double longitud, String longitudHemisferio) {
        this.latitud = latitud;
        this.latitudHemisferio = latitudHemisferio;
        this.longitud = longitud;
        this.longitudHemisferio = longitudHemisferio;
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

    @Override
    public String toString() {
        return "observación: " + obtenerPosicion() + " en " + mesDeObservacion;

    }
}